package exercicio3;

public class Retangulo {

    double altura;
    double largura;

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void calcularPerimetro() {

        System.out.println((largura*2)+(altura*2));
    }
}