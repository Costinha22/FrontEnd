package FichadeTrabalho05;

import java.util.Scanner;

public class Ex06 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Variáveis - Tamanho e Opção
        int tamanhoArray, opcao;

        System.out.println("Insira o tamanho do seu array: ");
        tamanhoArray = input.nextInt();

        int[] vetor = new int[tamanhoArray];

        // Pedir ao utilizador que coloque os valores em cada "gaveta"
        for (int i = 0; i < tamanhoArray; i++) {
            System.out.println("Insira o valor da posição [" + i + "]:");
            vetor[i] = input.nextInt();
        }

        // Criar o menu de Seleção
        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Maior Número");
            System.out.println("2. Menor Número");
            System.out.println("3. Crescente ou não Crescente");
            System.out.println("4. Sair");
            System.out.println("Escolha a sua opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Maior número é: " + maior(vetor));
                    break;
                case 2:
                    System.out.println("Menor número é: " + menor(vetor));
                    break;
                case 3:
                    if (ordemCrescente(vetor)) {
                        System.out.println("O array está em ordem crescente!");
                    } else {
                        System.out.println("O array não está em ordem crescente.");
                    }
                    break;
                case 4:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 4);

        // Fechar o Scanner
        input.close();
    }

    // Função para encontrar o maior número
    public static int maior(int[] vetor) {
        int maior = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
        }
        return maior;
    }

    // Função para encontrar o menor número
    public static int menor(int[] vetor) {
        int menor = vetor[0];
        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }
        return menor;
    }

    // Função para verificar se o array está em ordem crescente
    public static boolean ordemCrescente(int[] vetor) {
        for (int i = 0; i < vetor.length - 1; i++) {
            if (vetor[i] > vetor[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
