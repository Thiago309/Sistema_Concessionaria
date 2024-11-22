package Models;
import java.util.Date;
import jakarta.persistence.*;
public class Pagamento {
    private int idPagamento;
    private int idNf;
    private Date dataEfetuacao;
    private double valor;

    // Construtor
    public Pagamento(int idPagamento, int idNf, Date dataEfetuacao, double valor) {
        this.idPagamento = idPagamento;
        this.idNf = idNf;
        this.dataEfetuacao = dataEfetuacao;
        this.valor = valor;
    }

    // Getters e Setters
    public int getIdPagamento() {
        return idPagamento;
    }

    public void setIdPagamento(int idPagamento) {
        this.idPagamento = idPagamento;
    }

    public int getIdNf() {
        return idNf;
    }

    public void setIdNf(int idNf) {
        this.idNf = idNf;
    }

    public Date getDataEfetuacao() {
        return dataEfetuacao;
    }

    public void setDataEfetuacao(Date dataEfetuacao) {
        this.dataEfetuacao = dataEfetuacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    // Método para exibir informações do Pagamento
    public void exibirInfo() {
        System.out.println("ID Pagamento: " + idPagamento);
        System.out.println("ID NF: " + idNf);
        System.out.println("Data de Efetuação: " + dataEfetuacao);
        System.out.println("Valor: " + valor);
    }
}


