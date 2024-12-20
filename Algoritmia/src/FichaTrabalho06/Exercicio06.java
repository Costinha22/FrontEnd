package FichaTrabalho06;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.SQLOutput;
import java.util.Scanner;

import static java.util.Scanner.*;

public class Exercicio06 {

    public static void main(String[] args) throws FileNotFoundException {

        //Indicar caminho para
        File ficheiro = new File("FrontEnd/Algoritmia/ficheiro06/exercicio_06.txt");

        //Ler o ficheiro
        Scanner scanner = new Scanner(ficheiro);

        // definir variaveis
        int maiorIdade = 0;
        String linha;
        String nomeIdade ="";

        //Ciclo para ler o ficheiro
        while (scanner.hasNextLine()) {
            linha = scanner.nextLine();
            //Divide a linha pela vírgula
            String[] itensDalista = linha.split(",");

            // Extrai o nome e a idade
            String nome = itensDalista[0];
          int idade = Integer.parseInt(itensDalista[1]);

            //Cerifica se a idade atua é maior do que a armazenada

            if(idade>maiorIdade){
                maiorIdade = idade;
                nomeIdade = nome;


            }



            }

        System.out.print("A pessoa mais velha é: " + nomeIdade + " com " + maiorIdade + " anos. ");
        scanner.close();
        }
    }
