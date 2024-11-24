package controller;
import interfaces.RepositorioNvvs;
import jakarta.persistence.Column;
import models.notas.Nvv;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*******************************************************************
 * Nota de Venda do Veiculo.                                       *
 * Este metodo regista todas as vendas dos veiculos para clientes  *
 * em um banco de dados.                                           *
 *******************************************************************/

public class NvvsController {
    Scanner input = new Scanner(System.in);
    Nvv nvv;

    int idNVV;
    String nvvChassi;
    int nvvIdFuncionario;
    String dataNVV;
    double valorNVV;

    public void addNvv(RepositorioNvvs repositorioNvvs) {
        nvv = new Nvv();

        System.out.println("Você selecionou a opção registrar uma Nota de Venda de Veiculo.\n");
        System.out.println("Digite o chassi do Veiculo: ");
        nvvChassi = input.nextLine();
        nvv.setNvvChassi(nvvChassi);

        System.out.println("Digite a matricula do funcionario que realizou o processo: ");
        nvvIdFuncionario = input.nextInt();
        nvv.setNvvIdFuncionario(nvvIdFuncionario);

        Date dataNVV1 = null;
        SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Informe a Data da venda do veiculo (dd/MM/yyyy): ");
        dataNVV = input.nextLine();

        try{
            dataNVV1 = formatoData.parse(dataNVV);
            nvv.setDataNVV(String.valueOf(dataNVV1));
            System.out.println("Data registrada com sucesso: " + dataNVV1 + "\n");

        } catch (ParseException e) {
            System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
        }

        System.out.println("Informe o valor da nota de Venda: ");
        valorNVV = input.nextDouble();
        nvv.setValorNVV(valorNVV);

        repositorioNvvs.criar(nvv);
    }

    public void deleteNvv(RepositorioNvvs repositorioNvvs) {
        System.out.println("Você selecionou a opção remover uma nota de venda.\n");
        System.out.println("Digite o id da nota de venda: ");
        idNVV = input.nextInt();

        if(idNVV != 0) {
            repositorioNvvs.remover(idNVV);
            System.out.println("Nota removida com sucesso.");
        }else{
            System.out.println("Nota não encontrada em nosso banco de dados!");
        }
    }

    public void readNvv(RepositorioNvvs repositorioNvvs) {
        System.out.println("Você selecionou a opção buscar por uma nota de venda.\n");
        System.out.println("Digite o id da nota de venda: ");
        idNVV = input.nextInt();

        if(idNVV != 0) {
            System.out.println("Informações da nota de venda:\n " + repositorioNvvs.buscar(idNVV));

        }else{
            System.out.println("Nota de venda não encontrada em nosso banco de dados!");
        }
    }

    public void getAllNvvs(RepositorioNvvs repositorioNvvs) {
        System.out.println("Você selecionou a opção de listar todas as notas de vendas.\n");
        System.out.println(repositorioNvvs.listarTodos());
    }
}
