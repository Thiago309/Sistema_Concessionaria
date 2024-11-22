package interfaces;

import java.util.List;
import models.clientes.Cliente;

public interface RepositorioClientes {
    void criar(Cliente cliente);
    Cliente buscar(String cpf);
    void remover(String cpf);
    void editar(Cliente cliente);
    List<Cliente> listarTodos();
}