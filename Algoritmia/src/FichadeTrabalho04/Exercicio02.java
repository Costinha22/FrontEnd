package FichadeTrabalho04;

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

       //input do user
        Scanner input = new Scanner(System.in);

       //vetor tamanho = 12

        double [] comissoes = new double [12];
        double totalComissoes = 0;



       //somar as condiçoes

        for(int i = 0; i <12; i++)
        {
            System.out.println("Insira a sua comissão [" + i + "]");
            comissoes[i] = input.nextDouble();
            totalComissoes = totalComissoes + comissoes[i];
        }
        System.out.println("Total de comissoes=" + totalComissoes);
    }

}
