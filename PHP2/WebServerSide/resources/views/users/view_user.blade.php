@extends('layouts.fe_layout')
@section('content')
    <h6>Utilizador: {{ $ourUser->name }}</h6>
    <form method="POST" action="{{ route('users.update') }}">
        @csrf
        <input type="hidden" name="id" value="{{ $ourUser->id }}">
        <div class="mb-3">
            <label for="exampleInputEmail1" class="form-label">Nome</label>
            <input required name="name" type="text" class="form-control" id="exampleInputEmail1"
                value="{{ $ourUser->name }}" aria-describedby="emailHelp">
            @error('name')
                erro nome
            @enderror
        </div>
        <div class="mb-3">
            <label class="form-label">Morada</label>
            <input name="address" type="text" class="form-control" value="{{ $ourUser->address }}">
            @error('address')
                erro morada
            @enderror
        </div>
        <div class="mb-3">
            <label class="form-label">Nif</label>
            <input name="nif" type="text" class="form-control" value="{{ $ourUser->nif }}">
            @error('nif')
                erro nif
            @enderror
        </div>



        <button type="submit" class="btn btn-primary">Actualizar</button>
    </form>
@endsection
