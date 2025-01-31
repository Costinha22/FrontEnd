<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UserController extends Controller
{
  public function returnAllUsersView(){
    $myName = $this->getMyVar();
    $allUsers = $this->getUsers();
    
    return view('users.all_users', compact('myName','allUsers'));
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





  }
