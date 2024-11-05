package formaDePagamento;

import java.util.Date;

public class cartao {
    public class Cartao extends Pagamento {
        private int idCartao;
        private int numeroCartao;
        private String nome;
        private Date validade;
        private int cvv;
        private int numeroParcelas;
        private double valorParcelas;

        // Construtor
        public Cartao(int idPagamento, int idNf, Date dataEfetuacao, double valor, int idCartao, int numeroCartao,
                      String nome, Date validade, int cvv, int numeroParcelas, double valorParcelas) {
            super(idPagamento, idNf, dataEfetuacao, valor);
            this.idCartao = idCartao;
            this.numeroCartao = numeroCartao;
            this.nome = nome;
            this.validade = validade;
            this.cvv = cvv;
            this.numeroParcelas = numeroParcelas;
            this.valorParcelas = valorParcelas;
        }

        // Getters e Setters
        public int getIdCartao() {
            return idCartao;
        }

        public void setIdCartao(int idCartao) {
            this.idCartao = idCartao;
        }

        public int getNumeroCartao() {
            return numeroCartao;
        }

        public void setNumeroCartao(int numeroCartao) {
            this.numeroCartao = numeroCartao;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public Date getValidade() {
            return validade;
        }

        public void setValidade(Date validade) {
            this.validade = validade;
        }

        public int getCvv() {
            return cvv;
        }

        public void setCvv(int cvv) {
            this.cvv = cvv;
        }

        public int getNumeroParcelas() {
            return numeroParcelas;
        }

        public void setNumeroParcelas(int numeroParcelas) {
            this.numeroParcelas = numeroParcelas;
        }

        public double getValorParcelas() {
            return valorParcelas;
        }

        public void setValorParcelas(double valorParcelas) {
            this.valorParcelas = valorParcelas;
        }

        // Método para exibir informações do cartão
        @Override
        public void exibirInfo() {
            super.exibirInfo();
            System.out.println("ID Cartão: " + idCartao);
            System.out.println("Número do Cartão: " + numeroCartao);
            System.out.println("Nome: " + nome);
            System.out.println("Validade: " + validade);
            System.out.println("CVV: " + cvv);
            System.out.println("Número de Parcelas: " + numeroParcelas);
            System.out.println("Valor das Parcelas: " + valorParcelas);
        }
    }

}
