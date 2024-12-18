package models.clientes;
import jakarta.persistence.*;

@Entity
@Table(name="Cliente") //Nome da tabela no SQL.
@MappedSuperclass
public class Cliente {
    @Id
    @Column(name="idcliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)// Gera ID automaticamente no banco
    private int idcliente;

    @Column(name="nome")
    private String nome;

    @Column(name="cpf")
    private String cpf;

    @Column(name="cep")
    private String cep;

    @Column(name="logradouro")
    private String logradouro;

    @Column(name="numero")
    private int numero;

    @Column(name="complemento")
    private String complemento;

    @Column(name="bairro")
    private String bairro;

    @Column(name="telefone")
    private String telefone;

    @Column(name="estado")
    private String estado;

    @Column(name="cidade")
    private String cidade;

    @Column(name="email")
    private String email;

    // Construtor
    public Cliente(String nome, String cpf,String cep, String logradouro, int numero, String complemento,
                   String bairro, String telefone, String estado, String cidade, String email) {

        this.nome = nome;
        this.cpf = cpf;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.telefone = telefone;
        this.estado = estado;
        this.cidade = cidade;
        this.email = email;
    }

    //Construtor da class Cliente
    public Cliente() {}

    // Getters e Setters
    public int getIdcliente() {return idcliente;}
    public void setIdcliente(int idcliente) {this.idcliente = idcliente;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}

    public String getCep() {return cep;}
    public void setCep(String cep) {this.cep = cep;}

    public String getLogradouro() {return logradouro;}
    public void setLogradouro(String logradouro) {this.logradouro = logradouro;}

    public int getNumero() {return numero;}
    public void setNumero(int numero) {this.numero = numero;}

    public String getComplemento() {return complemento;}
    public void setComplemento(String complemento) {this.complemento = complemento;}

    public String getBairro() {return bairro;}
    public void setBairro(String bairro) {this.bairro = bairro;}

    public String getTelefone() {return telefone;}
    public void setTelefone(String telefone) {this.telefone = telefone;}

    public String getEstado() {return estado;}
    public void setEstado(String estado) {this.estado = estado;}

    public String getCidade() {return cidade;}
    public void setCidade(String cidade) {this.cidade = cidade;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    @Override
    public String toString() {
        return "Cliente: " +
                "\nidCliente= " + idcliente +
                "\n nome= " + nome +
                "\n cpf= " + cpf +
                "\n cep= " + cep +
                "\n logradouro= " + logradouro +
                "\n numero= " + numero +
                "\n complemento= " + complemento +
                "\n bairro= " + bairro +
                "\n telefone= " + telefone +
                "\n estado= " + estado +
                "\n cidade= " + cidade +
                "\n email= " + email ;
    }
}