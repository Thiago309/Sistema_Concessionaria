package repository;
import interfaces.RepositorioNcvs;
import models.notas.Ncv;
import java.util.ArrayList;
import java.util.List;

public class RepositorioNcvLista implements RepositorioNcvs {
    private List<Ncv> ncvs;

    public RepositorioNcvLista() {ncvs = new ArrayList<Ncv>();}

    @Override
    public void criar(Ncv ncv) {ncvs.add(ncv);}

    @Override
    public Ncv buscar(int idNCV) {
        Ncv ncvProcurado = null;
        for (Ncv ncv : ncvs) {
            if(ncv.getIdNCV() == idNCV) {
                ncvProcurado = ncv;
            }
        }
        return ncvProcurado;
    }

    @Override
    public void remover(int idNCV) {
        int posicao = -1;
        for (Ncv ncv : ncvs) {
            if(ncv.getIdNCV() == idNCV) {
                posicao = ncv.getIdNCV();
            }
        }
        if(posicao != -1) {
            ncvs.remove(posicao);
        }
    }

    @Override
    public void editar(Ncv ncv) {}

    @Override
    public List<Ncv> listarTodos(){
        return this.ncvs;
    }
}
