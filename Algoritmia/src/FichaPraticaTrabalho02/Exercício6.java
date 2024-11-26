package FichaPraticaTrabalho02;

import java.util.Scanner;

public class Exercício6 {

    public static void main(String[] args) {


        //variaveis - soma, num1, num100
        int num01 = 1, num100 = 100, soma = 0;
        //Ciclo
        while(num01 >= 1 && num01 <=100) {
            //soma do valor total
            System.out.println(num01);
            soma = soma+ num01;
            num01++;
        }
        //soma com valor total
        System.out.println("soma total é : " + soma);

    }


}
