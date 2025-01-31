<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\UserController;
use App\Http\Controllers\HomeController;
use App\Http\Controllers\TaskController;

Route::get('/', function () {
    return view('welcome');
})->name('welcome');


Route::get('/hello', function(){
    return '<h1>Olá Turma de Front ENd</h1>';
})->name('hello');

Route::get('/home',[HomeController::class, 'returnViewHome'] )->name('home');



Route::get('/hello/{name}', function($name){
    return '<h1>Olá '.$name.'</h1>';
});

Route::fallback(function(){
    return "<h1>Não fujas, volta <a href=".route('hello')." >aqui</a></h1>";
});

//rotas de users
Route:: get('/addusers',[UserController::class, 'returnAllUsersAdded'] ) -> name("add.user");
Route::get('/users',[UserController::class, 'returnAllUsersView'] )->name('users.all');

//rota tarefas
Route:: get('/tasks',[TaskController::class, 'getMyTasks'])->name('tasks');