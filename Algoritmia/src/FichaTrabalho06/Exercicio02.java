package FichaTrabalho06;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exercicio02 {

    public static void main(String[] args) throws FileNotFoundException {


        // Caminho para guardar ficheiro
        File ficheiroNovo = new File("FrontEnd/Algoritmia/ficheiro06/exercicio_02.txt");

        //Máquina para escrever no meu ficheiro
        PrintWriter maquinaEscrever = new PrintWriter(ficheiroNovo);


       //Conteudo do ficheiro

        String minhaMensagem = "É os Dragões!!!";

        //Imprimir no próprio ficheiro

        maquinaEscrever.println(minhaMensagem);


        //Fechar a máquina

        maquinaEscrever.close();

    }

}
