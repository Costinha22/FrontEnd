package FichadeTrabalho_01;

import java.util.Scanner;

public class Exercicio11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //entrada de dados
        System.out.print("Introduza o Saldo");
        double saldo = input.nextDouble();

        System.out.print("Montante a ser Retirado/Acrescentado");
        double montante = input.nextDouble();



        //Condição - Saldo negativo ou Positivo

        double saldoFinal = saldo + montante;
        if (montante >=0) {
            System.out.println("O seu saldo atual é de (Positivo: " + saldoFinal);
        }else {

            System.out.println("Boa tentiva, mas nao tens saldo (Negativo)");
        }



    }


}
