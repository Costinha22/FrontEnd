package FichaPraticaTrabalho02;

import java.util.Scanner;

public class Exercício7 {

    public static void main(String[] args) {


        //input do user

        Scanner input = new Scanner(System.in);

        //variáveis
        int numAbaixo, numAcima, numUser;
        System.out.println("Insira um número : ");
        numUser = input.nextInt();

        numAbaixo = numUser - 5;
        numAcima = numUser +5;


        // 5 numeros abaixo

        while (numUser >= numAbaixo){
            System.out.println(numAbaixo);
            numAbaixo++;

        }
        numUser++;

        // 5 numeros acima

        while (numUser < numAcima){

            System.out.println(numUser);
            numUser++;
        }








    }



}

