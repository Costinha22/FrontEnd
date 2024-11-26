package FichadeTrabalho_03;

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {


        //Scanner - dois jogadores
        Scanner inputPlayer = new Scanner(System.in);


        System.out.println("Jogador 1");
        System.out.println( "Insira um número de 0 a 100");
        int jogador1 = inputPlayer.nextInt();
        int tentativas = 0;
        int jogador2 = inputPlayer.nextInt();

        // ciclo do jogo

        do{
            System.out.println("Jogador 2");
            System.out.println("jogador 2 é a sua vez, tente acertar o número");


            //indicar se for maior
            if (jogador1 > jogador1){
                System.out.println("O número é maior");
            }

                //indicar se for menor
                if (jogador1 < jogador2){
                    System.out.println("O número é menor");
                }
            tentativas ++;

        } while(jogador1 != jogador2);

        // Imprimir - numero de tentativas

        System.out.println("Número de tentativas= " + tentativas);
    }

}
