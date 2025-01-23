package exercicio5;

public class Carro {
    // Atributos da classe Carro
    private String marca;
    private String modelo;
    private int anoDeFabricacao;

    // Construtor da classe Carro
    public Carro(String marca, String modelo, int anoDeFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabricacao = anoDeFabricacao;
    }

    // Método para ligar o carro
    public void ligar() {
        System.out.println("O carro está ligado.");
    }
}