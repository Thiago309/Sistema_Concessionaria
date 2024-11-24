package repository;
import interfaces.RepositorioNvvs;
import models.notas.Nvv;
import java.util.ArrayList;
import java.util.List;

public class RepositorioNvvLista implements RepositorioNvvs {
    List<Nvv> nvvs;

    public RepositorioNvvLista() {nvvs = new ArrayList<Nvv>();}

    @Override
    public void criar(Nvv nvv) {nvvs.add(nvv);}

    @Override
    public Nvv buscar(int idNVV) {
        Nvv nvvProcurado = null;
        for (Nvv nvv : nvvs) {
            if(nvv.getIdNVV() == idNVV) {
                nvvProcurado = nvv;
            }
        }
        return nvvProcurado;
    }

    @Override
    public void remover(int idNVV) {
        int posicao = -1;
        for (Nvv nvv : nvvs) {
            posicao = nvv.getIdNVV();
        }
        if(posicao != -1) {
            nvvs.remove(posicao);
        }
    }

    @Override
    public void editar(Nvv nvv) {}

    @Override
    public List<Nvv> listarTodos(){
        return nvvs;
    }
}
