package FichadeTrabalho04;

import java.util.Scanner;

public class novo {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int [] numeros = new int [10];
        int maiornumero = numeros[0];
        int numerouser;

        System.out.println("Insira dez numeros ");

        for(int i=0;i<10;i++) {
            System.out.print(" número " + i + ":");
            numerouser = input.nextInt();

            if( maiornumero < numeros[i]){
                maiornumero = numeros[i];
                System.out.println("maior numero é "+numeros[i]);
            }else{
               System.out.println("o maior numero é" + maiornumero);
            }


        }


    }


}
