package FichadeTrabalho04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //Array - tamanho 10
        int[] gavetas = new int[10];
        int menorvalor = 0;

        //ciclo para pedir ao utilizador
        for (int i = 0; i < gavetas.length; i++) {
            System.out.println("Insira o valor na gaveta [" + i + "]");
            gavetas[i] = input.nextInt();
        }

        menorvalor = gavetas[0];

        //verificar o menor valor
        for (int i = 0; i < gavetas.length; i++) {
            if (gavetas[i] < menorvalor) {
                menorvalor = gavetas[i];

            }

            System.out.println("O menor elemento é : " + menorvalor);


        }
    }
}
