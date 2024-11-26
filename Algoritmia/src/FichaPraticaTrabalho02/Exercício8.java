package FichaPraticaTrabalho02;

import java.util.Scanner;

public class Exercício8 {

    public static void main(String[] args) {

        //scanner para ler os numeros
        Scanner input = new Scanner(System.in);

        int numuser, soma = 0, contadorMedia = 0;

        System.out.println("Insira um numero: \n Use o -1 para parar o programa");
        numuser = input.nextInt();

        //Ciclo - soma e media

        while (numuser != -1){

            contadorMedia = contadorMedia + 1;
            System.out.println("contador atualizado = " + contadorMedia);
            soma = soma + numuser;
            System.out.println("soma atuzalizada= " +soma);
            System.out.println("Insira outro numero, ou carregue -1 para parar: ");
            numuser = input.nextInt();



        }

        System.out.println("Média = " + soma/contadorMedia);



    }



}

