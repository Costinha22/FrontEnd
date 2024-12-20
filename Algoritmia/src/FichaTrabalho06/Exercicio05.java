package FichaTrabalho06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) throws FileNotFoundException  {

        //Indicar o caminho do ficheiro
        File file = new File("FrontEnd/Algoritmia/ficheiro06/exercicio_05_31.txt");


        //Ler o ficheiro
        Scanner scanner = new Scanner(file);


        //Guardar o conteudo numa variavel
        int soma = 0;



        //Ciclo para somar
        while(scanner.hasNextInt()){
            soma += scanner.nextInt();
        }
        System.out.println("A soma dos números é: " +soma);

        scanner.close();

    }

}
