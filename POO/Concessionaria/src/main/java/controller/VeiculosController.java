package controller;
import models.veiculos.Veiculo;
import repository_jpa.VeiculosRepository;
import java.util.Scanner;

public class VeiculosController {
    Scanner input = new Scanner(System.in);
    Veiculo veiculo = new Veiculo();

    int idVeiculo;
    String chassi, cor, localizacaoPatio, modelo, marca, statusVeiculo, ano;
    double qtdKm;


    public void addVeiculo() {

        System.out.println("Digite o numero de chassi do veiculo: ");
        chassi = input.nextLine();
        veiculo.setChassi(chassi);

        System.out.println("Digite a quantidade de quilometros rodados: ");
        qtdKm = input.nextDouble();
        veiculo.setQtdKm(qtdKm);

        input.nextLine();

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

        System.out.println("Informe o ano do veiculo: ");
        ano = input.nextLine();  // Agora lê o ano corretamente
        veiculo.setAno(ano);

        //repositorioVeiculos.criar(veiculo);
        VeiculosRepository.saveAccount(veiculo);
        System.out.println("\nVeículo cadastrado com sucesso!");
    }

    public void deleteVeiculo() {
        System.out.print("Digite o Chassi do veiculo: ");
        chassi = input.nextLine();

        if (chassi != null) {
            //repositorioVeiculos.remover(chassi);
            VeiculosRepository.removeAccountById(idVeiculo);
            System.out.println("Veiculo deletado com sucesso!");

        } else {
            System.out.println("Veiculo não encontrado em nosso banco de dados!");
        }
    }

    public void readVeiculo() {
        System.out.print("Digite o Chassi do veiculo: ");
        chassi = input.nextLine();

        if (chassi != null) {
            //System.out.println("Informações do Veiculo: \n" + repositorioVeiculos.buscar(chassi));
            System.out.println("Informações do Veiculo: \n" + VeiculosRepository.getById(idVeiculo));

        }else {
            System.out.println("Veiculo não encontrado em nosso bando de dados!");
        }
    }

    public void getAllClientes() {
        System.out.println("Você selecionou a opção de listar todas veiculos.\n");
        //System.out.println(repositorioVeiculos.listarTodos());
        System.out.println("Lista de Veiculos: ");

        for (Veiculo veiculo : VeiculosRepository.listAll()) {
            System.out.println(veiculo);
        }
    }
}