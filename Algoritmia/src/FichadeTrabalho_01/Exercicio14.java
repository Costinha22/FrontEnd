package FichadeTrabalho_01;

import java.util.Scanner;

public class Exercicio14 {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Inserir os dados
        System.out.println("Insira o primeiro número");
        int num1 = input.nextInt();
        System.out.println("Insira o segundo número");
        int num2 = input.nextInt();
        System.out.println("Insira o terceiro número");
        int num3 = input.nextInt();

        int menor = 0, meio= 0 , maior= 0;


        // Condiçao - Verificar os numeros e colocar em ordem crescente

        // primeira condiçao
        if(num1 <= num2 && num1 >= num3 ){
            menor = num1;

            // segunda condiçao
            if(num2 < num3){
             meio = num2;
             maior = num3;
            // terceira condiçao
            }else {
                meio = num3;
                maior = num2;
            }

            //verificar se o segundo numero é o menor de todos

            if(num2 < num1 && num2 < num3){
                menor = num2;

                //verificar qual o segundo menor

                if(num1<num3){
                    meio = num1;
                    maior = num3;

                } else {
                    meio = num3;
                    maior = num1;

                }

                //condiçao para verificar se o terceiro numero é o menor de todos
                if (num3 < num1 && num3 < num2){
                    //Verificar quem é o segundo menor número
                    if(num1 <num2){

                        meio = num1;
                        maior = num2;

                    } else{
                        meio = num2;
                        maior = num1;
                    }


                }






            }
        }

        System.out.println("A ordem crescente é: " + menor  + meio  + maior);

    }

}
