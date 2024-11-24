package interfaces;
import java.util.List;
import models.funcionarios.Funcionario;

public interface RepositorioFuncionarios {
    void criar(Funcionario funcionario);
    Funcionario buscar(int idFuncionario);
    void remover(int idFuncionario);
    void editar(Funcionario funcionario);
    List<Funcionario> listarTodos();
}