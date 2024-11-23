package repository;

import interfaces.RepositorioVeiculos;
import models.veiculos.Veiculo;
import java.util.ArrayList;
import java.util.List;

public class RepositorioVeiculosLista implements RepositorioVeiculos {
    private List<Veiculo> veiculos;

    public RepositorioVeiculosLista() {
        veiculos = new ArrayList<Veiculo>();
    }


    @Override
    public void criar(Veiculo veiculo) {veiculos.add(veiculo);}

    @Override
    public Veiculo buscar(String chassi){
        Veiculo veiculoProcurado = null;
        for (Veiculo veiculo : veiculos) {
            if(veiculo.getChassi().equals(chassi)){
                veiculoProcurado = veiculo;
            }
        }
        return veiculoProcurado;
    }

    @Override
    public void remover(String chassi){
        int posicao = -1;
        for (Veiculo veiculo : veiculos) {
            if(veiculo.getChassi().equals(chassi)){
                posicao = veiculos.indexOf(veiculo);
            }
        }
        if(posicao != -1){
            veiculos.remove(posicao);
        }
    }

    @Override
    public void editar(Veiculo veiculo) {}

    @Override
    public List<Veiculo> listarTodos(){
        return this.veiculos;
    }
}
