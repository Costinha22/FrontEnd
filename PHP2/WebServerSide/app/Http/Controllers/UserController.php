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
        $usersFromDB = $this->getUsersFromDB();

        $myTeamLeader = DB::table('users')->where('id',6)->first();

        return view('users.all_users', compact('myName','allUsers', 'usersFromDB'));
    }

    public function returnAddUserView(){

        return view('users.add_user');
    }

    public function insertUserIntoDB(){
        DB::table('users')
        ->insert([
            'name' => 'Raquel',
            'email' => 'Raquel@gmail.com',
            'password' => 'Raquel12345',
        ]);

        return response()->json('user inserido');

    }

    public function updateUserIntoDB(){
        Db::table('users')
        ->where('id', 4)
        ->update([
            'name' =>'Ruben',
            'updated_at' => now()
        ]);

        return response()->json('user actualizado com sucesso');
    }

    public function deleteUserFromDB(){

        DB::table('users')
        ->where('email', 'Sara2@gmail.com')
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

    public function viewUser($id){

        $ourUser = DB::table('users')
        ->where('id', $id)
        ->first();

        return view('users.view_user', compact('ourUser'));

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

    private function getMyVar(){
        $myName = 'Sara';

        return $myName;
    }

    private function getUsers() {
        $users = [
            ['id' => 1, 'name' =>'Sara', 'email' => 'sara@gmail.com'],
            ['id' => 2, 'name' =>'Márcia', 'email' => 'Márcia@gmail.com'],
            ['id' => 3, 'name' =>'bruno', 'email' => 'bruno@gmail.com']
        ];

        return $users;
    }

    private function getUsersFromDB(){
        $usersFromDB =
       User::get();

        return $usersFromDB;
    }


}
