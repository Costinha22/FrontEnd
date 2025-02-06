<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;

class UserController extends Controller
{
  public function returnAllUsersView(){
    $myName = $this->getMyVar();
    $allUsers = $this->getUsers();
    $usersFromDB =$this->getUsersFromDB();
    
    return view('users.all_users', compact('myName','allUsers','usersFromDB'));
    }

 public function returnAllUsersAdded(){
    return view('users.add_user');
    }


    private function getMyVar (){
  $myName = 'Joao';
  return $myName;
  }

private function getUsers(){

$users =[

  ['id'=> 1, 'name'=> 'joao', 'email'=>'joaocosta.fed@gmail.com'],
  ['id'=> 2, 'name'=> 'joao', 'email'=>'joaocosta.fed@gmail.com'],
  ['id'=> 3, 'name'=> 'joao', 'email'=>'joaocosta.fed@gmail.com'] 
];
return $users;
  
}

public function insertUserIntoDB(){
DB::table('users')
->insert([
'name' => 'Joao',
'email'=> 'joaocosta4.fed@gmail.com',
'password'=> 'hulk123',
]);

return response()->json('user inserido');

  }

public function updateUserIntoDB (){
DB:: table ('users')
->where('id',3)
->update([
  'name'=> 'Tiago',
    'updated_at'  => now()
]);
  return response()->json('user atualizado com sucesso');
  }

public function deleteUserFromDB (){
  DB::table('users')
  ->where('email', 'joaocosta3.fed@gmail.com')
  ->delete();
return response()->json('user apagado com sucesso');
  }

private function getUsersFromDB(){
  $usersFromDB = 
  DB::table('users')
  ->get();
  return $usersFromDB;

  }

}

