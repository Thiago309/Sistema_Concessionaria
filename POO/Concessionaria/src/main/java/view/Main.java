package view;

import java.util.*;
import controller.*;
import interfaces.*;
import repository.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        MenusConcessionaria menus = new MenusConcessionaria();

        ClientesController clientesController = new ClientesController();
        RepositorioClientes repositorioClientes = new RepositorioClientesLista();

        VeiculosController veiculosController = new VeiculosController();
        RepositorioVeiculos repositorioVeiculos = new RepositorioVeiculosLista();

        ServicosController servicosController = new ServicosController();
        RepositorioServicos repositorioServicos = new RepositorioServicosLista();

        SegurosController segurosController = new SegurosController();
        RepositorioSeguros repositorioSeguros = new RepositorioSegurosLista();

        ManutencaoController manutencaoController = new ManutencaoController();
        RepositorioManutencoes repositorioManutencoes = new RepositorioManutencoesLista();

        NcvsController ncvsController = new NcvsController();
        RepositorioNcvs repositorioNcvs = new RepositorioNcvLista();

        NvvsController nvvsController = new NvvsController();
        RepositorioNvvs repositorioNvvs = new RepositorioNvvLista();

        FuncionariosController funcionariosController = new FuncionariosController();
        RepositorioFuncionarios repositorioFuncionarios = new RepositorioFuncionariosLista();

        int opc, opc2, opc3, opcSeguro, opcManutencao;

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
                                clientesController.addCliente(repositorioClientes); break;

                            case 2:
                                // Listar Clientes
                                clientesController.getAllClientes(repositorioClientes); break;

                            case 3:
                                // Buscar Cliente
                                clientesController.readCliente(repositorioClientes); break;

                            case 4:
                                // Deletar Cliente
                                clientesController.deleteCliente(repositorioClientes); break;

                            case 0:
                                System.out.println("Retornando ao menu principal..."); break;

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
                                veiculosController.addVeiculo(repositorioVeiculos); break;

                            case 2:
                                // Listar Veículos
                                veiculosController.getAllClientes(repositorioVeiculos); break;

                            case 3:
                                // Buscar Veículo
                                veiculosController.readVeiculo(repositorioVeiculos); break;

                            case 4:
                                // Deletar Veículo
                                veiculosController.deleteVeiculo(repositorioVeiculos); break;

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

                                    do {
                                        menus.seguros();
                                        opcSeguro = input.nextInt();

                                        switch (opcSeguro) {
                                            case 1:
                                                // Adicionar Seguros
                                                servicosController.addServico(repositorioServicos);
                                                segurosController.addSeguro(repositorioSeguros);
                                                break;

                                            case 2:
                                                // Listar Seguros
                                                servicosController.getAllServicos(repositorioServicos);
                                                segurosController.getAllSeguros(repositorioSeguros);
                                                break;

                                            case 3:
                                                // Buscar Seguro
                                                servicosController.readServico(repositorioServicos);
                                                segurosController.readSeguro(repositorioSeguros);
                                                break;

                                            case 4:
                                                // Deletar Seguro
                                                servicosController.deleteServico(repositorioServicos);
                                                segurosController.deleteSeguro(repositorioSeguros);
                                                break;

                                            case 0:
                                                System.out.println("Retornando ao menu principal..."); break;

                                            default:
                                                System.out.println("Opção inválida. Tente novamente.");
                                        }
                                    } while (opcSeguro != 0);

                                } else if (opc3 == 2) {
                                    do {
                                        menus.manutencao();
                                        opcManutencao = input.nextInt();

                                        switch (opcManutencao) {
                                            case 1:
                                                // Adicionar Manutencao
                                                servicosController.addServico(repositorioServicos);
                                                manutencaoController.addManutencao(repositorioManutencoes); break;

                                            case 2:
                                                // Listar Manuteções
                                                servicosController.addServico(repositorioServicos);
                                                manutencaoController.getAllManutencoes(repositorioManutencoes); break;

                                            case 3:
                                                // Buscar Veiculos
                                                servicosController.addServico(repositorioServicos);
                                                manutencaoController.readManutencao(repositorioManutencoes); break;

                                            case 4:
                                                // Deletar Manutencao
                                                servicosController.addServico(repositorioServicos);
                                                manutencaoController.deleteManutencao(repositorioManutencoes); break;

                                            case 0:
                                                System.out.println("Retornando ao menu principal..."); break;

                                            default:
                                                System.out.println("Opção inválida. Tente novamente.");
                                        }
                                    } while (opcManutencao != 0);
                                    break;

                                } else {
                                    System.out.println("Opção inválida. Tente novamente.");
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

                case 4:
                    do {
                        menus.compraVeiculo();
                        opc2 = input.nextInt();

                        switch (opc2) {
                            case 1:
                                // Adicionar Notas de Compras
                                ncvsController.addNcv(repositorioNcvs); break;

                            case 2:
                                // Listar Notas de Compras
                                ncvsController.getAllNcvs(repositorioNcvs); break;

                            case 3:
                                // Buscar Nota
                                ncvsController.readNcv(repositorioNcvs); break;

                            case 4:
                                // Deletar Nota
                                ncvsController.deleteNcv(repositorioNcvs); break;

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
                                nvvsController.addNvv(repositorioNvvs); break;

                            case 2:
                                // Listar Notas de Compras
                                nvvsController.getAllNvvs(repositorioNvvs); break;

                            case 3:
                                // Buscar Nota
                                nvvsController.readNvv(repositorioNvvs); break;

                            case 4:
                                // Deletar Nota
                                nvvsController.deleteNvv(repositorioNvvs); break;

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
                                funcionariosController.addFuncionario(repositorioFuncionarios); break;

                            case 2:
                                // Listar Funcionarios
                                funcionariosController.getAllFuncionarios(repositorioFuncionarios); break;

                            case 3:
                                // Buscar Funcionario
                                funcionariosController.readFuncionario(repositorioFuncionarios); break;

                            case 4:
                                // Deletar Funcionario
                                funcionariosController.deleteFuncionario(repositorioFuncionarios); break;

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