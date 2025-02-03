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
    
    private function getAllTasks(){
        $tasksFromDB = 
        DB::table('tasks')
        ->join ('users', 'users.id','=','tasks.user_id')
        ->select('tasks.*','users.name as user_name')
        ->get();
        

        return $tasksFromDB;
    }
 

 }

