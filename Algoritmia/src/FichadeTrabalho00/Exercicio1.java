import java.util.Scanner;

public class Exercicio1 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);


        // inserir num 1 e numero 2

        int numero1, numero2;

        System.out.println("INSIRA UM NUMERO");
        numero1 = input.nextInt();

        System.out.println("INSIRA O SEGUNDO NUMERO");
        numero2 = input.nextInt();

        //guardar o numero
        int soma;


        //execução do resultado

        soma = numero1 + numero2;

        System.out.println("Resultado é:" + soma);



    }
}



