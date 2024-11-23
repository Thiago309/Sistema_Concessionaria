package controller;

import interfaces.RepositorioSeguros;
import interfaces.RepositorioServicos;
import jakarta.persistence.Column;
import models.servicos.Seguro;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class SegurosController {
    Scanner input = new Scanner(System.in);
    Seguro seguro = new Seguro();

    int numeroApolice;
    String segChassi;
    String segDataInicial;
    String segDataFinal;
    double segPreco;
    String cobertura;
    double franquia;

    public void addSeguro(RepositorioSeguros repositorioSeguros) {
        seguro = new Seguro();

        System.out.println("Digite o numero da Apolice do seguro: ");
        numeroApolice = input.nextInt();
        seguro.setNumeroApolice(numeroApolice);

        System.out.println("Digite o numero de chassi do veiculo: ");
        segChassi = input.next();
        seguro.setSegChassi(segChassi);

        Date segDataInicial1 = null, segDataFinal1 = null;

        System.out.print("Informe a Data Inicial do servico (dd/MM/yyyy): ");
        segDataInicial = input.next();

        System.out.print("Informe a Data Final (dd/MM/yyyy): ");
        segDataFinal = input.next();
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        try{
            segDataInicial1 = formatoData.parse(segDataInicial);
            seguro.setSegDataInicial(String.valueOf(segDataInicial1));

            segDataFinal1 = formatoData.parse(segDataFinal);
            seguro.setSegDataFinal(String.valueOf(segDataFinal1));

            System.out.println("Datas registradas com sucesso: " + "Data Inicial " + segDataInicial1 + "\nData Final "
                    + segDataFinal1 + "\n");

        }catch (ParseException e){
            System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");

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

        repositorioSeguros.criar(seguro);
    }

    public void deleteSeguro(RepositorioSeguros repositorioSeguros) {
        System.out.println("Digite o numero da Apolice do seguro: ");
        numeroApolice = input.nextInt();

        if (numeroApolice != 0){
            repositorioSeguros.remover(numeroApolice);
            System.out.println("Seguro removido com sucesso!");

        }else{
            System.out.println("Seguro não encontrado em nosso banco de dados!");
        }
    }

    public void readSeguro(RepositorioSeguros repositorioSeguros) {
        System.out.println("Digite o numero da Apolice do seguro: ");
        numeroApolice = input.nextInt();
        if (numeroApolice != 0){
            System.out.println("Informações do Seguro:\n " + repositorioSeguros.buscar(numeroApolice));

        } else{
            System.out.println("Seguro não encontrado em nosso banco de dados!");
        }
    }

    public void getAllSeguros(RepositorioSeguros repositorioSeguros) {
        System.out.println(repositorioSeguros.listarTodos());
    }
}
