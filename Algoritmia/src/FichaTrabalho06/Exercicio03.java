package FichaTrabalho06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) throws FileNotFoundException {


        //Caminho do ficheiro atual

        File ficheiroAtual = new File("FrontEnd/Algoritmia/ficheiro06/exercicio_03.txt");


        //Leitor para o ficheiro atual

        Scanner scanner = new Scanner(ficheiroAtual);


        //Caminho para o ficheiro novo

        File ficheiroNovo = new File("FrontEnd/Algoritmia/ficheiro06/exercicio_03copia.txt");


        //Imprimir no ficheiro novo

        PrintWriter maquinaEscrever = new PrintWriter(ficheiroNovo);
        String linha;

        //Ciclo para ler o ficheiro e imprimir

        while(scanner.hasNextLine()){
            linha=scanner.nextLine();
            maquinaEscrever.println(linha);
        }


        //Fechar a impressora e leitor

        scanner.close();
        maquinaEscrever.close();


    }

}
