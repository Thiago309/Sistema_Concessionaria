package controller;
import models.notas.Nvv;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import repository_jpa.NvvRepository;

/*******************************************************************
 * Nota de Venda do Veiculo.                                       *
 * Este metodo regista todas as vendas dos veiculos para clientes  *
 * em um banco de dados.                                           *
 *******************************************************************/

public class NvvsController {
    //RepositorioNvvs nvvs;
    Nvv nvv = new Nvv();
    Scanner input = new Scanner(System.in);

    int idNVV, nvvIdFuncionario;
    String nvvChassi, dataNVV;
    double valorNVV;

    public void addNvv() {
        //nvvs = new RepositorioNvvLista();

        System.out.println("Você selecionou a opção registrar uma Nota de Venda de Veiculo.\n");
        System.out.println("Digite o chassi do Veiculo: ");
        nvvChassi = input.nextLine();
        nvv.setNvvChassi(nvvChassi);

        System.out.println("Digite a matricula do funcionario que realizou o processo: ");
        nvvIdFuncionario = input.nextInt();
        nvv.setNvvIdFuncionario(nvvIdFuncionario);

        while(true) {

            Date dataNVV1 = null;
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

            System.out.print("Informe a Data da venda do veiculo (dd/MM/yyyy): ");
            dataNVV = input.next();

            try {
                dataNVV1 = formatoData.parse(dataNVV);
                nvv.setDataNVV(String.valueOf(dataNVV1));
                System.out.println("Data registrada com sucesso: " + dataNVV1 + "\n");
                break;

            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
            }
        }
        System.out.println("Informe o valor da nota de Venda: ");
        valorNVV = input.nextDouble();
        nvv.setValorNVV(valorNVV);

        //repositorioNvvs.criar(nvv);
        NvvRepository.saveAccount(nvv);
        System.out.println("Nota de venda "+ nvv.getIdNVV() + " de veiculo resgistrada com sucesso!");

    }

    public void deleteNvv() {
        System.out.println("Você selecionou a opção remover uma nota de venda.\n");
        System.out.println("Digite o id da nota de venda: ");
        idNVV = input.nextInt();

        if(idNVV != 0) {
            //repositorioNvvs.remover(idNVV);
            NvvRepository.removeAccountById(idNVV);
            System.out.println("Nota de venda "+ nvv.getIdNVV() + " de veiculo removida com sucesso!");

        }else{
            System.out.println("Nota não encontrada em nosso banco de dados!");
        }
    }

    public void readNvv() {
        System.out.println("Você selecionou a opção buscar por uma nota de venda.\n");
        System.out.println("Digite o id da nota de venda: ");
        idNVV = input.nextInt();

        if(idNVV != 0) {
            //System.out.println("Informações da nota de venda:\n " + repositorioNvvs.buscar(idNVV));
            System.out.println("Informações da nota de venda:\n " + NvvRepository.getById(idNVV));
        }else{
            System.out.println("Nota de venda não encontrada em nosso banco de dados!");
        }
    }

    public void getAllNvvs() {
        System.out.println("Você selecionou a opção de listar todas as notas de vendas.\n");
        //System.out.println(repositorioNvvs.listarTodos());
        System.out.println("Lista de Notas de Vendas: ");

        for (Nvv nvv : NvvRepository.listAll()){
            System.out.println(nvv);
        }
    }
}
