import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class teste {
 //*********************Funções*************************

    public static void menuCliente() {

        Scanner inputUser = new Scanner(System.in);
        String opcao = "";

        do {
            System.out.println("1. Registo de novo cliente");
            System.out.println("2. Verificar vagas de estacionamento disponíveis");
            System.out.println("3. Verificar quais os jogos disponíveis");
            System.out.println("4. Porcurar jogos por Editora");
            opcao = inputUser.next();

            switch (opcao) {
                case "1":
                    // Código para registar um novo cliente
                    System.out.print("Digite seu nome: ");
                    String nome = inputUser.next();
                    System.out.print("Digite seu contacto: ");
                    String contato = inputUser.next();
                    System.out.print("Digite seu e-mail: ");
                    String email = inputUser.next();

                    // Exibe mensagem de confirmação
                    System.out.println("\nRegisto realizado com sucesso!");

                    System.out.println("Dados do Cliente:");
                    System.out.println("Nome: " + nome);
                    System.out.println("Contacto: " + contato);
                    System.out.println("E-mail: " + email);
                    break;

                case "2":
                    verificarVagasEstacionamento();
                    break;

                case "3":
                    break;

                case "4":
                    break;
                default:
                    System.out.println("Escolha inválida");
            }
        }
        while (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && !opcao.equals("4"));
    }
    public static void PedirPassword() {
        Scanner inputDoUser =  new Scanner(System.in);

        String password= "admin";
        String comparar = "";


        do{
            System.out.println("Insira a sua palavra-passe");
            comparar = inputDoUser.next();
            if (comparar.equals(password)){
                //MenuAdmim();
                System.out.println("Menu Admin");
            }

        }while (!password.equals(comparar));

    }

    // Métudu para verificar vagas de estacionamento
    public static void verificarVagasEstacionamento() {
        System.out.println("A verificar vagas de estacionamento disponíveis...");

        System.out.print("As vagas disponíveis são: ");
        for (int n = 1; n <= 15; n++) {
            int numeroTriangular = (n * (n + 1)) / 2; // Cálculo do número triangular

            // Verifica se o número triangular é um múltiplo de 5
            if (numeroTriangular % 5 == 0 && numeroTriangular <= 121) {
                System.out.print(numeroTriangular + " "); // Mostra as vagas disponíveis
            }
        }

    }

    //**************CódigodoMain**************************

    public static void main (String[]args) throws FileNotFoundException {

        //Indicar o caminho para o ficheiro logo
        File caminhologo = new File("dados/logo.txt");


        //Ler o ficheiro
        Scanner logo = new Scanner(caminhologo);
        Scanner inputUser = new Scanner(System.in);

        String selecaoUser = "";

        //Ciclo para ler as linhas do txt e printar na consola
        while (logo.hasNextLine()) {
            System.out.println(logo.nextLine());
        }

        //Ciclo para mostrar opções de escolha dos menus cliente e admin
        do {
            System.out.println("opção 1 - admin");
            System.out.println("opção 2 - cliente");

            selecaoUser = inputUser.next();

            //
            switch (selecaoUser) {

                case "1":
                    PedirPassword();
                    break;
                case "2":
                    menuCliente();
                    break;
                default:
                    System.out.println("Escolha um dos números do menu");
            }

        } while (!selecaoUser.equals("1") && !selecaoUser.equals("2"));


    }


}
