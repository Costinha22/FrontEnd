package FichadeTrabalho_01;

import java.util.Scanner;

public class Exercicio15 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //Entrada de dados
        System.out.println("Insira um valor:");
        int valor = input.nextInt();

        int notas = 0;


        //condiçao

        if (valor %5 == 0){

            //notas 200
            notas = valor/200;
            System.out.println("Notas de 200: " + notas);
            valor = valor%200;


            //notas 100
            notas = valor/100;
            System.out.println("Notas de 100: " +notas);
            valor = valor%100;


            //notas 50
            notas = valor/50;
            System.out.println("Notas de 50: " +notas);
            valor = valor%50;

            //notas 20
            notas = valor/20;
            System.out.println("Notas de 20: " +notas);
            valor = valor%20;


            //notas 10

            notas = valor/10;
            System.out.println("Notas de 10: " +notas);
            valor = valor%10;


            //notas 5
            notas = valor/5;
            System.out.println("Notas de 5: " +notas);
            valor = valor%5;


        }else{
            System.out.println("Não é múltiplo e 5");
        }






    }
}
