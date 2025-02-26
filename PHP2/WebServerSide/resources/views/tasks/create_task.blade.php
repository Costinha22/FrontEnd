@extends('layouts.fe_layout')

@section('content')
    <h2 class="display-4 mt-3 fw-bold">Adicione uma nova Tarefa</h2>
    <form method="POST" action="{{ route('tasks.create') }}" class="my-5">
        @csrf
        <div class="form-group">
            <label for="exampleInputEmail1" class="fw-bold my-2">Nome da Tarefa:</label>
            <input type="texto" name='name' class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp"
                placeholder="Coloque a tarefa" required>
            @error('name')
                <div class="invalid-feedback">
                    Erro no nome da tarefa
                </div>
            @enderror
            <div class="form-group">
                <label for="exampleInputPassword1" class="fw-bold my-2">Descrição:</label>
                <input type="textarea" name='description' class="form-control" id="exampleInputPassword1"
                    placeholder="Descrição" required>
                @error('description')
                    <div class="invalid-feedback">
                        Erro na descrição
                    </div>
                @enderror
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1" class="fw-bold my-2">ID do Responsável da Tarefa:</label>
                <div class="mb-3 dropdown">

                    <select name="user_id" id="" class="form-select">
                        @foreach ($users as $user)
                            <option value="{{ $user->id }}">{{ $user->name }}</option>
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
        <button type="submit" class="btn btn-primary">Submit</button>
    </form>
@endsection
