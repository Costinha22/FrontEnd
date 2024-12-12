package FichadeTrabalho05;

public class Exercicio03 {

    /**
     * Função para verificar se o número é par.
     *
     * @param numero Número a ser verificado.
     * @return True se for par, False se for ímpar.
     */
    public static boolean numeroPar(int numero) {
        return numero % 2 == 0;
    }

    /**
     * Função para verificar se o número é positivo.
     *
     * @param numero Número a ser verificado.
     * @return True se for positivo, False se for negativo.
     */
    public static boolean numeroPositivo(int numero) {
        return numero >= 0;
    }

    /**
     * Função para verificar se o número é primo.
     *
     * @param numero Número a ser verificado.
     * @return True se for primo, False caso contrário.
     */
    public static boolean numeroPrimo(int numero) {
        if (numero < 2) {
            return false; // Números menores que 2 não são primos.
        }
        for (int divisor = 2; divisor <= Math.sqrt(numero); divisor++) {
            if (numero % divisor == 0) {
                return false; // Encontrou um divisor, não é primo.
            }
        }
        return true; // Não encontrou divisores, é primo.
    }
}