<?php

namespace App\Http\Controllers;

use App\Models\Task;
use Illuminate\Http\Request;
use App\Http\Resources\TaskResource;


class TaskAPIController extends Controller
{
    /**
     * Display a listing of the resource.
     */
    public function index()
    {
        return Task::paginate();
    }

    /**
     * Show the form for creating a new resource.
     */
    public function create()
    {
        //
    }

    /**
     * Store a newly created resource in storage.
     */
     public function store(Request $request)
    {
        $request->validate([
            'name' => 'required',
            'description' => 'required',
            'user_id' => 'required',
        ]);
 
        Task::create($request->all());
 
        return response()->json('tarefa inserida');
 
    }

    /**
     * Display the specified resource.
     */
 public function show(Task $task) : TaskResource
    {
        return new TaskResource($task);
    }

    /**
     * Show the form for editing the specified resource.
     */
    public function edit(string $id)
    {
        //
    }

    /**
     * Update the specified resource in storage.
     */
   public function update(Request $request, Task $task)
    {
        Task::update($request->all());
        return response()->json('tarefa actualizada');
    }
    /**
     * Remove the specified resource from storage.
     */
    public function destroy(Task $task)
    {
        $task->delete();
        return response()->json('tarefa apagada com sucesso');
    }

}
