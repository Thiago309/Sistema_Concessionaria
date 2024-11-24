package view;

public class MenusConcessionaria {
    public void principal() {
        System.out.println("1. Gerenciar Clientes");
        System.out.println("2. Gerenciar Veiculos");
        System.out.println("3. Gerenciar Serviços");
        System.out.println("4. Gerenciar Nota de Compras");
        System.out.println("5. Gerenciar Nota de Vendas");
        System.out.println("6. Gerenciar Funcionarios");
        System.out.println("0. Sair");
        System.out.print("\nSelecione: ");
    }

    public void clientes() {
        System.out.println("\n--- Menu de Clientes ---");
        System.out.println("1. Adicionar Cliente");
        System.out.println("2. Listar Clientes");
        System.out.println("3. Buscar Cliente");
        System.out.println("4. Deletar Cliente");
        System.out.println("0. Sair");
        System.out.print("\nEscolha uma opção: ");
    }

    public void veiculos() {
        System.out.println("\n--- Lista de Veiculos ---");
        System.out.println("1. Adicionar Veiculos");
        System.out.println("2. Listar Veiculos");
        System.out.println("3. Buscar Veiculos");
        System.out.println("4. Deletar Veiculos");
        System.out.println("0. Sair");
        System.out.print("\nEscolha uma opção: ");
    }

    public void servicos() {
        System.out.println("\n--- Lista de Veiculos ---");
        System.out.println("1. Adicionar Veiculos");
        System.out.println("2. Listar Veiculos");
        System.out.println("3. Buscar Veiculos");
        System.out.println("4. Deletar Veiculos");
        System.out.println("0. Sair");
        System.out.print("\nEscolha uma opção: ");
    }

    public void seguros() {
        System.out.println("\n--- Menu Seguro ---");
        System.out.println("1. Adicionar Seguro");
        System.out.println("2. Listar Seguros");
        System.out.println("3. Buscar Seguro");
        System.out.println("4. Deletar Seguro");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
    }

    public void manutencao(){
        System.out.println("\n--- Menu Manutenção Veicular ---");
        System.out.println("1. Adicionar Manutenção");
        System.out.println("2. Listar Manutenções");
        System.out.println("3. Buscar Manutenção");
        System.out.println("4. Atualizar Manutenção"); // **Alteração: Adicionada a opção de Atualizar**
        System.out.println("5. Deletar Manutenção"); // **Alteração: Mudou de 4 para 5**
        System.out.println("0. Sair");
        System.out.print("\nEscolha uma opção: ");
    }

    public void compraVeiculo(){
        System.out.println("\n--- Lista de Compras ---");
        System.out.println("1. Realizar Compra de Veiculos");
        System.out.println("2. Listar Compras Realizadas de Veiculos");
        System.out.println("3. Procurar por nota de Compra");
        System.out.println("4. Deletar Compra Realizada de Veiculo");
        System.out.println("0. Sair");
        System.out.print("\nEscolha uma opção: ");
    }

    public void vendaVeiculo(){
        System.out.println("\n--- Lista de Vendas---");
        System.out.println("1. Realizar Venda de Veiculos");
        System.out.println("2. Listar Vendas Realizadas de Veiculos");
        System.out.println("3. Procurar por nota de Venda");
        System.out.println("4. Deletar Venda Realizada de Veiculo");
        System.out.println("0. Sair");
        System.out.print("\nEscolha uma opção: ");
    }

    public void funcionarios() {
        System.out.println("\n--- Menu de Funcionarios ---");
        System.out.println("1. Adicionar Funcionarios");
        System.out.println("2. Listar Funcionarios");
        System.out.println("3. Buscar Funcionarios");
        System.out.println("4. Deletar Funcionarios");
        System.out.println("0. Sair");
        System.out.print("\nEscolha uma opção: ");
    }
}