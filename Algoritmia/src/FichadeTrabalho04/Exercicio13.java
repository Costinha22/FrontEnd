package FichadeTrabalho04;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[][] matriz = new int[4][4];
        int somaDiagonal = 0;

        //Preencher a Matriz
        for(int linha = 0; linha < matriz.length; linha++){
            for (int coluna = 0; coluna < matriz.length; coluna++){
                System.out.print("Insira os valores: ");
                matriz[linha][coluna] = input.nextInt();
            }
        }
        //Somar os valores da diagnal
        for(int linha = 0; linha < matriz.length; linha++){
            for(int coluna = 0; coluna < matriz.length; coluna++){
                if(linha == coluna){
                    somaDiagonal += matriz[linha][coluna];

                }
            }
        }

        //Imprimir a matriz
        for (int linha = 0; linha < 4; linha++) {
            for (int col = 0; col < 4; col++) {
                System.out.print(matriz[linha][col] + " ");
            }
            System.out.println(" ");
        }

        //Resultado da soma
        System.out.println("Soma da diagonal: " + somaDiagonal);

    }
}