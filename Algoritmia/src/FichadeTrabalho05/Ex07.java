package FichadeTrabalho05;

import java.util.Scanner;

public class Ex07 {

    public static void desenharQuadrado(String caracter,int linha, int coluna ) {


        int[][] matriz = new int[linha][coluna];

        //Criar um ciclo para preencher a matriz e imprir o quadrado
        for(int linhaMatriz = 0; linhaMatriz < linha; linhaMatriz++){
            //Preencher colunas
            for(int colunaMatriz = 0; colunaMatriz < coluna; colunaMatriz++){
                //Regra para preencher em formato de quadrado
                if(linhaMatriz == 0 || colunaMatriz == 0 ||linhaMatriz == linha - 1||colunaMatriz == coluna - 1 ){
                    System.out.print(caracter);
                }else {
                    //Prencher com espaços vazios o meio do quadrado
                    System.out.print(" ");
                }
            }
            //Saltar a linha
            System.out.println();
        }


    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String caracterUser;
        int linhaUser, colunaUser;

        System.out.println("Vamos fazer um quadrado ?!");
        System.out.print("Insira uma carcter: ");
        caracterUser = input.next();

        System.out.print("Insira o número de Linhas: ");
        linhaUser = input.nextInt();
        System.out.print("Insira o número de colunas: ");
        colunaUser = input.nextInt();

        desenharQuadrado(caracterUser,linhaUser,colunaUser);

    }


}