package FichadeTrabalho_01;

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //variaveis
        int num1, num2,num3;



        //Introduçao de dados

        System.out.println("Introduza o primeiro número:");
        num1 =input.nextInt();
        System.out.println("Introduza o segundo número:");
        num2 = input.nextInt();
        System.out.println("Introduza o terceiro número:");
        num3 = input.nextInt();

        //Avaliar condiçoes

        if (num1<num2 && num1 < num3){

            System.out.println("O menor número é:"+num1);
        } else if ( num2< num1 && num2< num3) {
            System.out.println("O menor número é:" +num2);
        }else{
            System.out.println("O menor número é:" + num3);
        }


    }




}
