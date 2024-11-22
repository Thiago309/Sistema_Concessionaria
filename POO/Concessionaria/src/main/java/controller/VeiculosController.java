package controller;

import interfaces.RepositorioClientes;
import jakarta.persistence.Column;
import models.automoveis.Veiculo;
import interfaces.RepositorioVeiculos;
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

    public void addVeiculo(RepositorioVeiculos repositorioVeiculos){
        veiculo = new Veiculo();

        System.out.println("Digite o chassi do veiculo: ");
        chassi = input.nextLine();
        veiculo.setChassi(chassi);

        System.out.println("Digite a quantidade de Quilometros rodados pelo veiculo: ");
        qtdKm = input.nextDouble();
        veiculo.setQtdKm(qtdKm);

        System.out.println("Informe a cor do veiculo: ");
        cor = input.nextLine();
        veiculo.setCor(cor);

        System.out.println("Informe a localização no pátio: ");
        localizacaoPatio = input.nextLine();
        veiculo.setLocalizacaoPatio(localizacaoPatio);

        System.out.println("Informe o modelo do veiculo: ");
        modelo = input.nextLine();
        veiculo.setModelo(modelo);

        System.out.println("Informe a marca: ");
        marca = input.nextLine();
        veiculo.setMarca(marca);

        System.out.println("Informe o Status do veiculo (Disponivel ou não para a venda): ");
        statusVeiculo = input.nextLine();
        veiculo.setStatusVeiculo(statusVeiculo);

        System.out.println("Informe o ano do veiculo: ");
        ano = input.nextLine();
        veiculo.setAno(ano);
    }

    public void deleteVeiculo(RepositorioVeiculos repositorioClientes) {
        System.out.print("Digite o Chassi do veiculo: ");
        chassi = input.nextLine();

        if (chassi != null){
            repositorioClientes.remover(chassi);
            System.out.println("Cliente deletado com sucesso!");

        }else{
            System.out.println("Cliente não encontrado em nosso banco de dados!");

        }
    }
}
