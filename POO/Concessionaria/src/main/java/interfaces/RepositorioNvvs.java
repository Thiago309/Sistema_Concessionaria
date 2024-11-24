package interfaces;
import java.util.List;
import models.notas.Nvv;

public interface RepositorioNvvs {
    void criar(Nvv nvv);
    Nvv buscar(int idNVV);
    void remover(int idNVV);
    void editar(Nvv nvv);
    List<Nvv> listarTodos();
}
