package FichadeTrabalho_01;

import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);



   //Variáveis
   int valor1input, valor2input, resultado;



   // Pedir input user
        System.out.println("Insira o 1ª valor:");
        valor1input = input.nextInt();

        System.out.println("Insira o 2ª valor:");
        valor2input = input.nextInt();



// Condiçao + verificar o maior numero
if (valor1input > valor2input) {
    System.out.println("Maior número" + valor1input );
    } else {

    System.out.println("Maior número:" + valor2input);
    }
















    }




}
