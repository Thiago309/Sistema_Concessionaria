package repository;

import interfaces.RepositorioSeguros;
import models.servicos.Seguro;
import java.util.ArrayList;
import java.util.List;

public class RepositorioSegurosLista implements RepositorioSeguros {
    List<Seguro> seguros;

    public RepositorioSegurosLista() {seguros = new ArrayList<Seguro>();}

    @Override
    public void criar(Seguro seguro) {seguros.add(seguro);}

    @Override
    public Seguro buscar(int numeroApolice){
        Seguro seguroProcurado = null;
        for (Seguro seguro : seguros) {
            if (seguro.getNumeroApolice() == numeroApolice) {
                seguroProcurado = seguro;
            }
        }
        return seguroProcurado;
    }

    @Override
    public void remover(int numeroApolice){
        int posicao = -1;
        for (Seguro seguro : seguros) {
            if (seguro.getNumeroApolice() == numeroApolice) {
                posicao = seguro.getNumeroApolice();
            }
        }
        if(posicao != -1){
            seguros.remove(posicao);
        }
    }

    @Override
    public void editar(Seguro seguro) {}

    @Override
    public List<Seguro> listarTodos(){
        return this.seguros;
    }
}
