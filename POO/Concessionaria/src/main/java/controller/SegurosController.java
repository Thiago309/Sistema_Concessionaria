package controller;
import models.servicos.Seguro;
import repository_jpa.SegurosRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SegurosController {
    Scanner input = new Scanner(System.in);
    Seguro seguro = new Seguro();
    Seguro seguroAtualizado = new Seguro();

    int idseguro, numeroApolice;
    String segChassi, segDataInicial, segDataFinal, cobertura ;
    double segPreco, franquia;

    public void addSeguro() {

        System.out.println("Você selecionou a opção registrar um seguro.\n");
        System.out.println("Digite o numero da Apolice do seguro: ");
        numeroApolice = input.nextInt();
        seguro.setNumeroApolice(numeroApolice);

        System.out.println("Digite o numero de chassi do veiculo: ");
        segChassi = input.next();
        seguro.setSegChassi(segChassi);

        while(true) {

            Date segDataInicial1 = null, segDataFinal1 = null;
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

            System.out.print("Informe a Data Inicial do servico (dd/MM/yyyy): ");
            segDataInicial = input.next();

            System.out.print("Informe a Data Final (dd/MM/yyyy): ");
            segDataFinal = input.next();

            try {
                segDataInicial1 = formatoData.parse(segDataInicial);
                seguro.setSegDataInicial(String.valueOf(segDataInicial1));

                segDataFinal1 = formatoData.parse(segDataFinal);
                seguro.setSegDataFinal(String.valueOf(segDataFinal1));

                System.out.println("Datas registradas com sucesso: " + "Data Inicial " + segDataInicial1 + "\nData Final "
                        + segDataFinal1 + "\n");
                break;

            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
            }
        }

        System.out.println("Informe o preço do seguro: ");
        segPreco = input.nextDouble();
        seguro.setSegPreco(segPreco);

        // Colisão, Roubo ou Danos a Terceiros.
        System.out.println("Informe o tipo de cobertura do seguro (Colisão, Roubo ou Danos a Terceiros.): ");
        cobertura = input.next();
        seguro.setCobertura(cobertura);

        // Valor que o segurado deve pagar em caso de sinistro antes do seguro cobrir o restante.
        System.out.println("Informe o valor do franquia do seguro: ");
        franquia = input.nextDouble();
        seguro.setFranquia(franquia);

        SegurosRepository.saveAccount(seguro);
        System.out.println("Seguro do veiculo "
                + seguro.getSegChassi()+ " resgistrada com sucesso!");
    }

    public void deleteSeguro() {

        System.out.println("Você selecionou a opção remover um seguro.\n");
        System.out.println("Digite o ID do seguro: ");
        idseguro = input.nextInt();

        if (idseguro != 0){
            SegurosRepository.removeAccountById(idseguro);
            System.out.println("Seguro "+ seguro.getNumeroApolice() + " removido com sucesso!");

        }else{
            System.out.println("Seguro não encontrado em nosso banco de dados!");
        }
    }

    public void readSeguro() {

        System.out.println("Você selecionou a opção buscar por um seguro.\n");
        System.out.println("Digite o ID do seguro: ");
        idseguro = input.nextInt();

        if (idseguro != 0){
            System.out.println("Informações do Seguro:\n " + SegurosRepository.getById(idseguro));

        } else{
            System.out.println("Seguro não encontrado em nosso banco de dados!");
        }
    }

    public void getAllSeguros() {
        System.out.println("Você selecionou a opção de listar todos os seguros.\n");
        //System.out.println(repositorioSeguros.listarTodos());
        System.out.println("Lista de Seguros: ");

        for (Seguro seguro : SegurosRepository.listAll()) {
            System.out.println(seguro);
        }
    }

    public void updateSeguro(){

        System.out.println("Você selecionou a opção Alterar um seguro.\n");
        System.out.println("Informe o ID do seguro: ");
        idseguro = input.nextInt();
        seguro.setNumeroApolice(idseguro);

        System.out.println("Digite o numero da Apolice do seguro: ");
        numeroApolice = input.nextInt();
        seguroAtualizado.setNumeroApolice(numeroApolice);

        System.out.println("Digite o numero de chassi do veiculo: ");
        segChassi = input.next();
        seguroAtualizado.setSegChassi(segChassi);

        while(true) {

            Date segDataInicial1 = null, segDataFinal1 = null;
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

            System.out.print("Informe a Data Inicial do servico (dd/MM/yyyy): ");
            segDataInicial = input.next();

            System.out.print("Informe a Data Final (dd/MM/yyyy): ");
            segDataFinal = input.next();

            try {
                segDataInicial1 = formatoData.parse(segDataInicial);
                seguroAtualizado.setSegDataInicial(String.valueOf(segDataInicial1));

                segDataFinal1 = formatoData.parse(segDataFinal);
                seguroAtualizado.setSegDataFinal(String.valueOf(segDataFinal1));

                System.out.println("Datas registradas com sucesso: " + "Data Inicial " + segDataInicial1 + "\nData Final "
                        + segDataFinal1 + "\n");
                break;

            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
            }
        }

        System.out.println("Informe o preço do seguro: ");
        segPreco = input.nextDouble();
        seguroAtualizado.setSegPreco(segPreco);

        // Colisão, Roubo ou Danos a Terceiros.
        System.out.println("Informe o tipo de cobertura do seguro (Colisão, Roubo ou Danos a Terceiros.): ");
        cobertura = input.next();
        seguroAtualizado.setCobertura(cobertura);

        // Valor que o segurado deve pagar em caso de sinistro antes do seguro cobrir o restante.
        System.out.println("Informe o valor do franquia do seguro: ");
        franquia = input.nextDouble();
        seguroAtualizado.setFranquia(franquia);

        SegurosRepository.updateAccount(seguroAtualizado);
        System.out.println("Seguro do veiculo " +seguro.getSegChassi()+ " resgistrada com sucesso!");
    }
}