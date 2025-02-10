<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
    @extends ('layouts.fe_layout')
    @section('content')
 <form method="POST" action="{{ route('add.tasks') }}">
        @csrf
<form>
  <div class="form-row">
    <div class="form-group col-md-6">
      <label for="inputEmail4">Nome</label>
      <input type="text" class="form-control" id="inputEmail4" >
    </div>
    <div class="form-group col-md-6">
      <label for="inputPassword4">Descriçao</label>
      <input type="text" class="form-control" id="inputPassword4" >
    </div>

    <div class="form-group col-md-4">
      <label for="inputState">User_ID</label>
      <select id="inputState" class="form-control">
        <option selected>Choose...</option>
        <option>...</option>
      </select>
  </div>
  <div class="form-group">
  </div>
  <button type="submit" class="btn btn-primary">Sign in</button>
</form>
@endsection
 
</body>
</html>