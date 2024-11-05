package uI;
import java.util.*;

import cliente.Cliente;
import cliente.Cliente.*;

public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        ClienteService clienteService = new ClienteService();
        int opc, opc2;

        do {
            System.out.println("1. Gerenciar Clientes");
            System.out.println("2. Gerenciar Veiculos");
            System.out.println("3. Gerenciar Serviços");
            System.out.println("4. Gerenciar Nota de Compras");
            System.out.println("5. Gerenciar Nota de Vendas");
            System.out.println("0. Sair");

            opc = input.nextInt();

            switch (opc) {

                case 1:
                    do {
                        System.out.println("\n--- Menu de Clientes ---");
                        System.out.println("1. Adicionar Cliente");
                        System.out.println("2. Listar Clientes");
                        System.out.println("3. Buscar Cliente");
                        System.out.println("4. Atualizar Cliente");
                        System.out.println("5. Deletar Cliente");
                        System.out.println("0. Sair");
                        System.out.print("Escolha uma opção: ");

                        opc2 = input.nextInt();

                        switch (opc2) {
                            case 1:
                                // Adicionar Cliente
                                System.out.print("Nome: ");
                                String nome = input.nextLine();

                                System.out.print("CEP: ");
                                String cep = input.nextLine();

                                System.out.print("Logradouro: ");
                                String logradouro = input.nextLine();

                                System.out.print("Número: ");
                                int numero = input.nextInt();

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

                                for (Cliente cliente : clienteService.getAllClientes()) {
                                    System.out.println("ID: " + cliente.getIdCliente() + ", Nome: " + cliente.getNome());

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
                                System.out.println("Saindo...");
                                break;

                            default:
                                System.out.println("Opção inválida. Tente novamente.");
                        }
                    } while (opc2 != 0);

                case 2:
                    System.out.println("\n--- Lista de Veiculos ---");
                    System.out.println("1. Adicionar Veiculos");
                    System.out.println("2. Listar Veiculos");
                    System.out.println("3. Buscar Veiculos");
                    System.out.println("4. Atualizar Veiculos");
                    System.out.println("5. Deletar Veiculos");
                    System.out.println("0. Sair");
                    System.out.print("Escolha uma opção: ");

                    opc2 = input.nextInt();

                    do{

                    }while (opc2 != 0);

                case 3:
                    System.out.println("\n--- Lista de Serviços ---");
                    System.out.println("1. Agendar Serviços");
                    System.out.println("2. Cancelar Serviço");
                    System.out.println("3. Listar Serviços");
                    System.out.println("0. Sair");
                    System.out.print("Escolha uma opção: ");

                    opc2 = input.nextInt();

                    do{

                    }while (opc2 != 0);

                case 4:
                    System.out.println("\n--- Lista de Compras ---");
                    System.out.println("1. Realizar Compra de Veiculos");
                    System.out.println("2. Listar Compras Realizadas de Veiculos");
                    System.out.println("0. Sair");
                    System.out.print("Escolha uma opção: ");

                    opc2 = input.nextInt();

                    do{

                    }while (opc2 != 0);

                case 5:
                    System.out.println("\n--- Lista de Venda ---");
                    System.out.println("1. Realizar Venda de Veiculos");
                    System.out.println("2. Listar Vendas Realizadas de Veiculos");
                    System.out.println("0. Sair");
                    System.out.print("Escolha uma opção: ");

                    opc2 = input.nextInt();

                    do{

                    }while (opc2 != 0);

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");

            }

        } while (opc != 0);
        input.close();
    }
}
