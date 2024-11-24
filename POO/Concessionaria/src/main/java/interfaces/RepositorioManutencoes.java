package interfaces;
import java.util.List;
import models.servicos.Manutencao;

public interface RepositorioManutencoes {
    void criar(Manutencao manutencao);
    Manutencao buscar(int idManutencao);
    void remover(int idManutencao);
    void editar(Manutencao manutencao);
    List<Manutencao> listarTodos();
}