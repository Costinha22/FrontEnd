<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class HomeController extends Controller
{
 public function returnViewHome(){
    $myVar = 'Hello World';
   
    $myName ='Joao';

    $shoppingList =['batatas', 'feijoes','chocolate'];
    $contactInfo = [
        'name'=>'Joao',
        'email'=>'joaocosta.fed@gmail.com'
    ];

    
    
    return view('view_home', compact ('myVar', 'myName','shoppingList','contactInfo'));
    }
}
