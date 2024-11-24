package controller;
import interfaces.RepositorioFuncionarios;
import interfaces.RepositorioManutencoes;
import jakarta.persistence.Column;
import models.funcionarios.Funcionario;
import java.util.Scanner;

public class FuncionariosController {
    Scanner input = new Scanner(System.in);
    Funcionario funcionario;

    int idFuncionario;
    String nome;

    public void addFuncionario(RepositorioFuncionarios repositorioFuncionarios) {
        funcionario = new Funcionario();

        System.out.println("Você selecionou a opção registrar um funcionario.\n");
        System.out.println("Digite a matricula do funcionario: ");
        idFuncionario = input.nextInt();
        funcionario.setIdFuncionario(idFuncionario);

        System.out.println("Digite o nome do funcionario: ");
        nome = input.nextLine();
        funcionario.setNome(nome);

        repositorioFuncionarios.criar(funcionario);
    }

    public void deleteFuncionario(RepositorioFuncionarios repositorioFuncionarios) {
        System.out.println("Você selecionou a opção remover um funcionario.\n");
        System.out.println("Digite a matricula do funcionario: ");
        idFuncionario = input.nextInt();

        if(idFuncionario != 0){
            repositorioFuncionarios.remover(idFuncionario);
            System.out.println("Funcionario removido com sucesso!");

        }else{
            System.out.println("Funcionario não encontrado em nosso banco de dados!");

        }
    }

    public void readFuncionario(RepositorioFuncionarios repositorioFuncionarios) {
        System.out.println("Você selecionou a opção buscar por um funcionario.\n");
        System.out.println("Digite a matricula do funcionario: ");
        idFuncionario = input.nextInt();
        if(idFuncionario != 0){
            System.out.println("Informações do Funcionario\n " + repositorioFuncionarios.buscar(idFuncionario));
        }else{
            System.out.println("Funcionario não encontrado em nosso banco de dados!");
        }
    }

    public void getAllFuncionarios(RepositorioFuncionarios repositorioFuncionarios) {
        System.out.println("Você selecionou a opção listar todos os funcionarios.\n");
        System.out.println(repositorioFuncionarios.listarTodos());
    }
}