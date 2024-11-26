package FichadeTrabalho_03;

import java.util.Scanner;

public class Exercício01 {
    public Exercício01() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int resultado = false;

        String continuar;
        do {
            System.out.println("Insira o primeiro número: ");
            int numUser1 = input.nextInt();
            System.out.println("Insira um operador (+,-,*,/): ");
            String operador = input.next();
            System.out.println("Insira o segundo número: ");
            int numUser2 = input.nextInt();
            int resultado;
            switch (operador) {
                case "+":
                    resultado = numUser1 + numUser2;
                    System.out.println("Total: " + resultado);
                    break;
                case "-":
                    resultado = numUser1 - numUser2;
                    System.out.println("Total: " + resultado);
                    break;
                case "*":
                    resultado = numUser1 * numUser2;
                    System.out.println("Total: " + resultado);
                    break;
                case "/":
                    resultado = numUser1 / numUser2;
                    System.out.println("Total: " + resultado);
                    break;
                default:
                    System.out.println("Operador inválido!!!!");
            }

            do {
                System.out.println("Deseja continuar? (s/n): ");
                continuar = input.next();
            } while(!continuar.equals("s") && !continuar.equals("n"));
        } while(continuar.equals("s"));

    }
}
