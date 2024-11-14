import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);


        int faixa1Min1 , faixa1Sec1,  faixa2Min2 ,  faixa2Sec2,  faixa3Min3,  faixa3Sec3,  faixa4Min4,  faixa4Sec4, faixa5Min5, faixa5Sec5;


        System.out.println("Vamos Calcular o tempo de duração do disco, insira o tempo em minutos e segundos");


        System.out.print("Faixa 1 - Minutos");
        faixa1Min1 = input.nextInt();
        System.out.print("Faixa 1 - Segundos");
        faixa1Sec1 = input.nextInt();

        System.out.print("Faixa 2 - Minutos");
        faixa2Min2 = input.nextInt();
        System.out.print("Faixa 2 - Segundos");
        faixa2Sec2 = input.nextInt();

        System.out.print("Faixa 3 - Minutos");
        faixa3Min3 = input.nextInt();
        System.out.print("Faixa 3 - Segundos");
        faixa3Sec3 = input.nextInt();


        System.out.print("Faixa 4 - Minutos");
        faixa4Min4 = input.nextInt();
        System.out.print("Faixa 4 - Segundos");
        faixa4Sec4 = input.nextInt();

        System.out.print("Faixa 5 - Minutos");
        faixa5Min5 = input.nextInt();
        System.out.print("Faixa 5 - Segundos");
        faixa5Sec5 = input.nextInt();




        //Transforma em minutos e segundos


        //Minutos para segundos
        int minTosec = (faixa1Min1 + faixa2Min2 + faixa3Min3 + faixa4Min4 + faixa5Min5) * 60;



        //Somar todos os segundos
        int totalSegundos = minTosec + (faixa1Sec1 + faixa2Sec2 + faixa3Sec3 + faixa4Sec4 + faixa5Sec5);

        //Calcular a hora
        int hora = totalSegundos / 3600;
        totalSegundos = totalSegundos % 3600;


        //Calcular os minutos
        int minutos = totalSegundos /60;

        //Calcular os segundos
        totalSegundos = totalSegundos % 60;

        System.out.println("Total de tempo do album:" + hora +":" + minutos +":"+totalSegundos );




    }
}