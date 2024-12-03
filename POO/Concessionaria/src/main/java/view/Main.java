package view;
import java.util.*;
import controller.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MenusConcessionaria menus = new MenusConcessionaria();
        ClientesController clientesController = new ClientesController();
        VeiculosController veiculosController = new VeiculosController();
        ServicosController servicosController = new ServicosController();
        SegurosController segurosController = new SegurosController();
        ManutencaoController manutencaoController = new ManutencaoController();
        NcvsController ncvsController = new NcvsController();
        NvvsController nvvsController = new NvvsController();
        FuncionariosController funcionariosController = new FuncionariosController();

        int opc, opc2, opc3;

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
                                clientesController.addCliente(); break;

                            case 2:
                                // Listar Clientes
                                clientesController.getAllClientes(); break;

                            case 3:
                                // Buscar Cliente
                                clientesController.readCliente(); break;

                            case 4:
                                // Editar Cliente
                                clientesController.updateCliente(); break;

                            case 5:
                                // Deletar Cliente
                                clientesController.deleteCliente(); break;

                            case 0:
                                System.out.println("Retornando ao menu principal..."); break;

                            default:
                                System.out.println("Opção inválida. Tente novamente."); break;
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
                                veiculosController.addVeiculo(); break;

                            case 2:
                                // Listar Veículos
                                veiculosController.getAllClientes(); break;

                            case 3:
                                // Buscar Veículo
                                veiculosController.readVeiculo(); break;

                            case 4:
                                // Deletar Veículo
                                veiculosController.deleteVeiculo(); break;

                            case 0:
                                System.out.println("Retornando ao menu principal..."); break;

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
                                System.out.println("Qual tipo de serviço você deseja utilizar?");
                                System.out.println("Informe: \n1. Seguro \n2. Manutenção");
                                opc3 = input.nextInt();
                                
                                if (opc3 == 1) {
                                    int opcSeguro;

                                    do {
                                        menus.seguros();
                                        opcSeguro = input.nextInt();

                                        switch (opcSeguro) {
                                            case 1:
                                                // Adicionar Seguros
                                                segurosController.addSeguro();
                                                break;

                                            case 2:
                                                // Listar Seguros
                                                segurosController.getAllSeguros();
                                                break;

                                            case 3:
                                                // Buscar Seguro
                                                segurosController.readSeguro();
                                                break;

                                            case 4:
                                                // Deletar Seguro
                                                segurosController.deleteSeguro();
                                                break;

                                            case 0:
                                                System.out.println("Retornando ao menu principal...");break;

                                            default:
                                                System.out.println("Opção inválida. Tente novamente.");
                                        }
                                    } while (opcSeguro != 0);

                                } else if (opc3 == 2) {
                                    int opcManutencao;

                                    do {
                                        menus.manutencao();
                                        opcManutencao = input.nextInt();

                                        switch (opcManutencao) {
                                            case 1:
                                                // Adicionar Manutencao
                                                manutencaoController.addManutencao();break;

                                            case 2:
                                                // Listar Manuteções
                                                manutencaoController.getAllManutencoes();break;

                                            case 3:
                                                // Buscar Veiculos
                                                manutencaoController.readManutencao();break;

                                            case 4:
                                                // Deletar Manutencao
                                                manutencaoController.deleteManutencao();break;

                                            case 0:
                                                System.out.println("Retornando ao menu principal...");

                                            default:
                                                System.out.println("Opção inválida. Tente novamente.");
                                        }
                                    } while (opcManutencao != 0);
                                    break;

                                } else {
                                    System.out.println("Opção inválida. Tente novamente.");
                                }
                                break;
                            case 2:
                                servicosController.getAllServicos(); break;

                            case 3:
                                servicosController.readServico();break;

                            case 4:
                                servicosController.deleteServico();break;

                            case 0:
                                System.out.println("Retornando ao menu principal...");
                                break;

                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    } while (opc2 != 0);
                    break;

                case 4:
                    do {
                        menus.compraVeiculo();
                        opc2 = input.nextInt();

                        switch (opc2) {
                            case 1:
                                // Adicionar Notas de Compras
                                ncvsController.addNcv(); break;

                            case 2:
                                // Listar Notas de Compras
                                ncvsController.getAllNcvs(); break;

                            case 3:
                                // Buscar Nota
                                ncvsController.readNcv(); break;

                            case 4:
                                // Deletar Nota
                                ncvsController.deleteNcv(); break;

                            case 0:
                                System.out.println("Retornando ao menu principal..."); break;

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
                                // Adicionar Notas de Vendas
                                nvvsController.addNvv(); break;

                            case 2:
                                // Listar Notas de Compras
                                nvvsController.getAllNvvs(); break;

                            case 3:
                                // Buscar Nota
                                nvvsController.readNvv(); break;

                            case 4:
                                // Deletar Nota
                                nvvsController.deleteNvv(); break;

                            case 0:
                                System.out.println("Retornando ao menu principal..."); break;

                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    } while (opc2 != 0);
                case 6:
                    do{
                        menus.funcionarios();
                        opc2 = input.nextInt();

                        switch (opc2){
                            case 1:
                                // Adicionar Funcionario
                                funcionariosController.addFuncionario(); break;

                            case 2:
                                // Listar Funcionarios
                                funcionariosController.getAllFuncionarios(); break;

                            case 3:
                                // Buscar Funcionario
                                funcionariosController.readFuncionario(); break;

                            case 4:
                                // Deletar Funcionario
                                funcionariosController.deleteFuncionario(); break;

                            case 0:
                                System.out.println("Retornando ao menu principal..."); break;

                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    }while (opc2 != 0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opc != 0);
        input.close();
    }
}