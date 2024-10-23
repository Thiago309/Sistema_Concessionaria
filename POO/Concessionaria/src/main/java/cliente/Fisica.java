package cliente;

public class Fisica {
    import java.util.ArrayList;
import java.util.List;

    public class ClientePessoaFisica {
        // Atributos privados
        private String nome;
        private String cpf;
        private String telefone;
        private String email;
        private List<Venda> historicoCompras;

        // Construtor
        public ClientePessoaFisica(String nome, String cpf, String telefone, String email) {
            this.nome = nome;
            this.cpf = cpf;
            this.telefone = telefone;
            this.email = email;
            this.historicoCompras = new ArrayList<>();
        }

        // Método público para realizar compra
        public void realizarCompra(Carro carro) {
            Venda venda = new Venda(carro);
            historicoCompras.add(venda);
            System.out.println("Compra realizada com sucesso para " + nome);
        }

        // Método público para consultar histórico de compras
        public List<Venda> consultarHistoricoCompras() {
            return historicoCompras;
        }

        // Getters e Setters
        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getCpf() {
            return cpf;
        }

        public void setCpf(String cpf) {
            this.cpf = cpf;
        }

        public String getTelefone() {
            return telefone;
        }

        public void setTelefone(String telefone) {
            this.telefone = telefone;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }
    }

}
