package interfaces;

import java.util.List;
import models.servicos.Seguro;

public interface RepositorioSeguros {
    void criar(Seguro seguro);
    Seguro buscar(int numeroApolice);
    void remover(int numeroApolice);
    void editar(Seguro seguro);
    List<Seguro> listarTodos();
}