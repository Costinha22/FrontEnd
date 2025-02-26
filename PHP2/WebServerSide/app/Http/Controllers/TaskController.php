<?php

namespace App\Http\Controllers;

use App\Models\User;
use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class TaskController extends Controller
{
    public function returnAllTasksView(){
        $tasksFromDB = $this->getAllTasks();


        return view('tasks.all_tasks', compact('tasksFromDB'));
    }

    public function updateTask(Request $request){
        $request->validate([
            'name' => 'required',
            'user_id' => 'required',
        ]);

        Db::table('tasks')->where('id', $request->id)
        ->update([
            'name' => $request->name,
            'description' => $request->description,
            'user_id' => $request->user_id,
            'due_at' => $request->due_at,
            'updated_at' => now(),
        ]);

        return redirect()-> route('tasks.all') -> with('message', 'A tarefa foi actualizada com sucesso!');

    }

    private function getAllTasks(){
        $tasks = DB::table('tasks')
        ->join('users', 'users.id','=', 'tasks.user_id')
        ->select('tasks.*', 'users.name as user_name')
        ->get();

        return $tasks;
    }

    public function deleteTask($id){

        DB::table('tasks')
        ->where('id', $id)
        ->delete();

        return back();
    }

    public function viewTask($id){
        $ourTask = DB::table('tasks')
        ->join('users', 'tasks.user_id', 'users.id')
        ->where('tasks.id', $id)
        ->select('tasks.*', 'users.name as user_name')
        ->first();

        $users = db::table('users')->get();

        return view('tasks.view_task', compact('ourTask', 'users'));

    }

    public function addTask(){
        $users = db::table('users')->get();
        return view('tasks.create_task', compact('users'));
    }

    public function createTask(Request $request){
        $request ->validate([
            'name' => 'required|string|max:50',
            'description' => 'required|string|max:100',
            'user_id' => 'required|numeric'
        ]);

        DB::table('tasks')
        ->insert([
            'name' => $request ->name,
            'description' => $request ->description,
            'user_id' =>$request -> user_id,
        ]);

        return redirect() -> route('task') -> with('message', 'A tarefa foi adicionada com sucesso!');

    }
}
