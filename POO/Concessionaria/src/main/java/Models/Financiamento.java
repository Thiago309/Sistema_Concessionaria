package Models;

import java.util.Date;

public class Financiamento extends Pagamento {
    private int idFinanciamento;
    private double finValorParcelas;
    private int finNumeroParcelas;
    private double juros;

    // Construtor
    public Financiamento(int idPagamento, int idNf, Date dataEfetuacao, double valor, int idFinanciamento,
                         double finValorParcelas, int finNumeroParcelas, double juros) {
        super(idPagamento, idNf, dataEfetuacao, valor);
        this.idFinanciamento = idFinanciamento;
        this.finValorParcelas = finValorParcelas;
        this.finNumeroParcelas = finNumeroParcelas;
        this.juros = juros;
    }

    // Getters e Setters
    public int getIdFinanciamento() {
        return idFinanciamento;
    }

    public void setIdFinanciamento(int idFinanciamento) {
        this.idFinanciamento = idFinanciamento;
    }

    public double getFinValorParcelas() {
        return finValorParcelas;
    }

    public void setFinValorParcelas(double finValorParcelas) {
        this.finValorParcelas = finValorParcelas;
    }

    public int getFinNumeroParcelas() {
        return finNumeroParcelas;
    }

    public void setFinNumeroParcelas(int finNumeroParcelas) {
        this.finNumeroParcelas = finNumeroParcelas;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    // Método para exibir informações do financiamento
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("ID Financiamento: " + idFinanciamento);
        System.out.println("Valor das Parcelas: " + finValorParcelas);
        System.out.println("Número de Parcelas: " + finNumeroParcelas);
        System.out.println("Juros: " + juros);
    }
}

