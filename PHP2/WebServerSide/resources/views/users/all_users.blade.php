@extends('layouts.fe_layout')
@section('content')
    @if (session('message'))
        <div class="alert alert-success">
            {{ session('message') }}
        </div>
    @endif

    <h3>Olá aqui vais ter todos os users em dummy content sem ser da Base de Dados</h3>
    <h6>olá {{ $myName }}</h6>
    <ul>
        @foreach ($allUsers as $user)
            <li>{{ $user['id'] }} - {{ $user['name'] }} : {{ $user['email'] }} </li>
        @endforeach
    </ul>

    <h3>Users vindos da BD</h3>
    <table class="table">
        <thead>
            <tr>
                <th scope="col">#</th>
                <th scope="col">Nome</th>
                <th scope="col">Email</th>
                <th scope="col">Morada</th>
                <th scope="col"></th>
                <th scope="col"></th>
            </tr>
        </thead>
        <tbody>
            @foreach ($usersFromDB as $user)
                <tr>
                    <th scope="row">{{ $user->id }}</th>
                    <td>{{ $user->name }}</td>
                    <td>{{ $user->email }}</td>
                    <td>{{ $user->address }}</td>
                    <td><a href="{{ route('users.view', $user->id) }}" class="btn btn-info">Ver / Editar</a></td>
                    <td><a href="{{ route('users.delete', $user->id) }}" class="btn btn-danger">Apagar</a></td>
                </tr>
            @endforeach

    </table>
@endsection
