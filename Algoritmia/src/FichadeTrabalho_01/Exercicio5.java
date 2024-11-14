package FichadeTrabalho_01;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //definir variaveis
        int num1;
        int num2;

        //pedir dois numeros
        System.out.println("Insira o 1º numero");
        num1 = input.nextInt();
        System.out.println("Insira o 2º numero");
        num2 = input.nextInt();


        //condição para verificar qual o maior numero dos 2 numeros

        if (num1 > num2) {
            System.out.println("O maior número é o primeiro:" + num1 );
            System.out.println("O menor número é o segundo:" + num2);
        }
        //condiçao para verificar se os numeros sao iguais
        else if (num1 == num2) {
            System.out.println("Os números são iguais");
        }

        // condição para tudo o resto que não entre nas condições acima
        else{
                System.out.println("O maior número é o segundo:" + num2);
            System.out.println("O menor número é o primeiro:" + num1);
            }

        }


    }

