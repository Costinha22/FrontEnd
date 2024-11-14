import java.util.Scanner;

public class Exercicio5 {

 public static void main (String[]args) {


     //chamar a biblioteca
     Scanner inputUser  = new Scanner(System.in);




     // definir as váriáveis
     double valor1 , valor2, valor3;
     double per20 = 0.20, per30 = 0.30, per50 = 0.50;



    //mensagem para o utilizador para inserir os 3 valores
    System.out.println("Insira o valor 1");
     valor1 = inputUser.nextDouble();

     System.out.println("Insira o valor 2");
     valor2 = inputUser.nextDouble();

     System.out.println("Insira o valor 3");
     valor3 = inputUser.nextDouble();

     System.out.println("************************");


     //calcula media ponderada
     double mediaPonderada;

     mediaPonderada = (valor1 * per20 + valor2 * per30 + valor3 * per50) /(per20 + per30 + per50);





     //imprimir o resultado

     System.out.println("A media Ponderada é " + mediaPonderada);










 }




}
