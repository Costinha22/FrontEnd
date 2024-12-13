package FichaTrabalho06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) throws FileNotFoundException {

      //Caminho para o ficheiro
        File ficheirocsv = new File("FrontEnd/Algoritmia/ficheiro06/exercicio_04.csv");
        String linha;

        //Ler o ficheiro csv
        Scanner scanner = new Scanner(ficheirocsv);

        //Imprimir o ficheiro na consola

        while(scanner.hasNextLine()){
            linha = scanner.nextLine();
            System.out.println(linha);


        }
scanner.close();

    }

}
