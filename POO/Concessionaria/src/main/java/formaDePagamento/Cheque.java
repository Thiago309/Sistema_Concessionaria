package formaDePagamento;

import java.util.Date;

public class Cheque extends Pagamento {
    private int numeroCheque;
    private String agencia;
    private String banco;

    // Construtor
    public Cheque(int idPagamento, int idNf, Date dataEfetuacao, double valor, int numeroCheque, String agencia, String banco) {
        super(idPagamento, idNf, dataEfetuacao, valor);  // Certifique-se de que o construtor de 'Pagamento' existe
        this.numeroCheque = numeroCheque;
        this.agencia = agencia;
        this.banco = banco;
    }

    // Getters e Setters
    public int getNumeroCheque() {
        return numeroCheque;
    }

    public void setNumeroCheque(int numeroCheque) {
        this.numeroCheque = numeroCheque;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    // Método para exibir informações do cheque
    @Override
    public void exibirInfo() {
        super.exibirInfo();  // Certifique-se de que o método 'exibirInfo' existe em 'Pagamento'
        System.out.println("Número do Cheque: " + numeroCheque);
        System.out.println("Agência: " + agencia);
        System.out.println("Banco: " + banco);
    }
}
