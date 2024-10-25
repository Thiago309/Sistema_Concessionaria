package cliente;

public class Juridica extends Cliente {
    private String nomeFantasia;
    private String cnpj;
    private String site;
    private String inscricaoEstadual;

    public PessoaJuridica() {
        super(); // Chama o construtor padrão da superclasse
    }

    public PessoaJuridica(String idCliente, String cep, String logradouro, int numero, String complemento,
                          String nomeFantasia, String cnpj, String site, String inscricaoEstadual) {
        super(idCliente, cep, logradouro, numero, complemento);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.site = site;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
}
    /*
    import java.util.ArrayList;
import java.util.List;

    public class ClientePessoaJuridica {
        // Atributos privados
        private String nomeFantasia;
        private String cnpj;
        private String telefone;
        private String email;
        private List<Venda> historicoCompras;

        // Construtor
        public ClientePessoaJuridica(String nomeFantasia, String cnpj, String telefone, String email) {
            this.nomeFantasia = nomeFantasia;
            this.cnpj = cnpj;
            this.telefone = telefone;
            this.email = email;
            this.historicoCompras = new ArrayList<>();
        }

        // Método público para realizar compra
        public void realizarCompra(Carro carro) {
            Venda venda = new Venda(carro);
            historicoCompras.add(venda);
            System.out.println("Compra realizada com sucesso para " + nomeFantasia);
        }

        // Método público para consultar histórico de compras
        public List<Venda> consultarHistoricoCompras() {
            return historicoCompras;
        }

        // Getters e Setters
        public String getNomeFantasia() {
            return nomeFantasia;
        }

        public void setNomeFantasia(String nomeFantasia) {
            this.nomeFantasia = nomeFantasia;
        }

        public String getCnpj() {
            return cnpj;
        }

        public void setCnpj(String cnpj) {
            this.cnpj = cnpj;
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

     */