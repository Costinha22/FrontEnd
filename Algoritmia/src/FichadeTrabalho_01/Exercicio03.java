package FichadeTrabalho_01;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        //chamar a biblioteca
Scanner input = new Scanner(System.in);


       double salario;
       double imposto;


       //pedir ao user o salario
        System.out.println("Insira o seu salario");
        salario = input.nextDouble();

        System.out.println("Salario bruto:"+ salario+"$");


        // Condiçao 1 - imposto 20%
        if(salario <= 15000){
            imposto = salario * 0.2;
            salario *= 0.8;
        }


        // Condiçao 2 - imposto 30%
        if (salario >15000 && salario <=20000){
            imposto = salario *0.3;
            salario *=0.7;
        }

        // Condiçao 3 - imposto 35%
        if (salario >20000 && salario <=25000){
            imposto = salario *0.35;
            salario *=0.65;
        } else {
            imposto = salario * 0.40;
            salario *= 0.60;
        }
        System.out.println("Salario após imposto:"+ salario +"$");
        System.out.println("Total de imposto pago:"+ imposto +"$");



        }












    }


