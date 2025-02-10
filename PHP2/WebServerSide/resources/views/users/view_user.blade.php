@extends('layouts.fe_layout')
@section('content')
    <h6>Utilizador: {{ $ourUser->name }}</h6>
    <p>Nome:{{ $ourUser->name }}</p>
    <p>Morada: {{ $ourUser->address }}</p>
    <p>Nif: {{ $ourUser->nif }}</p>
@endsection
 
 