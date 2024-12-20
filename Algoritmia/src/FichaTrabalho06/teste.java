import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class teste {
    public static void main(String[] args) {
        // Caminho do arquivo CSV
        String arquivoCSV = "vendas.csv";

        // Chama o método para ler o arquivo e exibir os dados
        lerArquivoCSV(arquivoCSV);
    }

    public static void lerArquivoCSV(String arquivoCSV) {
        String linha;
        BufferedReader br = null;

        try {
            // Abrindo o arquivo CSV
            br = new BufferedReader(new FileReader(arquivoCSV));

            // Lendo o cabeçalho (primeira linha)
            br.readLine(); // Ignora a primeira linha que é o cabeçalho

            // Lendo as linhas seguintes do arquivo CSV
            while ((linha = br.readLine()) != null) {
                // Separando os dados por vírgula (CSV padrão)
                String[] dados = linha.split(",");

                // Exibindo os dados para cada venda
                System.out.println("ID Venda: " + dados[0]);
                System.out.println("ID Cliente: " + dados[1]);
                System.out.println("Nome Cliente: " + dados[2]);
                System.out.println("Contato: " + dados[3]);
                System.out.println("E-mail: " + dados[4]);
                System.out.println("Editora: " + dados[5]);
                System.out.println("Categoria: " + dados[6]);
                System.out.println("Jogo: " + dados[7]);
                System.out.println("Valor: " + dados[8]);
                System.out.println("----------------------------------");
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // Fechando o BufferedReader
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
