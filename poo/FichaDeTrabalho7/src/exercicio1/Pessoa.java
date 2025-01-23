package exercicio1;

public class Pessoa {

    String nome;
    int idade;
    double altura;

    // Construtor da classe
    public Pessoa(String nome, int idade, double altura) {
        this.idade = idade;
        this.altura = altura;
        this.nome = nome;
    }

    // Método para imprimir os dados
    public void imprimirDados() {
        System.out.println("\n***** Dados do novo aluno *****");
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Altura: " + this.altura);
    }
}