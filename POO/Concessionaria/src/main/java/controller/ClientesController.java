package controller;
import models.clientes.Cliente;
import repository_jpa.ClienteRepository;

import java.util.Scanner;

public class ClientesController {
    Scanner input = new Scanner(System.in);
    Cliente cliente = new Cliente();
    Cliente clienteAtualizado = new Cliente();

    int idcliente, numero;
    String cpf, nome, cep, logradouro, complemento, bairro, telefone, estado, cidade, email;

    public void addCliente() {

        System.out.println("Você selecionou a opção registrar um cliente.\n");
        System.out.print("Digite o nome do cliente: ");
        nome = input.nextLine();
        cliente.setNome(nome);

        System.out.print("Digite o CPF do cliente: ");
        cpf = input.nextLine();
        cliente.setCpf(cpf);

        System.out.print("Digite o CEP: ");
        cep = input.nextLine();
        cliente.setCep(cep);

        System.out.print("Digite o Logradouro: ");
        logradouro = input.nextLine();
        cliente.setLogradouro(logradouro);

        System.out.print("Digite o Número: ");
        numero = input.nextInt();
        cliente.setNumero(numero);

        System.out.print("Digite o Complemento Residencial: ");
        input.nextLine();
        complemento = input.nextLine();
        cliente.setComplemento(complemento);

        System.out.print("Digite o Bairro: ");
        bairro = input.nextLine();
        cliente.setBairro(bairro);

        System.out.print("Digite o Telefone: ");
        telefone = input.nextLine();
        cliente.setTelefone(telefone);

        System.out.print("Digite o Estado: ");
        estado = input.nextLine();
        cliente.setEstado(estado);

        System.out.print("Digite o Cidade: ");
        cidade = input.nextLine();
        cliente.setCidade(cidade);

        System.out.print("Digite o Email: ");
        email = input.nextLine();
        cliente.setEmail(email);

        System.out.println("\nCadastro concluído com sucesso! O cliente foi registrado.");
        //repositorioClientes.criar(cliente);
        ClienteRepository.saveAccount(cliente);
    }

    public void deleteCliente() {

        System.out.println("Você selecionou a opção remover um cliente.\n");
        System.out.print("Digite o ID do cliente: ");
        idcliente = input.nextInt();

        if (idcliente != 0){
            //repositorioClientes.remover(cpf);
            ClienteRepository.removeAccountById(idcliente);
            System.out.println("Cliente deletado com sucesso!");

        }else{
            System.out.println("Cliente não encontrado em nosso banco de dados!");
        }
    }

    public void readCliente() {

        System.out.println("Você selecionou a opção buscar por um cliente.\n");
        System.out.println("Digite o ID do cliente: ");
        idcliente = input.nextInt();

        if (idcliente != 0) {
            //System.out.println("Informações do Cliente:\n " + repositorioClientes.buscar(cpf));
            System.out.println("Informações do Cliente:\n " + ClienteRepository.getById(idcliente));

        } else {
            System.out.println("Cliente não encontrado em nosso banco de dados!");
        }
    }

    public void getAllClientes() {
        System.out.println("Você selecionou a opção listar todos os clientes.\n");
        //System.out.println(repositorioClientes.listarTodos());
        System.out.println("Lista de Clientes: ");

        for(Cliente cliente : ClienteRepository.listAll()){
            System.out.println(cliente);
        }
    }

    public void updateCliente(){
        System.out.println("Você selecionou a opção alterar um cliente.\n");
        System.out.println("Informe o ID do cliente: ");
        idcliente = input.nextInt();
        clienteAtualizado.setIdcliente(idcliente);

        System.out.print("Digite o nome do cliente: ");
        input.nextLine();
        nome = input.nextLine();
        clienteAtualizado.setNome(nome);

        System.out.print("Digite o CPF do cliente: ");
        cpf = input.nextLine();
        clienteAtualizado.setCpf(cpf);

        System.out.print("Digite o CEP: ");
        cep = input.nextLine();
        clienteAtualizado.setCep(cep);

        System.out.print("Digite o Logradouro: ");
        logradouro = input.nextLine();
        clienteAtualizado.setLogradouro(logradouro);

        System.out.print("Digite o Número: ");
        numero = input.nextInt();
        clienteAtualizado.setNumero(numero);

        System.out.print("Digite o Complemento Residencial: ");
        input.nextLine();
        complemento = input.nextLine();
        clienteAtualizado.setComplemento(complemento);

        System.out.print("Digite o Bairro: ");
        bairro = input.nextLine();
        clienteAtualizado.setBairro(bairro);

        System.out.print("Digite o Telefone: ");
        telefone = input.nextLine();
        clienteAtualizado.setTelefone(telefone);

        System.out.print("Digite o Estado: ");
        estado = input.nextLine();
        clienteAtualizado.setEstado(estado);

        System.out.print("Digite o Cidade: ");
        cidade = input.nextLine();
        clienteAtualizado.setCidade(cidade);

        System.out.print("Digite o Email: ");
        email = input.nextLine();
        clienteAtualizado.setEmail(email);

        ClienteRepository.updateAccount(clienteAtualizado);
        System.out.println("\nCadastro concluído com sucesso! O cliente foi registrado.");
    }
}