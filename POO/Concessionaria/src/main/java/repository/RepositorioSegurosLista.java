package repository;
import interfaces.RepositorioSeguros;
import models.servicos.Seguro;
import java.util.ArrayList;
import java.util.List;

public class RepositorioSegurosLista implements RepositorioSeguros {
    private List<Seguro> seguros;

    public RepositorioSegurosLista() {seguros = new ArrayList<Seguro>();}

    @Override
    public void criar(Seguro seguro) {seguros.add(seguro);}

    @Override
    public Seguro buscar(int idseguro){
        Seguro seguroProcurado = null;
        for (Seguro seguro : seguros) {
            if (seguro.getNumeroApolice() == idseguro) {
                seguroProcurado = seguro;
            }
        }
        return seguroProcurado;
    }

    @Override
    public void remover(int idseguro){
        int posicao = -1;
        for (Seguro seguro : seguros) {
            if (seguro.getIdSeguro() == idseguro) {
                posicao = seguro.getIdSeguro();
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
