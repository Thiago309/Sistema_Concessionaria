package Models;
import jakarta.persistence.*;
import java.util.List;

public class Funcionario {
    private String idFuncionario;  // Verifique se este é o tipo desejado (String ou int)
    private String nome;
    private List<Ncv> ncvs;
    private List<Nvv> nvv;

    // Construtor
    public Funcionario(String idFuncionario, String nome, List<Ncv> ncv, List<Nvv> nvv) {
        this.idFuncionario = idFuncionario;
        this.nome = nome;
        this.ncvs = ncvs;
        this.nvv = nvv;
    }

    // Getters e Setters
    public String getIdFuncionario() {  // Altere para int se idFuncionario for um int
        return idFuncionario;
    }

    public void setIdFuncionario(String idFuncionario) {  // Altere para int se necessário
        this.idFuncionario = idFuncionario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Ncv> getNcvs() {
        return ncvs;
    }

    public void setNcvs(List<Ncv> ncvs) {
        this.ncvs = ncvs;
    }

    public List<Nvv> getNvv() {
        return nvv;
    }

    public void setNvv(List<Nvv> nvv) {
        this.nvv = nvv;
    }
}
