package models.funcionarios;
import jakarta.persistence.*;

@Entity
@Table(name="Funcionario")
@MappedSuperclass
public class Funcionario {
    @Id
    @Column(name="idFuncionario")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera ID automaticamente no banco
    private int idFuncionario;

    @Column(name="nome")
    private String nome;

    public Funcionario(int idFuncionario, String nome) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
    }

    public Funcionario() {}

    public int getIdFuncionario() {return idFuncionario;}
    public void setIdFuncionario(int idFuncionario) {this.idFuncionario = idFuncionario;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
}