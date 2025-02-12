package Ex_01;
import java.util.ArrayList;

public class Catalogo {
    private ArrayList<Aviao> avioes;

    public Catalogo() {
        this.avioes = new ArrayList<Aviao>();
    }

    public void adicionarAviao(Aviao aviao) {
        this.avioes.add(aviao);
    }

    public void removerAviao(Aviao aviao) {
        this.avioes.remove(aviao);
    }

    public void listarAvioes() {
        for (Aviao aviao : this.avioes) {
            System.out.println(aviao); // Métudo toString() da classe Aviao
        }
    }

    public double calcularValorTotal() {
        double valorTotal = 0;
        for (Aviao aviao : this.avioes) {
            valorTotal += aviao.getPreco();
        }
        return valorTotal;
    }


}




