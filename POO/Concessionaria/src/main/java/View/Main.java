package View;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import Models.Cliente;
import Models.Cliente.*;
import Models.Ncv;
import Models.Ncv.*;
import Models.Nvv;
import Models.Nvv.*;
import Models.Veiculo;
import Models.Veiculo.*;
import Models.Seguro;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ClienteService clienteService = new ClienteService();
        VeiculoService veiculoService = new VeiculoService();
        Seguro.SeguroService seguroService = new Seguro.SeguroService();
        Nvv.Manutencao.ManutencaoService manutencaoService = new Nvv.Manutencao.ManutencaoService();
        NcvService ncvService = new NcvService();
        NvvService nvvService = new NvvService();
        MenusConcessionaria menus = new MenusConcessionaria();

        int opc, opc2, opc3, opc4;

        do {
            menus.principal();
            opc = input.nextInt();

            switch (opc) {
                case 1:
                    do {
                        menus.clientes();
                        opc2 = input.nextInt();

                        switch (opc2) {
                            case 1:
                                // Adicionar Cliente
                                input.nextLine();
                                System.out.print("Nome: ");
                                String nome = input.nextLine();

                                System.out.print("CEP: ");
                                String cep = input.nextLine();

                                System.out.print("Logradouro: ");
                                String logradouro = input.nextLine();

                                System.out.print("Número: ");
                                int numero = input.nextInt();
                                input.nextLine();

                                System.out.print("Complemento: ");
                                String complemento = input.nextLine();

                                System.out.print("Bairro: ");
                                String bairro = input.nextLine();

                                System.out.print("Telefone: ");
                                String telefone = input.nextLine();

                                System.out.print("Estado: ");
                                String estado = input.nextLine();

                                System.out.print("Cidade: ");
                                String cidade = input.nextLine();

                                System.out.print("Email: ");
                                String email = input.nextLine();

                                Cliente novoCliente = clienteService.addCliente(nome, cep, logradouro, numero, complemento, bairro, telefone, estado, cidade, email);
                                System.out.println("Cliente adicionado com ID: " + novoCliente.getIdCliente());
                                break;

                            case 2:
                                // Listar Clientes
                                System.out.println("\n--- Lista de Clientes ---");
                                List<Cliente> clientes = clienteService.getAllClientes(); // **Verde: Obtém a lista de clientes**
                                if (clientes.isEmpty()) { // **Verde: Verifica se a lista está vazia**
                                    System.out.println("Nenhum cliente cadastrado."); // **Verde: Exibe mensagem caso não haja clientes**
                                } else {
                                    for (Cliente cliente : clientes) {
                                        System.out.println("ID: " + cliente.getIdCliente() + ", Nome: " + cliente.getNome());
                                    }
                                }
                                break;

                            case 3:
                                // Buscar Cliente
                                System.out.print("Digite o ID do cliente: ");
                                int idBuscar = input.nextInt();

                                Cliente clienteEncontrado = clienteService.getCliente(idBuscar);

                                if (clienteEncontrado != null) {
                                    System.out.println("Cliente encontrado: " + clienteEncontrado.getNome());

                                } else {
                                    System.out.println("Cliente não encontrado.");

                                }
                                break;

                            case 4:
                                // Atualizar Cliente
                                System.out.print("Digite o ID do cliente a ser atualizado: ");
                                int idAtualizar = input.nextInt();
                                input.nextLine();

                                Cliente clienteParaAtualizar = clienteService.getCliente(idAtualizar);

                                if (clienteParaAtualizar != null) {
                                    System.out.print("Novo Nome: ");
                                    String novoNome = input.nextLine();

                                    System.out.print("Novo CEP: ");
                                    String novoCep = input.nextLine();

                                    System.out.print("Novo Logradouro: ");
                                    String novoLogradouro = input.nextLine();

                                    System.out.print("Novo Número: ");
                                    int novoNumero = input.nextInt();
                                    input.nextLine();

                                    System.out.print("Novo Complemento: ");
                                    String novoComplemento = input.nextLine();

                                    System.out.print("Novo Bairro: ");
                                    String novoBairro = input.nextLine();

                                    System.out.print("Novo Telefone: ");
                                    String novoTelefone = input.nextLine();

                                    System.out.print("Novo Estado: ");
                                    String novoEstado = input.nextLine();

                                    System.out.print("Nova Cidade: ");
                                    String novaCidade = input.nextLine();

                                    System.out.print("Novo Email: ");
                                    String novoEmail = input.nextLine();

                                    if (clienteService.updateCliente(idAtualizar, novoNome, novoCep, novoLogradouro, novoNumero, novoComplemento, novoBairro, novoTelefone, novoEstado, novaCidade, novoEmail)) {
                                        System.out.println("Cliente atualizado com sucesso.");

                                    } else {
                                        System.out.println("Erro ao atualizar o cliente.");

                                    }
                                } else {
                                    System.out.println("Cliente não encontrado.");

                                }
                                break;

                            case 5:
                                // Deletar Cliente
                                System.out.print("Digite o ID do cliente a ser deletado: ");
                                int idDeletar = input.nextInt();

                                if (clienteService.deleteCliente(idDeletar)) {
                                    System.out.println("Cliente deletado com sucesso.");

                                } else {
                                    System.out.println("Cliente não encontrado.");

                                }
                                break;

                            case 0:
                                System.out.println("Retornando ao menu principal...");
                                break;

                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    } while (opc2 != 0);
                    break;

                case 2:
                    do {
                        menus.veiculos();
                        opc2 = input.nextInt();

                        switch (opc2) {
                            case 1:
                                // Adicionar Veículo
                                System.out.print("Chassi: ");
                                int chassi = input.nextInt();
                                input.nextLine();

                                System.out.print("Quantidade de Km: ");
                                double qtdKm = input.nextDouble();
                                input.nextLine();

                                System.out.print("Cor: ");
                                String cor = input.nextLine();

                                System.out.print("Localização no pátio: ");
                                String localizacaoPatio = input.nextLine();

                                System.out.print("Modelo: ");
                                String modelo = input.nextLine();

                                System.out.print("Marca: ");
                                String marca = input.nextLine();

                                System.out.print("Status do Veículo: ");
                                String statusVeiculo = input.nextLine();

                                System.out.print("Ano: ");
                                String ano = input.nextLine();

                                Veiculo novoVeiculo = veiculoService.addVeiculo(chassi, qtdKm, cor, localizacaoPatio, modelo, marca, statusVeiculo, ano);
                                System.out.println("O novo veículo foi adicionado através do numero do chassi: " + novoVeiculo.getChassi());

                                break;

                            case 2:
                                // Listar Veículos
                                System.out.println("\n--- Lista de Veículos ---");

                                for (Veiculo veiculo : veiculoService.getAllVeiculos()) {
                                    System.out.println("Chassi: " + veiculo.getChassi() + ", Modelo: " + veiculo.getModelo() + ", Marca: " + veiculo.getMarca());

                                }
                                break;

                            case 3:
                                // Buscar Veículo
                                System.out.print("Digite o chassi do veículo: ");

                                int chassiBuscar = input.nextInt();
                                input.nextLine();
                                Veiculo veiculoEncontrado = veiculoService.getVeiculo(chassiBuscar);

                                if (veiculoEncontrado != null) {
                                    System.out.println("Veículo encontrado: Modelo " + veiculoEncontrado.getModelo() + ", Marca " + veiculoEncontrado.getMarca());

                                } else {
                                    System.out.println("Veículo não encontrado.");

                                }
                                break;

                            case 4:
                                // Atualizar Veículo
                                System.out.print("Digite o chassi do veículo a ser atualizado: ");

                                int chassiAtualizar = input.nextInt();
                                input.nextLine();

                                Veiculo veiculoParaAtualizar = veiculoService.getVeiculo(chassiAtualizar);

                                if (veiculoParaAtualizar != null) {
                                    System.out.print("Nova Quantidade de Km: ");
                                    double novaQtdKm = input.nextDouble();
                                    input.nextLine();

                                    System.out.print("Nova Cor: ");
                                    String novaCor = input.nextLine();

                                    System.out.print("Nova Localização no pátio: ");
                                    String novaLocalizacaoPatio = input.nextLine();

                                    System.out.print("Novo Modelo: ");
                                    String novoModelo = input.nextLine();

                                    System.out.print("Nova Marca: ");
                                    String novaMarca = input.nextLine();

                                    System.out.print("Novo Status do Veículo: ");
                                    String novoStatusVeiculo = input.nextLine();

                                    System.out.print("Novo Ano: ");
                                    String novoAno = input.nextLine();

                                    if (veiculoService.updateVeiculo(chassiAtualizar, novaQtdKm, novaCor, novaLocalizacaoPatio, novoModelo, novaMarca, novoStatusVeiculo, novoAno)) {
                                        System.out.println("Veículo atualizado com sucesso.");

                                    } else {
                                        System.out.println("Erro ao atualizar informações do veículo.");

                                    }
                                } else {
                                    System.out.println("Veículo não encontrado.");

                                }
                                break;

                            case 5:
                                // Deletar Veículo
                                System.out.print("Digite o chassi do veículo a ser deletado: ");
                                int chassiDeletar = input.nextInt();
                                input.nextLine();

                                if (veiculoService.deleteVeiculo(chassiDeletar)) {
                                    System.out.println("Veículo deletado com sucesso.");

                                } else {
                                    System.out.println("Veículo não encontrado.");

                                }
                                break;

                            case 0:
                                System.out.println("Saindo...");
                                break;
                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    } while (opc2 != 0);
                    break;

                case 3:
                    do {
                        menus.servicos();
                        opc2 = input.nextInt();

                        switch (opc2) {
                            case 1:
                                System.out.println("Qual tipo de serviço você deseja agendar?");
                                System.out.println("Digite: \n1. Seguro \n2. Manutenção");
                                opc3 = input.nextInt();

                                if (opc3 == 1) {
                                    do {
                                        menus.seguros();
                                        opc4 = input.nextInt();

                                        switch (opc4) {
                                            case 1:
                                                // Adicionar Seguro
                                                System.out.print("\nNúmero da Apólice: ");
                                                int numeroApolice = input.nextInt();

                                                System.out.print("Chassi: ");
                                                int chassi = input.nextInt();

                                                Date segDataInicial = null, segDataFinal = null; // iniciando variaveis

                                                System.out.print("Informe a Data Inicial da Apólice (dd/MM/yyyy): ");
                                                String dataInicial = input.nextLine();
                                                input.nextLine();

                                                System.out.print("Informe a Data Final (dd/MM/yyyy): ");
                                                String dataFinal = input.nextLine();
                                                SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

                                                try {
                                                    segDataInicial = formatoData.parse(dataInicial);
                                                    System.out.println("Data registrada com sucesso: " + segDataInicial);

                                                } catch (ParseException e) {
                                                    System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");

                                                }

                                                System.out.print("Preço do Seguro: ");
                                                BigDecimal segPreco = input.nextBigDecimal();

                                                System.out.print("Cobertura: ");
                                                String cobertura = input.nextLine();
                                                input.nextLine();

                                                System.out.print("Franquia: ");
                                                BigDecimal franquia = input.nextBigDecimal();
                                                input.nextLine();

                                                Seguro novoSeguro = seguroService.addSeguro(numeroApolice, chassi, segDataInicial, segDataFinal, segPreco, cobertura, franquia);
                                                System.out.println("Seguro adicionado com número de apólice: " + novoSeguro.getNumeroApolice());

                                                break;

                                            case 2:
                                                // Listar Seguros
                                                System.out.println("\n--- Lista de Seguros ---");

                                                for (Seguro seguro : seguroService.getAllSeguros()) {
                                                    System.out.println("Número da Apólice: " + seguro.getNumeroApolice() + ", Chassi: " + seguro.getChassi() + ", Cobertura: " + seguro.getCobertura());

                                                }

                                                break;

                                            case 3:
                                                // Buscar Seguro
                                                System.out.print("Digite o número da apólice: ");

                                                int numeroBuscar = input.nextInt();

                                                Seguro seguroEncontrado = seguroService.getSeguro(numeroBuscar);

                                                if (seguroEncontrado != null) {
                                                    System.out.println("Seguro encontrado: Cobertura " + seguroEncontrado.getCobertura() + ", Preço " + seguroEncontrado.getSegPreco());

                                                } else {
                                                    System.out.println("Seguro não encontrado.");
                                                }
                                                break;

                                            case 4:
                                                // Deletar Seguro
                                                System.out.print("Digite o número da apólice do seguro a ser deletado: ");
                                                int numeroDeletar = input.nextInt();

                                                if (seguroService.deleteSeguro(numeroDeletar)) {
                                                    System.out.println("Seguro deletado com sucesso.");

                                                } else {
                                                    System.out.println("Seguro não encontrado.");

                                                }
                                                break;

                                            case 0:
                                                System.out.println("Saindo...");
                                                break;

                                            default:
                                                System.out.println("Opção inválida. Tente novamente.");
                                        }
                                    } while (opc2 != 0);

                                } else if (opc3 == 2) {
                                    do {
                                        menus.manutencao();
                                        opc4 = input.nextInt();
                                        input.nextLine();
                                        switch (opc4) {

                                            case 1:
                                                System.out.print("ID da Manutenção: ");
                                                int idManutencao = input.nextInt();
                                                input.nextLine();

                                                System.out.print("Chassi: ");
                                                int chassi = input.nextInt();
                                                input.nextLine();

                                                System.out.print("Custo da Manutenção: ");
                                                BigDecimal custoManutencao = input.nextBigDecimal();
                                                input.nextLine();

                                                Date manudataProximaManutencao = null;

                                                System.out.print("Data da Próxima Manutenção (dd/MM/yyyy): ");
                                                String dataProximaManutencao = input.nextLine();
                                                SimpleDateFormat formatoData = new SimpleDateFormat("dd/MM/yyyy");

                                                try {
                                                    manudataProximaManutencao = formatoData.parse(dataProximaManutencao);
                                                    System.out.println("Data registrada com sucesso: " + manudataProximaManutencao);

                                                } catch (Exception e) {
                                                    System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
                                                }

                                                System.out.print("Responsável: ");
                                                String responsavel = input.nextLine();

                                                System.out.print("Tipo de Manutenção: ");
                                                String tipoManutencao = input.nextLine();

                                                System.out.print("Status: "); // Em processo, concluida ou cancelada.
                                                String status = input.nextLine();

                                                Nvv.Manutencao novaManutencao = manutencaoService.addManutencao(idManutencao, chassi, custoManutencao,
                                                        dataProximaManutencao, responsavel, tipoManutencao, status);

                                                System.out.println("Manutenção adicionada com ID: " + novaManutencao.getIdManutencao());
                                                break;

                                            case 2:
                                                System.out.println("\n--- Lista de Manutenções ---");

                                                for (Nvv.Manutencao manutencao : manutencaoService.getAllManutencoes()) {
                                                    System.out.println("ID: " + manutencao.getIdManutencao() + ", Chassi: " + manutencao.getChassi() + ", Responsável: " + manutencao.getResponsavel());

                                                }
                                                break;

                                            case 3:
                                                System.out.print("Digite o ID da manutenção: ");
                                                int idBuscar = input.nextInt();
                                                input.nextLine();

                                                Nvv.Manutencao manutencaoEncontrada = manutencaoService.getManutencao(idBuscar);

                                                if (manutencaoEncontrada != null) {
                                                    System.out.println("Manutenção encontrada: Tipo " + manutencaoEncontrada.getTipoManutencao() + ", Status " + manutencaoEncontrada.getStatus());

                                                } else {
                                                    System.out.println("Manutenção não encontrada.");

                                                }
                                                break;

                                            case 4:
                                                System.out.print("Digite o ID da manutenção para atualizar: ");
                                                int idAtualizar = input.nextInt();
                                                input.nextLine();

                                                Nvv.Manutencao manutencaoParaAtualizar = manutencaoService.getManutencao(idAtualizar);

                                                if (manutencaoParaAtualizar != null) {
                                                    Date manuNovaDataProxima = null;

                                                    System.out.print("Novo Chassi: ");
                                                    int novoChassi = input.nextInt();
                                                    input.nextLine();

                                                    System.out.print("Novo Custo da Manutenção: ");
                                                    BigDecimal novoCusto = input.nextBigDecimal();
                                                    input.nextLine();

                                                    System.out.print("Nova Data da Próxima Manutenção (dd/MM/yyyy): ");
                                                    String novaDataProxima = input.nextLine();
                                                    SimpleDateFormat formatoData1 = new SimpleDateFormat("dd/MM/yyyy");

                                                    try {
                                                        manuNovaDataProxima = formatoData1.parse(novaDataProxima);
                                                        System.out.println("Data registrada com sucesso: " + manuNovaDataProxima);

                                                    } catch (ParseException i) {
                                                        System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
                                                        System.out.println("Tente novamente...");

                                                    }

                                                    System.out.print("Novo Responsável: ");
                                                    String novoResponsavel = input.nextLine();

                                                    System.out.print("Novo Tipo de Manutenção: ");
                                                    String novoTipo = input.nextLine();

                                                    System.out.print("Novo Status: ");
                                                    String novoStatus = input.nextLine();

                                                    if (manutencaoService.updateManutencao(idAtualizar, novoChassi, novoCusto, novaDataProxima, novoResponsavel, novoTipo, novoStatus)) {
                                                        System.out.println("Manutenção atualizada com sucesso.");

                                                    } else {
                                                        System.out.println("Erro ao atualizar a manutenção.");

                                                    }
                                                    break;

                                                } else {
                                                    System.out.println("Manutenção não encontrada.");
                                                }
                                                break;

                                            case 5:
                                                System.out.print("Digite o ID da manutenção para deletar: ");
                                                int idDeletar = input.nextInt();
                                                input.nextLine();

                                                if (manutencaoService.deleteManutencao(idDeletar)) {
                                                    System.out.println("\nManutenção deletada com sucesso.");

                                                } else {
                                                    System.out.println("\nManutenção não encontrada.");

                                                }
                                                break;

                                            case 0:
                                                System.out.println("Saindo...");
                                                break;

                                            default:
                                                System.out.println("Opção inválida. Tente novamente.");

                                        }
                                    } while (opc4 != 0);
                                    break;

                                } else {
                                    System.out.println("Opção invalida. Tente novamente. Mais tarde.");
                                }
                                break;
                        }
                    } while (opc2 != 0);
                    break;

                case 4:
                    do {
                        menus.compraVeiculo();
                        opc2 = input.nextInt();

                        switch (opc2) {
                            case 1:
                                Date compraDataNCV = null;

                                System.out.print("ID do NCV: ");
                                int idNCV = input.nextInt();

                                System.out.print("ID do Funcionário: ");
                                int idFuncionario = input.nextInt();
                                input.nextLine();

                                System.out.print("Data do NCV (dd/MM/yyyy): ");
                                String dataNCV = input.nextLine();
                                SimpleDateFormat formatoData1 = new SimpleDateFormat("dd/MM/yyyy");

                                try {
                                    compraDataNCV = formatoData1.parse(dataNCV);
                                    System.out.println("Data registrada com sucesso: " + compraDataNCV);

                                } catch (ParseException i) {
                                    System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
                                    System.out.println("Tente novamente...");
                                }

                                System.out.print("Valor do NCV: ");
                                BigDecimal valorNCV = input.nextBigDecimal();

                                Date NovaDataNCV = new Date();
                                Ncv novoNcv = ncvService.addNcv(idNCV, idFuncionario, NovaDataNCV, valorNCV);
                                System.out.println("NCV adicionado com ID: " + novoNcv.getIdNCV());
                                break;

                            case 2:
                                System.out.println("\n--- Lista de NCVs ---");

                                for (Ncv ncv : ncvService.getAllNcvs()) {
                                    System.out.println("ID: " + ncv.getIdNCV() + ", Funcionário: " + ncv.getIdFuncionario() + ", Valor: " + ncv.getValorNCV());
                                }
                                break;

                            case 3:
                                System.out.print("Digite o ID do NCV: ");
                                int idBuscar = input.nextInt();
                                Ncv ncvEncontrado = ncvService.getNcv(idBuscar);

                                if (ncvEncontrado != null) {
                                    System.out.println("NCV encontrado: ID " + ncvEncontrado.getIdNCV() + ", Data " + ", Valor " + ncvEncontrado.getValorNCV());

                                } else {
                                    System.out.println("NCV não encontrado.");

                                }
                                break;

                            case 4:
                                System.out.print("Digite o ID do NCV para deletar: ");
                                int idDeletar = input.nextInt();

                                if (ncvService.deleteNcv(idDeletar)) {
                                    System.out.println("NCV deletado com sucesso.");

                                } else {
                                    System.out.println("NCV não encontrado.");

                                }
                                break;

                            case 0:
                                System.out.println("Saindo...");
                                break;

                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    } while (opc2 != 0);
                    break;

                case 5:
                    do {
                        menus.vendaVeiculo();
                        opc2 = input.nextInt();

                        switch (opc2) {
                            case 1:
                                Date vendaDataNVV = null;

                                System.out.print("ID do NVV: ");
                                int idNVV = input.nextInt();

                                System.out.print("ID do Funcionário: ");
                                int idFuncionario = input.nextInt();
                                input.nextLine();

                                System.out.print("Data do NVV (dd/MM/yyyy): ");
                                String dataNVV = input.nextLine();
                                SimpleDateFormat formatoData1 = new SimpleDateFormat("dd/MM/yyyy");

                                try {
                                    vendaDataNVV = formatoData1.parse(dataNVV);
                                    System.out.println("Data registrada com sucesso: " + vendaDataNVV);

                                } catch (ParseException e) {
                                    System.out.println("Formato de data inválido. Por favor, use o formato dd/MM/yyyy.");
                                    System.out.println("Tente novamente...");

                                }

                                System.out.print("Valor do NVV: ");
                                double valorNVV = input.nextDouble();

                                Nvv novoNvv = nvvService.addNvv(idNVV, idFuncionario, dataNVV, valorNVV);
                                System.out.println("NVV adicionado com ID: " + novoNvv.getIdNVV());
                                break;

                            case 2:
                                System.out.println("\n--- Lista de NVVs ---");

                                for (Nvv nvv : nvvService.getAllNvvs()) {
                                    System.out.println("ID: " + nvv.getIdNVV() + ", Funcionário: " + nvv.getIdFuncionario() +
                                            ", Data: " + ", Valor: " + nvv.getValorNVV());

                                }
                                break;

                            case 3:
                                System.out.print("Digite o ID do NVV: ");
                                int idBuscar = input.nextInt();

                                Nvv nvvEncontrado = nvvService.getNvv(idBuscar);

                                if (nvvEncontrado != null) {
                                    System.out.println("NVV encontrado: ID " + nvvEncontrado.getIdNVV() + ", Funcionário " + nvvEncontrado.getIdFuncionario() +
                                            ", Data " + ", Valor " + nvvEncontrado.getValorNVV());

                                } else {
                                    System.out.println("NVV não encontrado.");

                                }
                                break;

                            case 4:
                                System.out.print("Digite o ID do NVV para deletar: ");
                                int idDeletar = input.nextInt();

                                if (nvvService.deleteNvv(idDeletar)) {
                                    System.out.println("NVV deletado com sucesso.");

                                } else {
                                    System.out.println("NVV não encontrado.");

                                }
                                break;

                            case 0:
                                System.out.println("Saindo...");
                                break;

                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    } while (opc2 != 0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }
        } while (opc != 0);
        input.close();
    }
}