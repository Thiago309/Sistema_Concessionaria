package controller;
import models.servicos.Servico;
import repository_jpa.ServicoRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ServicosController {
    Scanner input = new Scanner(System.in);
    Servico servico =  new Servico();

    int idServico;
    String dataInicial, dataFinal, condicaoNeociacao, descricaoServico ;

    public void addServico() {

        System.out.println("Você selecionou a opção registrar um serviço.\n");
        /*O id do serviço tem que ser informado já que é uma tabela de relacionamento com a tabela manutenção ou
        seguro*/

        System.out.println("Digite o id do servico: ");
        idServico = input.nextInt();
        servico.setIdServico(idServico);

        while(true) {

            Date servDataInicial = null, servDataFinal = null; // iniciando variaveis
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

            System.out.print("Informe a Data Inicial do servico (dd/MM/yyyy): ");
            dataInicial = input.next();

            System.out.print("Informe a Data Final (dd/MM/yyyy): ");
            dataFinal = input.next();

            try {
                servDataInicial = formatoData.parse(dataInicial);
                servico.setDataInicial(String.valueOf(servDataInicial));

                servDataFinal = formatoData.parse(dataFinal);
                servico.setDataFinal(String.valueOf(servDataFinal));

                System.out.println("Datas registradas com sucesso: " + "Data Inicial " + servDataInicial + "\nData Final "
                        + servDataFinal + "\n");
                break;

            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
            }
        }

        System.out.println("Informe a condição de negociacao: ");
        condicaoNeociacao = input.nextLine();
        servico.setCondicaoNegociacao(condicaoNeociacao);

        System.out.println("Descreva como o serviço foi realizado: ");
        descricaoServico = input.nextLine();
        servico.setDescricaoServico(descricaoServico);

        //repositorioServicos.criar(servico);
        ServicoRepository.saveAccount(servico);
        System.out.println("Servico "+ servico.getIdServico()+ " resgistrado com sucesso!");

    }

    public void deleteServico() {

        System.out.println("Você selecionou a opção deletar um serviço.\n");
        System.out.print("Informe o ID do servico: ");
        idServico = input.nextInt();

        if (idServico != 0) {
            //repositorioServicos.remover(idServico);
            ServicoRepository.removeAccountById(idServico);
            System.out.println("Servico "+ servico.getIdServico()+ " removido com sucesso!");

        }else{
            System.out.println("Serviço não encontrado em nosso banco de dados!");

        }
    }

    public void readServico() {
        System.out.println("Você selecionou a opção buscar por um serviço.\n");
        System.out.print("Informe o ID do servico: ");
        idServico = input.nextInt();

        if (idServico != 0) {
            //System.out.println("Informações do Serviço:\n " + repositorioServicos.buscar(idServico));
            System.out.println("Informações do Serviço:\n " + ServicoRepository.getById(idServico));

        }else{
            System.out.println("Servico não encontrado em nosso banco de dados!");
        }
    }

    public void getAllServicos() {
        System.out.println("Você selecionou a opção listar todos os serviços.\n");
        //System.out.println(repositorioServicos.listarTodos());

        for (Servico Servico : ServicoRepository.listAll()) {
            System.out.println(servico);
        }
    }
}