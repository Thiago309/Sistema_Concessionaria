package Vedendor;

public class Funcionario {
    public class Vendedor {
        private String nome;
        private String matricula;
        private double comissao;

        // Construtor
        public Vendedor(String nome, String matricula, double comissao) {
            this.nome = nome;
            this.matricula = matricula;
            this.comissao = comissao;
        }

        // Método para vender um carro
        public Venda venderCarro(Carro carro, Cliente cliente) {
            double valorVenda = carro.getPreco();  // Supondo que a classe Carro tenha o método getPreco()
            Venda venda = new Venda(carro, cliente, valorVenda, this);
            return venda;
        }

        // Método para calcular a comissão com base no valor da venda
        public double calcularComissao(double valorVenda) {
            return valorVenda * comissao;
        }

        // Getters e Setters (opcional)
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getMatricula() {
            return matricula;
        }

        public void setMatricula(String matricula) {
            this.matricula = matricula;
        }

        public double getComissao() {
            return comissao;
        }

        public void setComissao(double comissao) {
            this.comissao = comissao;
        }
    }

}
