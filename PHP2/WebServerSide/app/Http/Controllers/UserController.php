<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\DB;
use Illuminate\Support\Facades\Hash;
use App\Models\User;

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

  public function deleteUser($id){
        DB::table('tasks')
        ->where('user_id', $id)
        ->delete();
 
 
        DB::table('users')
        ->where('id', $id)
        ->delete();
 
        return back();
    }

    public function viewUser($id){
      $ourUser = DB::table ('users')
      ->where ('id',$id)
      ->first ();
      return view ('users.view_user', compact ('ourUser'));
    }

     public function updateUser(Request $request){
        $request->validate([
             'name' => 'required'
            ]);
 
 
        Db::table('users')->where('id', $request->id)
        ->update([
            'name' =>$request->name,
            'address' =>$request->address,
            'nif' =>$request->nif,
            'updated_at' => now(),
        ]);
 
        return redirect()->route('users.all')->with('message', 'Utilizador actualizado com sucesso!');
 
    }
   
public function createUser(Request $request){
        $request->validate([
            'name'=> 'required|string|max:50',
            'email'=> 'required|email|unique:users',
            'password' =>'required|min:8'
        ]);
 
        User::insert([
            'name' => $request->name,
            'email' =>$request->email,
            'password' =>Hash::make($request->password),
        ]);
 
        return redirect()->route('users.all')->with('message', 'Utilizador adicionado com sucesso!');
 
    }
private function getUsersFromDB(){
  $usersFromDB = 
  DB::table('users')
  ->get();
  return $usersFromDB;

  }

}


