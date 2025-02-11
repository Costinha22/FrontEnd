package Ex_02;

public class Carro extends Veiculo {

    private int quantidadePassageiros;


    public Carro(String marca, String modelo, int anoFabricacao, int potencia, int cilindrada, String tipoCombustivel, int consumoKM) {
        super(marca, modelo, anoFabricacao, potencia, cilindrada, tipoCombustivel, consumoKM);

    }

    public double calcularCusto(double distancia) {
        double precoCombustivel = 0.0
        double precoCombustivel;

        switch (this.getTipoCombustivel()) {
            case "gasolina":
                precoCombustivel = 5.50; // Preço da gasolina por litro
                break;
            case "etanol":
                precoCombustivel = 4.00; // Preço do etanol por litro
                break;
            default:
                precoCombustivel = 3.50; // Preço do diesel por litro
        }

        double custoTotal = consumo * precoCombustivel;
        return custoTotal; // Linha adicionada para retornar o custo total
    }
}