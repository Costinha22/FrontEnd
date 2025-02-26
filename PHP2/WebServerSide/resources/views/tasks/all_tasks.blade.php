@extends('layouts.fe_layout')
@section('content')
    <h3>Tasks vindas da BD</h3>
    <table class="table">
        <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Nome</th>
                <th scope="col">Estado</th>
                <th scope="col">Data Conclusão</th>
                <th scope="col">User</th>
                <th></th>
                <th></th>
            </tr>
        </thead>
        <tbody>
            @foreach ($tasksFromDB as $task)
                <tr>
                    <th scope="row">{{ $task->id }}</th>
                    <td>{{ $task->name }}</td>
                    <td>{{ $task->status }}</td>
                    <td>{{ $task->due_at }}</td>
                    <td>{{ $task->user_name }}</td>
                    <td><a href="{{ route('tasks.view', $task->id) }}" class="btn btn-info">Ver / Editar</a></td>
                    <td><a href="{{ route('tasks.delete', $task->id) }}" class="btn btn-danger">Apagar</a></td>
                </tr>
            @endforeach
        </tbody>
    </table>
@endsection
