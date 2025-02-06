package exercicio2;

public class imovel {

    public class Imovel {
        private String rua;
        private int numeroPorta;
        private String cidade;
        private String tipo; // Apartamento, Casa, Mansão
        private String acabamento; // Para restauro, usada, nova, nova com alto acabamento
        private double area;
        private int numeroQuartos;
        private int numeroCasasDeBanho;
        private double areaPiscina;

        // Construtor
        public Imovel(String rua, int numeroPorta, String cidade, String tipo, String acabamento, double area, int numeroQuartos, int numeroCasasDeBanho, double areaPiscina) {
            this.rua = rua;
            this.numeroPorta = numeroPorta;
            this.cidade = cidade;
            this.tipo = tipo;
            this.acabamento = acabamento;
            this.area = area;
            this.numeroQuartos = numeroQuartos;
            this.numeroCasasDeBanho = numeroCasasDeBanho;
            this.areaPiscina = areaPiscina;
        }



        public double calcularValor() {
            double valorBase = calcularValorBase();
            valorBase = aplicarAjusteAcabamento(valorBase);
            valorBase += calcularValorAdicional();






}
