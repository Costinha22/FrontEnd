import java.util.Scanner;

public class Exercicio03 {


    public static void main(String[] args) {

        // 1. Criar um objeto da classe Scanner.
        //    O Scanner permite que o programa leia dados fornecidos pelo usuário.
        //    "System.in" significa que vamos ler do teclado.
        Scanner input = new Scanner(System.in);

        // 2. Criar um array de inteiros para armazenar 10 números.
        //    Um array é uma estrutura que permite guardar vários valores do mesmo tipo.
        int[] numeros = new int[10]; // O array tem 10 posições (de 0 a 9).

        // 3. Variável para armazenar o maior número encontrado no array.
        int maior;

        // 4. Solicitar ao usuário que insira 10 números.
        System.out.println("Por favor, insira 10 números:");

        // 5. Usar um loop para repetir o processo de leitura 10 vezes.
        //    Cada número fornecido será armazenado no array.
        for (int i = 0; i <10; i++){ // "i" é o índice atual (0 a 9).
            System.out.print("Número " + (i) + ": "); // Exibe qual número o usuário deve inserir.

            numeros[i] = input.nextInt();
            // Lê o número inteiro digitado pelo usuário e guarda no array.
        }

        // 6. Assumir inicialmente que o primeiro número do array é o maior.
        maior = numeros[0]; // "numeros[0]" é o número armazenado na primeira posição do array.

        // 7. Usar outro loop para verificar os outros números no array.
        //    O objetivo é comparar cada número com o maior encontrado até agora.
        for (int i = 1; i < numeros.length; i++) { // Começa na posição 1, pois o 0 já foi usado.
            if (numeros[i] > maior) { // Compara o número atual com o "maior".
                maior = numeros[i]; // Se o número atual for maior, atualiza o valor de "maior".
            }
        }

        // 8. Mostrar o maior número encontrado no console.
        //    "maior" agora contém o valor mais alto entre os 10 números fornecidos.
        System.out.println("O maior número que você digitou é: " + maior);

        // 9. Fechar o Scanner.
        //    Isso é uma boa prática para liberar recursos do sistema.
        input.close();
    }
}