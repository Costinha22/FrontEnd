<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class TaskController extends Controller
{
    public function getMyTasks(){

        $tasks=[
        ['name'=> 'Rita', 'task' => 'estudar laravel'],
       ['name'=> 'João', 'task' => 'estudar Mysql'],
        ];

        $availableTasks=['sql', 'js', 'Java', 'POO'];

         return view('tasks.tasks', compact ('tasks', 'availableTasks'));
    }
    
}

