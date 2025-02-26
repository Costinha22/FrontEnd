<?php

use App\Http\Controllers\HomeController;
use App\Http\Controllers\TaskController;
use App\Http\Controllers\UserController;
use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('welcome');
})->name('welcome');


Route::get('/hello', function(){
    return '<h1>Olá Turma de Front ENd</h1>';
})->name('hello');

Route::get('/home', [HomeController::class, 'returnViewHome'])->name('home');


//rotas de users
Route::get('/users',[UserController::class, 'returnAllUsersView'])->name('users.all');
Route::get('/add-users', [UserController::class, 'returnAddUserView'])->name('users.add');
Route::get('/insert-user-db', [UserController::class, 'insertUserIntoDB']);
Route::get('/update-user-db', [UserController::class, 'updateUserIntoDB']);
Route::get('/delete-user-db', [UserController::class, 'deleteUserFromDB']);
Route::get('/delete-user/{id}', [UserController::class, 'deleteUser'])->name('users.delete');
Route::get('/view-user/{id}', [UserController::class, 'viewUser'])->name('users.view');
Route::post('/create-users', [UserController::class, 'createUser'])->name('users.create');
Route::post('/update-user', [UserController::class, 'updateUser'])->name('users.update');


//rotas de tasks
Route::get('/tasks',[TaskController::class, 'returnAllTasksView'])->name('tasks.all');

Route::get('/delete-task/{id}', [TaskController::class, 'deleteTask'])->name('tasks.delete');
Route::get('/view-task/{id}', [TaskController::class, 'viewTask'])->name('tasks.view');

Route::get('/add-task', [TaskController::class, 'addTask'])->name('tasks.add');
Route::post('/create-task', [TaskController::class, 'createTask'])->name('tasks.create');
Route::post('/update-task', [TaskController::class, 'updateTask'])->name('tasks.update');



Route::get('/hello/{name}', function($name){
    return '<h1>Olá '.$name.'</h1>';
});

Route::fallback(function(){
    return "<h1>Não fujas, volta <a href=".route('hello')." >aqui</a></h1>";
});
