package Ex_01;

public class JatoPrivado extends Aviao {


    private int lotacaoPassageiros;
    private double capacidadeBagagem;
    private String categoria;
    private String instalacoes;


    public JatoPrivado(String numeroSerie, String modelo, int anoFrabico, double peso, double fuselagem, double envergaduraAsas, double alturaCauda, int numeroMotores, int autonomia, int velocidadeMax, double preco) {
        super(numeroSerie, modelo, anoFrabico, peso, fuselagem, envergaduraAsas, alturaCauda, numeroMotores, autonomia, velocidadeMax, preco);
    }
}
