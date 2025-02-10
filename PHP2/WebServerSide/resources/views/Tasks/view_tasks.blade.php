@extends('layouts.fe_layout')
@section('content')
    <h6>Utilizador: {{ $tasksFromDB->name }}</h6>
    <p>Nome:{{ $tasksFromDB->name }}</p>
    <p>Morada: {{ $tasksFromDB->description }}</p>
    <p>Nif: {{ $tasksFromDB->status }}</p>
@endsection
 
 