package FichaTrabalho06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercicio08 {

    public static void main(String[] args) throws IOException {
        // Caminho dos arquivos
        File arquivoEntrada = new File("FrontEnd/Algoritmia/ficheiro06/exercicio_07.txt"); // Altere o caminho
        File arquivoSaida = new File("FrontEnd/Algoritmia/ficheiro06/exercicio_08.txt"); // Altere o caminho
        File arquivoResultado = new File("FrontEnd/Algoritmia/ficheiro06/resultadoExercicio08.txt"); // Arquivo para armazenar as frases repetidas

        Scanner scannerEntrada = new Scanner(arquivoEntrada);
        Scanner scannerSaida = new Scanner(arquivoSaida);
        FileWriter escritor = new FileWriter(arquivoResultado);

        // Ler o arquivo de entrada e verificar se as linhas aparecem no arquivo de saída
        while (scannerEntrada.hasNextLine()) {
            String linhaEntrada = scannerEntrada.nextLine();
            scannerSaida = new Scanner(arquivoSaida); // Resetar scanner de saída

            // Verificar se a linha do arquivo de entrada está no arquivo de saída
            while (scannerSaida.hasNextLine()) {
                String linhaSaida = scannerSaida.nextLine();
                if (linhaEntrada.equals(linhaSaida)) {
                    escritor.write(linhaEntrada + "\n"); // Escreve a linha no arquivo de resultado
                    break;
                }
            }
        }

        scannerEntrada.close();
        escritor.close();

        System.out.println("Frases repetidas copiadas para o arquivo de resultado.");
    }
}

