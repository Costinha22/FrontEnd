package FichadeTrabalho04;

import java.util.Scanner;

public class Exercicio12 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

       int[] array1 = new int[3];
       int[] array2 = new int[3];
       int [][] matriz = new int[3][2];


        //ler array 1

for (int i = 0; i< array1.length;i++){

    System.out.println("Insira o valor[ "+ i +"]: ");
    array1[i] = input.nextInt();
    matriz[i] [0] = array1[i];


    }

        System.out.println("Preencha o array 2");

        //ler array 2

        for (int linha = 0; linha <array2.length; linha++){
            System.out.println("Insira o valor[ "+ linha +"]: ");
            array2[linha] = input.nextInt();
            matriz[linha] [1] = array2[linha];

        }

            //preencher matriz

        for (int linha = 0; linha < array2.length; linha ++){

            for (int coluna = 0; coluna < 2 ; coluna++){
                System.out.println("");
            }


        }

    }

}
