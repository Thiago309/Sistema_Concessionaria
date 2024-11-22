package interfaces;

import java.util.List;
import models.automoveis.Veiculo;

public interface RepositorioVeiculos {
    void criar(Veiculo veiculo);
    Veiculo buscar(String chassi);
    void remover(String chassi);
    void editar(Veiculo veiculo);
    List<Veiculo> listarTodos();
}
