package formaDePagamento;

import java.util.Date;

public class Cheque extends FormaDePagamento {
    private String numeroCheque;
    private String banco;
    private String agencia;

    public Cheque(String idPagamento, Date data, double valor, String numeroCheque, String banco, String agencia) {
        super(idPagamento, data, valor);
        this.numeroCheque = numeroCheque;
        this.banco = banco;
        this.agencia = agencia;
    }

    public String getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(String numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

}
