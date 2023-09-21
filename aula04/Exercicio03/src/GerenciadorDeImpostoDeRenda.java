import java.util.ArrayList;
import java.util.List;

public class GerenciadorDeImpostoDeRenda {
    private double totalTributos = 0;
    private List<Tributavel> tributaveis;

    public GerenciadorDeImpostoDeRenda() {
        tributaveis = new ArrayList<>();
    };
    public GerenciadorDeImpostoDeRenda(List<Tributavel> tributaveis) {
        this.tributaveis = tributaveis;
    }

    private void somaTributos() {
        for (Tributavel t : this.tributaveis) {
            this.totalTributos += t.calculaTributos();
        }
    }

    public double getTotalTributos() {
        somaTributos();
        return this.totalTributos;
    }

    public void getTributaveis() {
        System.out.println(tributaveis);
    }

    public void adicionar(Tributavel tributavel) {
        tributaveis.add(tributavel);
        somaTributos();
    }

    @Override
    public String toString() {
        String print = String.format("=== Gerenciador de Imposto de Renda ===\n" +
                "Total de tributos = R$ %.2f\n" +
                "Lista de tributaveis:\n", this.getTotalTributos());
        String listaTributaveis = "";
        for(Tributavel t : tributaveis) {
            listaTributaveis += "- " + t + "\n";
        }
        return print + listaTributaveis + "=======================================";

    }
}
