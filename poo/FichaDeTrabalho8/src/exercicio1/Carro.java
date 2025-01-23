package exercicio1;

public class Carro {



    // 1. Classe Carro
    class Carro {
        private String marca;
        private String modelo;
        private int ano;
        private int potencia;
        private int cilindrada;
        private TipoCombustivel tipoCombustivel;
        private double consumo; // litros por 100km

        public Carro(String marca, String modelo, int ano, int potencia, int cilindrada,
                     TipoCombustivel tipoCombustivel, double consumo) {
            this.marca = marca;
            this.modelo = modelo;
            this.ano = ano;
            this.potencia = potencia;
            this.cilindrada = cilindrada;
            this.tipoCombustivel = tipoCombustivel;
            this.consumo = consumo;

            public void ligar () {

                    if (this.ano <= 1995 && TipoCombustivel.DIESEL) {
                        System.out.println("Deita um pouco de fumo");
                    } else if (this.ano <= 1995 && this.TipoCombustivel != TipoCombustivel.DIESEL {
                        System.out.println("VRUUM VRUUM (Carro moderno)");
                    } else {
                        System.out.println("VRUUM (Carro contemporâneo)");
                    }
                }