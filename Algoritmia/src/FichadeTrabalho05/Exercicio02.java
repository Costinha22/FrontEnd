package FichadeTrabalho05;

import java.util.Scanner;

public class Exercicio02 {

    /**
     * Método para  ler números inteiros e positivos
     * @return - Número inteiro e positivo
     */
    public static int lerNumeroPositivo(){

        Scanner input = new Scanner(System.in);

        int numero;

        do {

            System.out.println("Digite um numero positivo: ");
            numero = input.nextInt();

        } while (numero <= 0);
            return numero;
    }

    /**
     * Funçao para imprimir os asteristicos
     * @param numeroAsteristicos
     */
    public static void imprimirAsteristicos (int numeroAsteristicos) {

        //ciclo para imprimir os asteristicos até o número que o utilizador colocou


            for( int i =0; i < numeroAsteristicos; i++){
                System.out.println("*");

            }

    }

    public static void main(String[] args) {

        int numlido = lerNumeroPositivo();
        imprimirAsteristicos(numlido);
    }

}
