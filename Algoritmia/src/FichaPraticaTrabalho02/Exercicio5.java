package FichaPraticaTrabalho02;

import java.util.Scanner;

public class Exercicio5 {

    public static void main(String[] args) {


        Scanner inpunt = new Scanner(System.in);


        System.out.println("Insira o primeiro numero: ");
        int num1 = inpunt.nextInt();

        System.out.println("Insira o segundo numero");
        int num2 = inpunt.nextInt();

        for (int i = num1; i >= num1 && i <= num2; i++) {

            System.out.println(i);

        }


    }
}