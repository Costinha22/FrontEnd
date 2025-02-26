@extends('layouts.fe_layout')
@section('content')
    <h5>Nome da Tarefa: {{ $ourTask->name }}</h5>
    <form method="POST" action="{{ route('tasks.update') }}" class="my-5">
        @csrf
        <input type="hidden" name="id" value="{{ $ourTask->id }}">
        <div class="form-group">
            <label for="exampleInputEmail1" class="fw-bold my-2">Nome da Tarefa:</label>
            <input type="texto" name='name' class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                placeholder="Coloque a tarefa" value="{{ $ourTask->name }}" required>
            @error('name')
                <div class="invalid-feedback">
                    Erro no nome da tarefa
                </div>
            @enderror
            <div class="form-group">
                <label for="exampleInputPassword1" class="fw-bold my-2">Descrição:</label>
                <input type="textarea" name='description' value="{{ $ourTask->description }}" class="form-control"
                    id="exampleInputPassword1" placeholder="Descrição" required>
                @error('description')
                    <div class="invalid-feedback">
                        Erro na descrição
                    </div>
                @enderror
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1" class="fw-bold my-2">Data:</label>
                <input type="date" name='due_at' value="{{ $ourTask->due_at }}" class="form-control">
                @error('due_at')
                    <div class="invalid-feedback">
                        Erro na data
                    </div>
                @enderror
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1" class="fw-bold my-2">ID do Responsável da Tarefa:</label>
                <div class="mb-3 dropdown">

                    <select name="user_id" id="" class="form-select">
                        @foreach ($users as $user)
                            <option @if ($user->id == $ourTask->user_id) selected @endif value="{{ $user->id }}">
                                {{ $user->name }}
                            </option>
                        @endforeach
                    </select>
                    @error('user_id')
                        <div class="invalid-feedback">
                            Erro no Responsável da Tarefa
                        </div>
                    @enderror

                </div>
            </div>

        </div>
        <button type="submit" class="btn btn-primary">Actualizar</button>
    </form>
@endsection
