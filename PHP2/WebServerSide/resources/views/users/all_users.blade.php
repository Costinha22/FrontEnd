<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>


    
<h3>Olá aqui vais ter todos os users</h3>
    <h6>Olá {{$myName}}</h6>


    <ul>
        @foreach ($allUsers as $user)

        <ul>
    <li>ID: {{$user['id']}}</li>
    <li>Nome: {{$user['name']}}</li>
    <li>Email: {{$user['email']}}</li>
</ul>
        
        @endforeach

 <li><a href="{{route('users.all')}}">Todos os users</a></li>
</ul>


</html>