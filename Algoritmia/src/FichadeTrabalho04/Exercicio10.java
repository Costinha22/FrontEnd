package FichadeTrabalho04;

import java.util.Scanner;

public class Exercicio10 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int [3][5];
        int numeroigual, contador=0;


        //pedir ao user para preencher a matriz
        for ( int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){

                System.out.println("Insira um valor[" + linha + "]" + "[" + coluna+ "]");
                matriz [linha] [coluna] = input.nextInt();

            }

        }




        //pesquisar numero igual

        System.out.println("Qual é o número que quer pesquisar? :");

        numeroigual= input.nextInt();
        for(int linha =0; linha< matriz.length; linha++){

            for (int coluna = 0; coluna < matriz.length; coluna++){

                if(numeroigual==matriz[linha][coluna]){
                    contador++;
                    System.out.println("Econtrei seu numero" +numeroigual);

                }


            }

        }

        System.out.println("o seu numero igual é" + numeroigual+"foi encontrado" + contador +"vezes");


    }

}
