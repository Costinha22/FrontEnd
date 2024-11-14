import java.util.Scanner;

public class Exercicio3 {

    public static void main (String[] args) {

        Scanner input = new Scanner(System.in);



        //Insira altura
        System.out.println("Insira a altura");
        double altura = input.nextDouble();






        //Insira largura

       double largura = input.nextDouble();






        // Calcular área
        double area = largura * altura;




        // calcular perimetro

        double perimetro = 2*(largura) + 2*(altura);




        //Imprimir resultado

        System.out.println("Área="+ area);
        System.out.println("Perimetro="+ perimetro);
        System.out.println("Largura="+ largura);














    }


}
