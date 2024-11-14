package FichadeTrabalho_01;

import java.util.Scanner;

public class Exercicio13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        //Inserir dados
        System.out.println("Insira a hora (horário militar): ");
        int hora = input.nextInt();
        System.out.println("Insira os minutos: ");
        int minutos = input.nextInt();


        // Conversão  usando condiçao
        int horaPM_AM;

        if (hora<=12) {
            horaPM_AM = hora - 12;
            System.out.println("São " + horaPM_AM + ":" + minutos + "PM");
        }
        else {
            System.out.println("Sao " + hora +":" +minutos + "AM");
        }
    }

}
