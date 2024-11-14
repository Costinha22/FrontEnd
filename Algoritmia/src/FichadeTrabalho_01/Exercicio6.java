package FichadeTrabalho_01;

import java.util.Scanner;

public class Exercicio6 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //definir variaveis
        int num1, num2;


        // inserir dados
        System.out.println("Insira um número");
        num1 = input.nextInt();

        System.out.println("Insira o segundo numero");
        num2 = input.nextInt();

        //Condiçoes
        if (num1 > num2) {
            System.out.println(num1 + " " + num2);
        } else if (num2 > num1) {
            System.out.println(num2 + " " + num1);
        } else {
            System.out.println("Números iguais");
        }


    }


}
