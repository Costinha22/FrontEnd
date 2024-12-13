package FichaTrabalho06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) throws FileNotFoundException {


        //Caminho
        File ficheiro = new File("FrontEnd/Algoritmia/ficheiro06/exercicio_01.txt");
        File ficheiro1 = new File("FrontEnd/Algoritmia/ficheiro06/exercicio_01_Alternativa01.txt");


        //Leitor ficheiro 1
        Scanner scanner = new Scanner(ficheiro);
        String linha;

        //Leitor ficheiro 2
        Scanner scanner1 = new Scanner(ficheiro1);




        //Ciclo para ler all o ficheiro

        while(scanner.hasNextLine()){

          linha = scanner.nextLine();
            System.out.println(linha);

        }

        //Ciclo para ler o ficheiro 2

        while (scanner1.hasNextLine()){
            linha = scanner1.nextLine();
            System.out.println(linha);
        }

        //Fechar o leitor

        scanner.close();



    }

}
