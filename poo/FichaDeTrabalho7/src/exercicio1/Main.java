package exercicio1;

public class Main {

    public static void main(String[] args) {


        Pessoa pessoa1 = new Pessoa("Vagner", 21, 1.80);
        Pessoa pessoa2 = new Pessoa("Fefranco", 22, 1.85);

        System.out.println("Nome da primeira pessoa"+ pessoa1.nome);
        System.out.println("Idade da segunda pessoa"+pessoa2.idade);


        pessoa1.imprimirDados();
    }

}
