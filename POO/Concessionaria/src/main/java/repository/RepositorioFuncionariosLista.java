package repository;
import interfaces.RepositorioFuncionarios;
import models.funcionarios.Funcionario;
import java.util.ArrayList;
import java.util.List;

public class RepositorioFuncionariosLista implements RepositorioFuncionarios {
    private List<Funcionario> funcionarios;

    public RepositorioFuncionariosLista() {funcionarios = new ArrayList<Funcionario>();}

    @Override
    public void criar(Funcionario funcionario) {funcionarios.add(funcionario);}

    @Override
    public Funcionario buscar(int idFuncionario) {
        Funcionario funcionarioProcurado = null;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getIdFuncionario() == idFuncionario) {
                funcionarioProcurado = funcionario;
            }
        }
        return funcionarioProcurado;
    }

    @Override
    public void remover(int idFuncionario) {
        int posicao = -1;
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getIdFuncionario() == idFuncionario) {
                posicao = funcionario.getIdFuncionario();
            }
            if(posicao != -1){
                funcionarios.remove(posicao);
            }
        }
    }

    @Override
    public void editar(Funcionario funcionario) {}

    @Override
    public List<Funcionario>listarTodos(){
        return this.funcionarios;
    }
}