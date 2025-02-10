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

    <table class="table">
        <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Nome</th>
                <th scope="col">Status</th>
                <th scope="col">Data</th>
            </tr>
        </thead>
        <tbody>
            @foreach ($tasksFromDB as $tasks)
                <tr>
                    <th scope="row">{{ $tasks->id }}</th>
                    <td>{{ $tasks->user_name }}</td>
                    <td>{{ $tasks->status }}</td>
                    <td>{{ $tasks->due_dat }}</td>
                     <td>{{ $tasks->description }}</td>
                    <td><a href="{{route('view.tasks',  $tasks->id)}}" class="btn btn-info">Ver</a></td>
                    <td><a href="" class="btn btn-danger">Apagar</a></td>
                </tr>
            @endforeach
 
    </table>
 
@endsection