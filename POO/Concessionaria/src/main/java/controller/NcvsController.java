package controller;
import models.notas.Ncv;
import repository_jpa.NcvRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*****************************************************************
 * Nota de Compra do Veiculo (NCV).                              *
 * Este metodo regista todos as compras de veiculos dos clientes *
 * em um banco de dados.                                         *
 *****************************************************************/

public class NcvsController {
    //RepositorioNcvs nvcs;
    Ncv ncv = new Ncv();
    Scanner input = new Scanner(System.in);

    int idNCV,NcvIdFuncionario;
    String ncvChassi, dataNCV;
    double valorNCV;

    public void addNcv() {

        System.out.println("Você selecionou a opção registrar uma Nota de Compra de Veiculo.\n");
        System.out.println("Digite o chassi do Veiculo: ");
        ncvChassi = input.nextLine();
        ncv.setNcvChassi(ncvChassi);

        System.out.println("Digite a matricula do funcionario que realizou o processo: ");
        NcvIdFuncionario = input.nextInt();
        ncv.setNcvIdFuncionario(NcvIdFuncionario);

        while(true) {

            Date dataNCV1 = null;
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

            System.out.print("Informe a Data da compra do veiculo (dd/MM/yyyy): ");
            dataNCV = input.next();

            try {
                dataNCV1 = formatoData.parse(dataNCV);
                ncv.setDataNCV(String.valueOf(dataNCV1));
                System.out.println("Data registrada com sucesso: " + dataNCV1 + "\n");
                break;

            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
            }
        }
        System.out.println("Informe o valor da nota de Compra: ");
        valorNCV = input.nextDouble();
        ncv.setValorNCV(valorNCV);

        //repositorioNcvs.criar(ncv);
        //repositorioNcvs.salvarNota(Nota);
        NcvRepository.saveAccount(ncv);
        System.out.println("Nota de compra "+ ncv.getIdNCV() + " de veiculo resgistrada com sucesso!");
    }

    public void deleteNcv() {

        System.out.println("Você selecionou a opção remover uma nota de compra.\n");
        System.out.println("Digite o id da nota de compra: ");
        idNCV = input.nextInt();

        if(idNCV != 0){
            NcvRepository.removeAccountById(idNCV);
            System.out.println("Nota de compra "+ ncv.getIdNCV() +" removida com sucesso.");

        }else{
            System.out.println("Nota não encontrada em nosso banco de dados!");
        }
    }

    public void readNcv() {
        System.out.println("Você selecionou a opção buscar por uma nota de compra.\n");
        System.out.println("Digite o id da nota de compra: ");
        idNCV = input.nextInt();

        if(idNCV != 0){
            System.out.println("Informações da nota de compra:\n " + NcvRepository.getById(idNCV));

        }else{
            System.out.println("Nota de compra não encontrada em nosso banco de dados!");
        }
    }

    public void getAllNcvs() {
        System.out.println("Você selecionou a opção de listar todas as notas de compras.\n");
        //System.out.println(repositorioNcvs.listarTodos());
        System.out.println("Lista de Notas de Compras: ");

        for (Ncv ncv : NcvRepository.listAll()) {
            System.out.println(ncv);
        }
    }
}