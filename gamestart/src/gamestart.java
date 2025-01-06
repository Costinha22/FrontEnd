import java.util.Scanner;

import java.util.Scanner;

public class gamestart {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu Principal:");
            System.out.println("1. Menu Admin");
            System.out.println("2. Menu Utilizador");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opção: ");
            int opcaoPrincipal = scanner.nextInt();

            switch (opcaoPrincipal) {
                case 1:
                    menuAdmin(scanner);
                    break;
                case 2:
                    menuUtilizador(scanner);
                    break;
                case 3:
                    System.out.println("Saindo do sistema...");
                    scanner.close();
                    return; // Sai do programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }

    private static void menuUtilizador(Scanner scanner) {
    }

    // Método para o Menu Admin
    public static void menuAdmin(Scanner scanner) {
        do {
            System.out.println("\nMenu Admin:");
            System.out.println("1. Login");
            System.out.println("2. Ver Relatórios");
            System.out.println("3. Configurações do Sistema");
            System.out.println("4. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            int opcaoAdmin = scanner.nextInt();

            switch (opcaoAdmin) {
                case 1:
                    System.out.println("Opção 'Gerenciar Usuários' escolhida.");
                    // Adicione sua função aqui
                    break;
                case 2:
                    System.out.println("Opção 'Ver Relatórios' escolhida.");
                    // Adicione sua função aqui
                    break;
                case 3:
                    System.out.println("Opção 'Configurações do Sistema' escolhida.");
                    // Adicione sua função aqui
                    break;
                case 4:
                    System.out.println("Voltando ao Menu Principal...");
                    return; // Sai do menu Admin
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }



    // Método para o Menu Utilizador
            private static void menuUtilizador(Scanner scanner) {
            do {
            System.out.println("\nMenu Utilizador:");
            System.out.println("1. Visualizar Perfil");
            System.out.println("2. Alterar Senha");
            System.out.println("3. Consultar Histórico");
            System.out.println("4. Voltar ao Menu Principal");
            System.out.print("Escolha uma opção: ");
            int opcaoUtilizador = scanner.nextInt();

            switch (opcaoUtilizador) {
                case 1:
                    System.out.println("Opção 'Visualizar Perfil' escolhida.");
                    // Adicione sua função aqui
                    break;
                case 2:
                    System.out.println("Opção 'Alterar Senha' escolhida.");
                    // Adicione sua função aqui
                    break;
                case 3:
                    System.out.println("Opção 'Consultar Histórico' escolhida.");
                    // Adicione sua função aqui
                    break;
                case 4:
                    System.out.println("Voltando ao Menu Principal...");
                    return; // Sai do menu Utilizador
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        }
    }
}