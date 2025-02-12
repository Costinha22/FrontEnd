package Ex_02;

public class Veiculo {

    //variaveis
    private String marca;
    private String modelo;
    private int anoFabricacao;
    private int potencia;
    private int cilindrada;
    public String tipoCombustivel;
    private double consumoKM;

    //construtor
    public Veiculo(String marca, String modelo, int anoFabricacao, int potencia, int cilindrada, String tipoCombustivel, int consumoKM) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.potencia = potencia;
        this.cilindrada = cilindrada;
        this.tipoCombustivel = tipoCombustivel;
        this.consumoKM = consumoKM;
    }

    //metudos
    public void ligar() {
        System.out.println("O veículo está ligado.");
    }

    public void corrida() {
        System.out.println("O veículo está em corrida.");
    }

    public double calcularConsumo(double distancia) {
        double consumoTotal = (distancia / 100) * this.consumoKM;
        return consumoTotal;
    }


}
