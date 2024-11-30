package controller;
import models.funcionarios.Funcionario;
import repository_jpa.FuncionarioRepository;
import java.util.Scanner;

public class FuncionariosController {
    Scanner input = new Scanner(System.in);
    Funcionario funcionario = new Funcionario();

    int idFuncionario;
    String nome;

    public void addFuncionario() {

        System.out.println("Você selecionou a opção registrar um funcionario.\n");
        System.out.println("Digite a matricula do funcionario: ");
        idFuncionario = input.nextInt();
        funcionario.setIdFuncionario(idFuncionario);

        System.out.println("Digite o nome do funcionario: ");
        nome = input.nextLine();
        funcionario.setNome(nome);

        //repositorioFuncionarios.criar(funcionario);
        FuncionarioRepository.saveAccount(funcionario);
        System.out.println("\nCadastro concluído com sucesso! O funcionario " + funcionario.getNome()
                + " foi registrado.");
    }

    public void deleteFuncionario() {
        System.out.println("Você selecionou a opção remover um funcionario.\n");
        System.out.println("Digite a matricula do funcionario: ");
        idFuncionario = input.nextInt();

        if (idFuncionario != 0) {
            //repositorioFuncionarios.remover(idFuncionario);
            FuncionarioRepository.removeAccountById(idFuncionario);
            System.out.println("O funcionario " + funcionario.getNome() + " foi removido com sucesso!");

        } else {
            System.out.println("Funcionario não encontrado em nosso banco de dados!");
        }
    }

    public void readFuncionario() {
        System.out.println("Você selecionou a opção buscar por um funcionario.\n");
        System.out.println("Digite a matricula do funcionario: ");
        idFuncionario = input.nextInt();

        if (idFuncionario != 0) {
            //System.out.println("Informações do Funcionario\n " + repositorioFuncionarios.buscar(idFuncionario));
            System.out.println("Informações do Funcionario\n " + FuncionarioRepository.getById(idFuncionario));
        } else {
            System.out.println("Funcionario não encontrado em nosso banco de dados!");
        }
    }

    public void getAllFuncionarios() {
        System.out.println("Você selecionou a opção listar todos os funcionarios.\n");
        //System.out.println(repositorioFuncionarios.listarTodos());
        System.out.println("Lista de Funcionarios: ");

        for (Funcionario funcionario : FuncionarioRepository.listAll()) {
            System.out.println(funcionario);
        }
    }
}