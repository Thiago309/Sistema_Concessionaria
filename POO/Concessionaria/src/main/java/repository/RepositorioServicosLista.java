package repository;

import interfaces.RepositorioServicos;
import models.servicos.Servico;
import java.util.ArrayList;
import java.util.List;

public class RepositorioServicosLista implements RepositorioServicos {
    List<Servico> servicos;

    public RepositorioServicosLista() {
        servicos = new ArrayList<Servico>();
    }

    @Override
    public void criar(Servico servico){servicos.add(servico);}

    @Override
    public Servico buscar(int idServico) {
        Servico servicoProcurado = null;
        for (Servico servico : servicos) {
            if (servico.getIdServico() == idServico) {
                servicoProcurado = servico;
            }
        }
        return servicoProcurado;
    }

    @Override
    public void remover(int idServico) {
        int posicao = -1;
        for (Servico servico : servicos) {
            if (servico.getIdServico() == idServico) {
                posicao = servico.getIdServico();
            }
        }
        if (posicao != -1) {
            servicos.remove(posicao);
        }
    }

    @Override
    public void editar(Servico servico) {}

    @Override
    public List<Servico> listarTodos(){
        return this.servicos;
    }
}