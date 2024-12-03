package FichadeTrabalho04;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //matriz 3*3 --> int

        int[][] matriz = new int[3][3];



        // input do utilizador

        for(int linha = 0; linha < 3; linha++ ){

            for (int coluna = 0; coluna <3;coluna++){
                System.out.println("Insira um valor[" + linha +"]" +"["+ coluna + "]");
                matriz[linha][coluna] = input.nextInt();

            }

        }


        // imprimir na consola

        for(int linha = 0 ; linha <3;linha ++) {
            int coluna;
            for (coluna = 0; coluna < 3; coluna++) ;

            System.out.print(matriz[linha][coluna] + " ");

        }
        System.out.println();




    }

}
