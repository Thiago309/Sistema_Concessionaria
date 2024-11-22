package repository;

import interfaces.RepositorioClientes;
import models.clientes.Cliente;

import java.util.ArrayList;
import java.util.List;

public class RepositorioClientesLista implements RepositorioClientes {
    List<Cliente> clientes;

    public RepositorioClientesLista() {
        clientes = new ArrayList<Cliente>();
    }

    @Override
    public void criar(Cliente cliente) { clientes.add(cliente); }

    public Cliente buscar(String cpf) {
        Cliente clienteProcurado = null;
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                clienteProcurado = cliente;
            }
        }
        return clienteProcurado;
    }

    @Override
    public void remover(String cpf) {
        int posicao = -1;
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equals(cpf)) {
                posicao = clientes.indexOf(cliente);
            }
        }
        if (posicao != -1) {
            clientes.remove(posicao);
        }
    }

    @Override
    public void editar(Cliente cliente) {

    }

    @Override
    public List<Cliente> listarTodos() {
        return this.clientes;
    }

}
