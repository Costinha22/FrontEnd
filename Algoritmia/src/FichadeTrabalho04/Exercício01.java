package FichadeTrabalho04;

import java.util.Scanner;

public class Exercício01 {

    public static void main(String[] args) {


         Scanner input  = new Scanner(System.in);


         //criar um vetor
        int[] vetor = new int[10];

        int contador = 0;


        //imprimir + ciclo

        for(int i = 0; i<10;i++) {
            contador++;
            System.out.println("Insira um número no array  [ "+contador+"]:");

            vetor[i] = input.nextInt();

        }









    }




}
