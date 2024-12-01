package models.funcionarios;
import jakarta.persistence.*;

@Entity
@Table(name="Funcionario")
@MappedSuperclass
public class Funcionario {
    @Id
    @Column(name="idfuncionario")
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Gera ID automaticamente no banco
    private int idfuncionario;

    @Column(name="nome")
    private String nome;

    public Funcionario(int idfuncionario, String nome) {
        this.idfuncionario = idfuncionario;
        this.nome = nome;
    }

    public Funcionario() {}

    public int getIdFuncionario() {return idfuncionario;}
    public void setIdFuncionario(int idfuncionario) {this.idfuncionario = idfuncionario;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}
}