package FichadeTrabalho04;

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //tamanho do array 10

        int[] array = new int[10];
        boolean crescente = true;

        // Ciclo para pedir ao utilizador 10 valores

        for (int i = 0; i < array.length; i++) {

            System.out.println("Introduzao valor na gaveta[" + i + "]");
            array[i] = input.nextInt();
        }

        // Verificar se está em ordem crescente

        for (int i = 1; i < array.length; i++) {


            if (array[i] < array[i - 1]) {

                crescente = false;
            }

        }
        if (crescente) {
            System.out.println("Sim está em ordem crescente");

        } else {
            System.out.println("Não está em ordem crescente");


        }

    }
}
