package controller;
import models.servicos.Manutencao;
import repository_jpa.ManutencaoRepository;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ManutencaoController {
    Scanner input = new Scanner(System.in);
    Manutencao manutencao = new Manutencao();

    int idManutencao;
    String manuChassi,datapProximaManutencao, responsavel, tipoManutencao, Status;
    double custoManutencao;

    public void addManutencao() {

        System.out.println("Você selecionou a opção registrar uma manutenção.\n");
        System.out.println("Informe o numero do Chassi do veiculo: ");
        manuChassi = input.nextLine();
        manutencao.setManuChassi(manuChassi);

        System.out.println("Digite o custo da manutencao: ");
        custoManutencao = input.nextDouble();
        manutencao.setCustoManutencao(custoManutencao);

        System.out.println("Informe o técnico responsavel pela manutenção: ");
        responsavel = input.next();
        manutencao.setResponsavel(responsavel);

        System.out.println("Informe qual tipo de manutenção foi realizada (Preventiva / Corretiva): ");
        tipoManutencao = input.next();
        manutencao.setTipoManutencao(tipoManutencao);

        while(true) {

            Date datapProximaManutencao1 = null;
            SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

            System.out.println("Informe a data sugerida para a proxima manutenção.\n Informe neste formato (dd/MM/yyyy): ");
            datapProximaManutencao = input.next();

            try {
                datapProximaManutencao1 = formatoData.parse(datapProximaManutencao);
                manutencao.setDatapProximaManutencao(String.valueOf(datapProximaManutencao1));
                System.out.println("Data registrada com sucesso: " + datapProximaManutencao1 + "\n");
                break;

            } catch (ParseException e) {
                System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
            }
        }

        System.out.println("Informe a situação atual da manutenção (Em processo, concluida ou não efetuada com sucesso.): ");
        Status = input.next();
        manutencao.setStatus(Status);

        //repositorioManutencoes.criar(manutencao);
        ManutencaoRepository.saveAccount(manutencao);
        System.out.println("A manutenção foi registrada com sucesso!");
    }

    public void deleteManutencao() {

        System.out.println("Você selecionou a opção remover uma manutenção.\n");
        System.out.println("Informe o id da Manutenção: ");
        idManutencao = input.nextInt();

        if(idManutencao != 0){
            //repositorioManutencoes.remover(idManutencao);
            ManutencaoRepository.removeAccountById(idManutencao);
            System.out.println("Manutenção removida " + manutencao.getIdManutencao() +"com sucesso!");

        }else{
            System.out.println("Manutenção não encontrada em nosso banco de dados!");
        }
    }

    public void readManutencao() {

        System.out.println("Você selecionou a opção buscar por uma manutenção.\n");
        System.out.println("Informe o id da Manutenção: ");
        idManutencao = input.nextInt();
        if(idManutencao != 0){
            //System.out.println("Informações da Manutenção\n " + repositorioManutencoes.buscar(idManutencao));
            System.out.println("Informações da Manutenção\n " + ManutencaoRepository.getById(idManutencao));

        }else{
            System.out.println("Manutenção não encontrada em nosso banco de dados!");
        }
    }

    public void getAllManutencoes() {
        System.out.println("Você selecionou a opção listar todas manutenções.\n");
        //System.out.println(repositorioManutencoes.listarTodos());
        System.out.println("Lista de Manutenções: ");

        for (Manutencao manutencao : ManutencaoRepository.listAll()) {
            System.out.println(manutencao);
        }
    }
}