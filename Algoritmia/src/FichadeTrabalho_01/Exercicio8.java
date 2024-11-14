package FichadeTrabalho_01;

import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //variaveis

        double nota1, nota2, nota3, media;

        //Entrada dos dados do utilizador
        System.out.println("Insira a primeira nota");
        nota1 = input.nextDouble();
        System.out.println("Insira a segunda nota");
        nota2 = input.nextDouble();
        System.out.println("Indtroduza terceira nota");
        nota3 = input.nextDouble();



        //Condição - Aprovação

        media = (nota1*0.25+nota2*0.35+nota3*0.40)/(0.25+0.35+0.40);

        if (media>9.5) {

            System.out.println("Parabéns você passou no teste");
        }else{
            System.out.println("Infelizmente você reprovou, estude mais na próxima vez");
        }



    }

}
