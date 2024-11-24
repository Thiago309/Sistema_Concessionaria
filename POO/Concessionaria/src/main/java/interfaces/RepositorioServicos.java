package interfaces;
import java.util.List;
import models.servicos.Servico;

public interface RepositorioServicos {
    void criar(Servico servico);
    Servico buscar(int idServico);
    void remover(int idServico);
    void editar(Servico servico);
    List<Servico> listarTodos();
}
