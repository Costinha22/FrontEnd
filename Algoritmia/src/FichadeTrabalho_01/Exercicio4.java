package FichadeTrabalho_01;

import java.util.Scanner;

public class Exercicio4 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //ler um valor
        System.out.println("Insira a posição do piloto: ");
        int posiçao = input.nextInt();


        switch (posiçao){

            case 1:
                System.out.println("Parabéns somou 10 pontos");
                break;

            case 2:
                System.out.println("Parabéns somou 8 pontos");
                break;


                case 3:
                System.out.println("Parabéns somou 6 pontos");
                break;

            case 4:
                System.out.println("Parabéns somou 5 pontos");
                break;

            case 5:
                System.out.println("Parabéns somou 4 pontos");
                break;

            case 6:
                System.out.println("Parabéns somou 3 pontos");
                break;


            case 7:
                System.out.println("Parabéns somou 2 pontos");
                break;


            case 8:
                System.out.println("Parabéns somou 1 pontos");
                break;
            default:
                System.out.println("Que pena não somou nada, precisa ser mais rápido na próxima!");

        }






    }


}

