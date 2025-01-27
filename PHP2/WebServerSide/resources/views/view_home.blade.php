<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
@php
    $myVar = 'hello world';
@endphp

<body>
    <h1>Olá estou em casa</h1>
    <h6>cucu {{ $myVar }}</h6>

    <ul>
        <li><a href="{{ route('users.all') }}">Todos os Users</a></li>
        <li> <a href="{{route('welcome')}}">Welcome Page</a> </li>
        <li><a href="{{route('hello')}}">Hello</a> </li>
        <li><a href="{{route('add.user')}}">Adicionar User</a></li>
    </ul>
</body>

</html>