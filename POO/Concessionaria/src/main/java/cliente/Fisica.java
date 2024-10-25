package cliente;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Fisica extends Cliente {
    private String cpf;
    private String nome;
    private Date dataNascimento;
    private String telefone;
    private char sexo;

    public PessoaFisica() {
        super(); // Chama o construtor padrão da superclasse
    }

    public PessoaFisica(String idCliente, String cep, String logradouro, int numero, String complemento,
                        String cpf, String nome, Date dataNascimento, String telefone, char sexo) {
        super(idCliente, cep, logradouro, numero, complemento); // Chamada do construtor da superclasse
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.sexo = sexo;
    }

    public Fisica(String idCliente, String cep, String logradouro, int numero, String complemento) {
        super(idCliente, cep, logradouro, numero, complemento);
    }
}

    /*
    private String cpf;
    private String nome;
    private Date dataNascimento;
    private String telefone;
    private char sexo;

    public PessoaFisica(String idCliente, String cep, String logradouro, int numero, String complemento,
                        String cpf, String nome, Date dataNascimento, String telefone, char sexo) {
        super(idCliente, cep, logradouro, numero, complemento);
        this.cpf = cpf;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.sexo = sexo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
}
  /*

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

   */
     */

