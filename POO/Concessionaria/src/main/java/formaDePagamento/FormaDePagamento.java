package formaDePagamento;

import java.util.Date;

public class FormaDePagamento {
    private String idPagamento;
    private Date data;
    private double valor;

    public FormaDePagamento(String idPagamento, Date data, double valor) {
        this.idPagamento = idPagamento;
        this.data = data;
        this.valor = valor;
    }

    public String getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(String idPagamento) {
        this.idPagamento = idPagamento;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
