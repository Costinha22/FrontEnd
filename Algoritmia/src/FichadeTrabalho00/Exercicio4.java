import java.util.Scanner;

public class Exercicio4 {


    public static void main(String[] args){


     //Pedir o raio da circunferência
        Scanner input = new Scanner(System.in);




        //definir variável "circunferência"

        double raio, area, pi = 3.14;





        //mensagem ao utilizador a pedir o raio da circunferência
        System.out.println("Insira o raio em cm");
         raio = input.nextDouble();



         //calcular a area da circunferencia

        area = pi * (raio*raio);
        System.out.println("a area da circunferencia é" +area);













    }








}
