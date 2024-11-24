package interfaces;
import java.util.List;
import models.notas.Ncv;

public interface RepositorioNcvs {
    void criar(Ncv ncv);
    Ncv buscar(int idNCV);
    void remover(int idNCV);
    void editar(Ncv ncv);
    List<Ncv> listarTodos();
}
