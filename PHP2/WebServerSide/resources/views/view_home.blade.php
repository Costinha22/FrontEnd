
@extends('layouts.fe_layout')


    @section('content')
    
    <h1>Welcome</h1>

    <img src="{{asset('images/imagem1.jpeg')}}" alt="">


    
  

    <ul>
        <li><a href="{{ route('users.all') }}">Todos os Users</a></li>
        <li> <a href="{{route('welcome')}}">Welcome Page</a> </li>
        <li><a href="{{route('hello')}}">Hello</a> </li>
        <li><a href="{{route('add.user')}}">Adicionar User</a></li>
        <li><a href="{{route('tasks')}}">Tarefas</a></li>
        <li><a href="{{route('add.tasks')}}"> Adicionar tarefas</a></li>

    
    </ul>
   
    @endsection

