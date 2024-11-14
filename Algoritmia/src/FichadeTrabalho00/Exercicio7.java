import java.util.Scanner;

public class Exercicio7 {

    public static void main(String[] args) {


        Scanner inputuser = new Scanner(System.in);

        //  pedir os preços dos produtos

        System.out.println("Informe o primeiro valor: ");
        double preco1 =inputuser.nextDouble();
        System.out.println("Informe o segundo valor: ");
        double preco2 = inputuser.nextDouble();
        System.out.println("Informe o terceiro valor: ");
        double preco3 = inputuser.nextDouble();

        System.out.println("**********************");




        //aplicar o desconto de 10%

        double totalDesconto = (preco1 + preco2 + preco3) *0.9;






        //imprimir o resultado

        System.out.println(" O seu total com desconto é: "+ totalDesconto);



    }
}
