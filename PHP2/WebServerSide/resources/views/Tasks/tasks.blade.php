@extends('layouts.fe_layout')
 
@section('content')
    <h2>Tarefas dos Alunos</h2>
 
    @foreach ($tasks as $task)
    <li>{{$task['name']}}: {{$task['task']}}</li>
    @endforeach
 
    <br>
    <h3>Lista de tarefas disponíveis: </h3>
    <ul>
        @foreach ($availableTasks as $individualTask)
        <li>{{$individualTask}} </li>
        @endforeach
    </ul>
 
@endsection