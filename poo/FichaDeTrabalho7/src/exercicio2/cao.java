package exercicio2;
public class cao {

    String nome;
    String raca;
    String latido = "au au";

    // Construtor da classe
    public cao(String nome, String raca) {
        this.nome = nome;
        this.raca = raca;
    }

    // Método para definir o som do latido
    public void setlatido (String novoLatido) {
        this.latido = novoLatido;
    }

    // Método para exibir as informações do cão
    public void latir () {
        System.out.println(latido);

    }
}