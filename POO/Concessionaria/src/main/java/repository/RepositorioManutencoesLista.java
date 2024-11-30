package repository;
import interfaces.RepositorioManutencoes;
import models.servicos.Manutencao;
import java.util.ArrayList;
import java.util.List;

public class RepositorioManutencoesLista implements RepositorioManutencoes {
    private List<Manutencao> manutencoes;

    public RepositorioManutencoesLista() {
        manutencoes = new ArrayList<Manutencao>();
    }

    @Override
    public void criar(Manutencao manutencao){manutencoes.add(manutencao);}

    @Override
    public Manutencao buscar(int idManutencao){
        Manutencao manutencaoProcurado = null;
        for (Manutencao manutencao : manutencoes) {
            if(manutencao.getIdManutencao() == idManutencao){
                manutencaoProcurado = manutencao;
            }
        }
        return manutencaoProcurado;
    }

    @Override
    public void remover(int idManutencao){
        int posicao = -1;
        for (Manutencao manutencao : manutencoes) {
            if(manutencao.getIdManutencao() == idManutencao){
                posicao = manutencao.getIdManutencao();
            }
        }
        if(posicao != -1){
            manutencoes.remove(posicao);
        }
    }

    @Override
    public void editar(Manutencao manutencao){}

    @Override
    public List<Manutencao> listarTodos(){
        return this.manutencoes;
    }
}