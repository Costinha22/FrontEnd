import java.util.Scanner;

public class Exercicio6 {


    public static void main (String[]args) {

 Scanner inputUsuario = new Scanner(System.in);


     //input user
        int valor1, valor2, valorExtra;

        System.out.println("insira um valor");
        valor1 = inputUsuario.nextInt();
        System.out.println("insira um valor");
        valor2 = inputUsuario.nextInt();



        //primeira troca c/variavel extra

        valorExtra =valor1;
        valor1= valor2;
        valor2 = valorExtra;


        //segunda troca sem extra

        valor1 = valor1 + valor2;
        valor2 = valor1 - valor2;
        valor1 = valor1 - valor2;

       // Imprimir Resultado

        System.out.println("Primeira troca valor 1 = "+ valor1);
        System.out.println("primeira troca valor 2 = " + valor2);








    }
}
