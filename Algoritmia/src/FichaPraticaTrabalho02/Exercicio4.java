package FichaPraticaTrabalho02;

import java.util.Scanner;

public class Exercicio4 {


    public static void main(String[] args) {


        // chamar a biblioteca
     Scanner input = new Scanner(System.in);

     //Imprime na consola para pedir ao user que introduza um numero
        System.out.println("Insira um numero");

        //Lê a variável e guarda
        int num = input.nextInt();

        //Condiçao do ciclo
       for(int i =0; i <=num; i++){

            //Imprime na consola o que foi pedido na condiçao anterior na variável i
           System.out.println(i);
        }






    }



}
