import java.util.Scanner;

public class Exercicio2 {

    public static void main (String[] args) {


        //Pedir 2 numeros
        Scanner input = new Scanner(System.in);

        int num1, num2, soma, subtração, divisão, multiplicação;

        num1 = input.nextInt();
        num2 = input.nextInt();




        //Calcular a soma

        soma = num1 + num2;




        //Calcular subtração

        subtração = num1 - num2;



        //Calcular divisão

        divisão = num1 / num2;





        //Calcular multiplicação

        multiplicação = num1 * num2;




        //Imprimir Resultado na consola


        System.out.println("Soma =" + soma);
        System.out.println("Subtração=" + subtração);
        System.out.println("Divisão" + divisão);
        System.out.println("Multiplicação" + multiplicação);






    }


}
