package FichadeTrabalho04;

import java.util.Scanner;

public class Exercicio09 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //matriz de 5*5

        int [][] matriz = new int[5][5];
        int soma = 0;



            for (int linha = 0; matriz.length< 5; linha++) {
                for(int colunas = 0; colunas < matriz.length;colunas++){

                    System.out.println("Insira um valor[" + linha + "]" + "[" + colunas+ "]");
                matriz[linha][linha] = input.nextInt();
                soma += matriz[linha][colunas];


            }
                System.out.println("A soma total é =" + soma);
        }
    }
}