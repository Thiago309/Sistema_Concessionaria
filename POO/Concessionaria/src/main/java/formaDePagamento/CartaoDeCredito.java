package formaDePagamento;

import java.util.Date;

public class CartaoDeCredito extends FormaDePagamento {
    private String idCartao;
    private String numeroCartao;
    private String nome;
    private String validade;
    private int cvv;
    private int nrParcelas;
    private double vlParcelas;

    public CartaoDeCredito(String idPagamento, Date data, double valor, String idCartao, String numeroCartao,
                           String nome, String validade, int cvv, int nrParcelas, double vlParcelas) {
        super(idPagamento, Date, valor);
        this.idCartao = idCartao;
        this.numeroCartao = numeroCartao;
        this.nome = nome;
        this.validade = validade;
        this.cvv = cvv;
        this.nrParcelas = nrParcelas;
        this.vlParcelas = vlParcelas;
    }

    public String getIdCartao() {
        return idCartao;
    }

    public void setIdCartao(String idCartao) {
        this.idCartao = idCartao;
    }

    public String getNumeroCartao() {
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public double calcularValorTotalParcelas() {
        return nrParcelas * vlParcelas;
    }
}
