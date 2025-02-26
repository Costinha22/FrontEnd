@extends('layouts.fe_layout')

@section('content')
    <h1>Olá estou em casa</h1>
    <img class="my-image" src="{{ asset('images/what-is-software-CA-Capterra-Header.png') }}" alt="">
    <h6>{{ $myVar }}</h6>

    <h6>Olá {{ $myName }}</h6>
    <h6>A lista de compras tem {{ $shoppingList[2] }}</h6>

    <ul>
        @foreach ($shoppingList as $item)
            <li>O item é: {{ $item }}</li>
        @endforeach
    </ul>

    <h6>O nome é {{ $contactInfo['name'] }} e o contacto é {{ $contactInfo['email'] }}</h6>

    <ul>
        <li><a href="{{ route('users.all') }}">Todos os Users</a></li>
        <li> <a href="{{ route('welcome') }}">Welcome Page</a> </li>
        <li><a href="{{ route('hello') }}">Hello</a> </li>
        <li><a href="{{ route('users.add') }}">Adicionar Utilizador</a> </li>
        <li><a href="{{ route('tasks.all') }}">Tarefas</a></li>
    </ul>
@endsection
