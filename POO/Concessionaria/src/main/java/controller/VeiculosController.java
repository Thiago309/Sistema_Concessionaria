package controller;

import interfaces.RepositorioVeiculos;
import jakarta.persistence.Column;
import models.veiculos.Veiculo;
import java.util.Scanner;

public class VeiculosController {
    Scanner input = new Scanner(System.in);
    Veiculo veiculo;

    int idVeiculo;
    String chassi;
    double qtdKm;
    String cor;
    String localizacaoPatio;
    String modelo;
    String marca;
    String statusVeiculo;
    String ano;

    public void addVeiculo(RepositorioVeiculos repositorioVeiculos) {
        veiculo = new Veiculo();

        System.out.println("Digite o numero de chassi do veiculo: ");
        chassi = input.nextLine();
        veiculo.setChassi(chassi);

        System.out.println("Digite a quantidade de quilometros rodados: ");
        qtdKm = input.nextDouble();
        veiculo.setQtdKm(qtdKm);

        System.out.println("Digite a cor do automovel: ");
        cor = input.nextLine();
        veiculo.setCor(cor);

        System.out.println("Digite o localizacao no pátio: ");
        localizacaoPatio = input.nextLine();
        veiculo.setLocalizacaoPatio(localizacaoPatio);

        System.out.println("Digite o modelo: ");
        modelo = input.nextLine();
        veiculo.setModelo(modelo);

        System.out.println("Digite o marca: ");
        marca = input.nextLine();
        veiculo.setMarca(marca);

        System.out.println("Informe o Status do veiculo (Disponivel ou não para a venda): ");
        statusVeiculo = input.nextLine();
        veiculo.setStatusVeiculo(statusVeiculo);

        repositorioVeiculos.criar(veiculo);
    }

    public void deleteVeiculo(RepositorioVeiculos repositorioVeiculos) {
        System.out.print("Digite o Chassi do veiculo: ");
        chassi = input.nextLine();

        if (chassi != null) {
            repositorioVeiculos.remover(chassi);
            System.out.println("Veiculo deletado com sucesso!");

        } else {
            System.out.println("Veiculo não encontrado em nosso banco de dados!");

        }
    }

    public void readVeiculo(RepositorioVeiculos repositorioVeiculos) {
        System.out.print("Digite o Chassi do veiculo: ");
        chassi = input.nextLine();

        if (chassi != null) {
            System.out.println("Informações do Veiculo: \n" + repositorioVeiculos.buscar(chassi));

        }else {
            System.out.println("Veiculo não encontrado em nosso bando de dados!");

        }
    }

    public void getAllClientes(RepositorioVeiculos repositorioVeiculos) {
        System.out.println(repositorioVeiculos.listarTodos());
    }
}
