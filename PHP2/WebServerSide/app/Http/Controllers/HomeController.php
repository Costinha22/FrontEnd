<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class HomeController extends Controller
{
    public function returnViewHome(){
        $myVar = 'Hello World';
        $myName = 'Sara';

        $shoppingList = ['batatas', 'feijões', 'chocolate'];

        $contactInfo= [
            'name'=>'Sara',
            'email' =>'Sara@gmail.com'
        ];

        return view('view_home', compact('myVar', 'myName', 'shoppingList', 'contactInfo'));
    }
}
