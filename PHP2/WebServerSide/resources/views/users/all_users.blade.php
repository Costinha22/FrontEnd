@extends('layouts.fe_layout')
 
   @section('content')
 
 
   <h1>Todos os Users</h1>
 
  
 
   <h6>Olá {{$myName}}</h6>
 
 
<ul>
    @foreach ($allUsers as $user)
    <li> {{$user['id'] }} - {{ $user['name'] }} : {{$user['email']}}
 
    </li>
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
                     <td><a href="" class="btn btn-info">Ver</a></td>
                     <td><a href="" class="btn btn-danger">Apagar</a></td>
                </tr>
            @endforeach
 
    </table>
 
   @endsection