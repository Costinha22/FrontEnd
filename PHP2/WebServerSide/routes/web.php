<?php

use Illuminate\Support\Facades\Route;

Route::get('/', function () {
    return view('welcome');
})->name('welcome');


Route::get('/hello', function(){
    return '<h1>Olá Turma de Front ENd</h1>';
})->name('hello');

Route::get('/home', function(){
    return view('view_home');
})->name('home');

Route::get('/users', function(){
    return view('users.all_users');
})->name('users.all');


Route::get('/hello/{name}', function($name){
    return '<h1>Olá '.$name.'</h1>';
});

Route::fallback(function(){
    return "<h1>Não fujas, volta <a href=".route('hello')." >aqui</a></h1>";
});

Route:: get('/addusers', function(){
    return view("users.add_user");
});