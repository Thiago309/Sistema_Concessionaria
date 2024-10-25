package formaDePagamento;

import java.util.Date;

public class Financiamento extends FormaDePagamento {
    private String idFinanciamento;
    private int nrParcelas;
    private double juros;
    private double vlParcelas;

    public Financiamento(String idPagamento, Date data, double valor, String idFinanciamento, int nrParcelas,
                         double juros, double vlParcelas) {
        super(idPagamento, data, valor);
        this.idFinanciamento = idFinanciamento;
        this.nrParcelas = nrParcelas;
        this.juros = juros;
        this.vlParcelas = vlParcelas;
    }

    public String getIdFinanciamento() {
        return idFinanciamento;
    }

    public void setIdFinanciamento(String idFinanciamento) {
        this.idFinanciamento = idFinanciamento;
    }

    public double calcularJurosTotais() {
        return (vlParcelas * nrParcelas) * (juros / 100);
    }
}
