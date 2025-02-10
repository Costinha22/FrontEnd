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
Route::get('/insert-user-db',[UserController::class, 'insertUserIntoDB']);
Route::get('/update-user-db', [UserController::class, 'updateUserIntoDB']);
Route::get('/delete-user-db',[UserController::class,'deleteUserFromDB']);
Route::get('/delete-user/{id}', [UserController::class, 'deleteUser'])->name('users.delete');
Route::get('/view-user/{id}', [UserController::class, 'viewUser'])->name('users.view');
Route::post('/create-users', [UserController::class, 'createUser'])->name('users.create');
//rota tarefas
Route:: get('/tasks',[TaskController::class, 'getMyTasks'])->name('tasks');
Route::get('/view-tasks/{id}', [TaskController::class, 'viewTasks'])->name('view.tasks');
Route::get('/delete-task/{id}', [TaskController::class, 'deleteTask'])->name('tasks.delete');
Route::get('/add-tasks',[TaskController::class, 'returnAllTasksAdded'])->name('add.tasks');
Route::post('/create-tasks', [TaskController::class, 'createTask'])->name('tasks.create');


