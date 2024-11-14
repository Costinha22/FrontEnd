package FichadeTrabalho_01;

import java.util.Scanner;

public class Exercicio02 {


    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);



        //variáveis

        double salario;
        double imposto1=0.80;
        double imposto2=0.70;

        System.out.println("Insira o valor do salario");

        salario = input.nextDouble();

        double salariofinal;


        //verificar o salario
        if (salario<=15000) {

            salariofinal = salario * imposto1;
            System.out.println("O valor do salario com imposto é:"+salariofinal);

        }
            else {

                salariofinal = salario * imposto2;
            System.out.println("O valor do salario com o imposto é:"+ salariofinal );

            }



        }






    }



