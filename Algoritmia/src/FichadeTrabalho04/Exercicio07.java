package FichadeTrabalho04;

import java.util.Scanner;

public class Exercicio07 {


    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    //tamanho da array

        int array[] = new int [3];
        int maiornumero = 0;

       for(int contador = 0;contador< array.length;contador++){
           System.out.println("Insira o 1º valor["+contador+"]:");
          array[contador] = input.nextInt();

       }
       //atualiza o contador
       maiornumero = array[0];

       for(int contador = 0; contador< array.length;contador++){

           //verificar qual o maior valor
           if (array[contador]< maiornumero){

               maiornumero = array[contador];
           }
       }

            //imprimir se nao houver numero par

        if (maiornumero %2 ==0) {
            System.out.println("O maior número par é: " + maiornumero);
        }else {
            System.out.println("O maior número não é par");
        }


    }


}
