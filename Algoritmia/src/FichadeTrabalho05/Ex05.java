package FichadeTrabalho05;

public class Ex05 {

    /**
     * Função para encontrar o maior valor em um array.
     *
     * @param array Array de inteiros.
     * @return O maior valor do array.
     */
    public static int maior(int[] array) {
        int maior = array[0];

        // Ciclo para verificar todas as "gavetas"
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        // Retorna o maior valor
        return maior;
    }

    /**
     * Função para encontrar o menor valor em um array.
     *
     * @param array Array de inteiros.
     * @return O menor valor do array.
     */
    public static int menor(int[] array) {
        int menor = array[0];

        // Ciclo para verificar todos os valores do array
        for (int i = 1; i < array.length; i++) {
            // Conferir e guardar o menor valor do array
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        // Retornar o menor número
        return menor;
    }

    /**
     * Função para verificar se os valores do array estão em ordem crescente.
     *
     * @param array Array de inteiros.
     * @return True se estiver em ordem crescente, False caso contrário.
     */
    public static boolean ordemCrescente(int[] array) {
        int numAnterior = array[0];

        // Ciclo para verificar se o valor anterior é menor
        for (int i = 1; i < array.length; i++) {
            if (array[i] < numAnterior) {
                return false;
            }
            numAnterior = array[i];
        }
        return true;
    }
}
