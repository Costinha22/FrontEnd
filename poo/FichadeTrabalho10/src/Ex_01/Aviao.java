package Ex_01;

public class Aviao {


    String numeroSerie;
    String  modelo;
    int anoFrabico;
    double peso;
    double fuselagem;
    double envergaduraAsas;
    double alturaCauda;
    int numeroMotores;
    int autonomia;
    int velocidadeMax;
    double preco;



        //construtor


    public Aviao(String numeroSerie, String modelo, int anoFrabico, double peso, double fuselagem, double envergaduraAsas, double alturaCauda, int numeroMotores, int autonomia, int velocidadeMax, double preco) {
        this.numeroSerie = numeroSerie;
        this.modelo = modelo;
        this.anoFrabico = anoFrabico;
        this.peso = peso;
        this.fuselagem = fuselagem;
        this.envergaduraAsas = envergaduraAsas;
        this.alturaCauda = alturaCauda;
        this.numeroMotores = numeroMotores;
        this.autonomia = autonomia;
        this.velocidadeMax = velocidadeMax;
        this.preco = preco;
    }
}
