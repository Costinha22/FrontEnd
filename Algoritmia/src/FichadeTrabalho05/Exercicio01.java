package FichadeTrabalho05;

import java.util.Scanner;

public class Exercicio01 {


    /* metodo para fazer o braulho do animal escolhido */
    public static void fazerBarulho(String animal) {
      switch (animal){
          case "cao":
              System.out.println("Au, au, au");
              break;
          case "gato":
              System.out.println("Miau, miau, miau");
              break;
          case "peixe":
              System.out.println("Glub, glub, glub");
              break;
          case "vaca":
              System.out.println("Muuuuu");
              break;
          case "porco":
              System.out.println("Oinc, oinc, oinc");
              break;
          default:
              System.out.println("Animal desconhecido");
      }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String animalEscolhido;

        System.out.println("Escolha um animal: ");

        animalEscolhido = input.next();

        fazerBarulho(animalEscolhido);

    }






}
