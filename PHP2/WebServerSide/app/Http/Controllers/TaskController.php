<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class TaskController extends Controller
{
    public function getMyTasks(){

        $tasks=[
        ['name'=> 'Rita', 'task' => 'estudar laravel'],
       ['name'=> 'João', 'task' => 'estudar Mysql'],
        ];

        $availableTasks=['sql', 'js', 'Java', 'POO'];
        $tasksFromDB=$this->getAllTasks();

         return view('tasks.tasks', compact ('tasks', 'availableTasks', 'tasksFromDB'));
    }
     
    public function returnAllTasksAdded(){
    return view('tasks.add_tasks');
    }

    private function getAllTasks(){
        $tasksFromDB = 
        DB::table('tasks')
        ->join ('users', 'users.id','=','tasks.user_id')
        ->select('tasks.*','users.name as user_name')
        ->get();
        

        return $tasksFromDB;
    }
 
     public function viewTasks($id){
      $tasksFromDB = DB::table ('tasks')
      ->join('users', 'tasks.user_id','users.id')
      ->where ('tasks.id',$id)
      ->select('tasks.*', 'users.name as user_name')
      ->first ();
      return view ('tasks.view_tasks', compact ('tasksFromDB'));
    }

      public function deleteTask($id){
        DB::table('tasks')
        ->where('id', $id)
        ->delete();
            return back ();

 }


    
public function createTask(Request $request){
        $request->validate([
            'name'=> 'required|string|max:50',
            'description'=> 'required|string|max:50',
            'user_id' =>'required'
        ]);
 
        
        Task:: insert([
          'name' => $request->name,
          'description' =>$request->description,
          'user_id'=> $request->user_id
        ]);
          return redirect()->route('tasks')->with('message', 'Tarefa adicionada com sucesso!');
    }
}