package FichaTrabalho06;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) throws FileNotFoundException {

        // Caminho do ficheiro
        File file = new File("FrontEnd/Algoritmia/ficheiro06/exercicio_07.txt"); // Altere para o caminho real do ficheiro

        // Scanner para ler o ficheiro
        Scanner scanner = new Scanner(file);

        // Variáveis para contar linhas e palavras
        int numeroDeLinhas=0;
        int numeroDePalavras=0;


        // Ler o ficheiro linha por linha
        while (scanner.hasNextLine()) {
            String linha = scanner.nextLine();  // Lê uma linha
            numeroDeLinhas++;  // Conta a linha

            // Conta as palavras na linha (dividindo por espaços)
            numeroDePalavras += linha.split(" ").length;  // Conta palavras diretamente
        }


        // Fecha o scanner
        scanner.close();

        // Exibe o número de linhas e palavras
        System.out.println("Número de linhas: " + numeroDeLinhas);
        System.out.println("Número de palavras: " + numeroDePalavras);
    }
}

