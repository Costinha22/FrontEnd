package FichadeTrabalho_01;

import java.util.Scanner;

public class Exercicio7 {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //definir variaveis
        int num1;


        //pedir ao utilizador para inserir 1 número
        System.out.println("Insira o primeiro número");
        num1 = input.nextInt();


        // verificar se o número é par ou ímpar, para saber isso é preciso divir um numero por /2

        if ( num1 %2 ==0){
            System.out.println("O número é par");
        }
        else {
            System.out.println("O número é impar" );
        }









    }


}





