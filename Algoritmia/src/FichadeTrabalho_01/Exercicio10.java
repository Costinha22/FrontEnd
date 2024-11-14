package FichadeTrabalho_01;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        //Define as Variaveis



        // Entrada dos dados que são 2 numeros reais (double)

        System.out.print("Insira  um número:");

        double num1 = input.nextDouble();
        System.out.print("Insira um número");

        double num2 = input.nextDouble();
        System.out.print("Insira o tipo de opreação que deseja fazer\n (Use apena(+,-,/,* " );
        String operadorAritmetico =input.next();

        double resultado;

       // Menu de seleção (usamos o switch)2

        switch (operadorAritmetico){

            case "+":
                resultado = num1+num2;
                System.out.println("Resultado = "+resultado);
                  break;

            case "-":
             resultado = num1 - num2;
                System.out.println("Resultado= "+resultado);
                break;

            case "/":
                resultado = num1/num2;
                    System.out.println("Resultado = "+resultado);
                    break;

            case "*":
                resultado = num1/num2;
                System.out.println("Resultado = "+resultado);
                break;


        }






    }

}
