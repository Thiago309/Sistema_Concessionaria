package Models;

import java.util.*;

public class Cliente {
    private int idCliente;
    private String nome;
    private String cep;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String telefone;
    private String estado;
    private String cidade;
    private String email;

    // Construtor
    public Cliente(int idCliente, String nome, String cep, String logradouro, int numero, String complemento,
                   String bairro, String telefone, String estado, String cidade, String email) {

        this.idCliente = idCliente;
        this.nome = nome;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.telefone = telefone;
        this.estado = estado;
        this.cidade = cidade;
        this.email = email;
    }

    // Getters e Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    protected void exibirInfo() {
        System.out.println("ID do Cliente: " + idCliente);
        System.out.println("Nome: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Logradouro: " + logradouro);
        System.out.println("Número: " + numero);
        System.out.println("Complemento: " + complemento);
        System.out.println("Bairro: " + bairro);
        System.out.println("Telefone: " + telefone);
        System.out.println("Estado: " + estado);
        System.out.println("Cidade: " + cidade);
        System.out.println("Email: " + email);
    }

    public static class ClienteService {
        private List<Cliente> clientes = new ArrayList<>();
        private int nextId = 1000;

        // Create = Criando - Adiciona um novo cliente à lista.
        public Cliente addCliente(String nome, String cep, String logradouro, int numero, String complemento,
                                  String bairro, String telefone, String estado, String cidade, String email) {

            Cliente cliente = new Cliente(nextId++, nome, cep, logradouro, numero, complemento, bairro, telefone, estado, cidade, email);
            clientes.add(cliente);
            return cliente;
        }

        // Read = Leitura - Recupera um cliente pelo seu ID.
        public Cliente getCliente(int idCliente) {
            for (Cliente cliente : clientes) {
                if (cliente.getIdCliente() == idCliente) {
                    return cliente;
                }
            }
            System.out.print("Cliente não encontrado em nossos sistemas.");
            return null; // Cliente não encontrado
        }

        // Update - Atualiza os dados de um cliente existente.
        public boolean updateCliente(int idCliente, String nome, String cep, String logradouro, int numero, String complemento,
                                     String bairro, String telefone, String estado, String cidade, String email) {

            Cliente cliente = getCliente(idCliente);

            if (cliente != null) {
                cliente.setNome(nome);
                cliente.setCep(cep);
                cliente.setLogradouro(logradouro);
                cliente.setNumero(numero);
                cliente.setComplemento(complemento);
                cliente.setBairro(bairro);
                cliente.setTelefone(telefone);
                cliente.setEstado(estado);
                cliente.setCidade(cidade);
                cliente.setEmail(email);

                return true; // Atualização bem-sucedida
            }

            System.out.print("Cliente não encontrado em nossos sistemas.");
            return false; // Cliente não encontrado

        }

        // Delete - Remove um cliente da lista.
        public boolean deleteCliente(int idCliente) {
            Cliente cliente = getCliente(idCliente);
            if (cliente != null) {
                clientes.remove(cliente);
                return true; // Exclusão bem-sucedida
            }
            System.out.print("Cliente não encontrado em nossos sistemas.");
            return false; // Cliente não encontrado
        }

        // Retorna todos os clientes armazenados.
        public List<Cliente> getAllClientes() {
            return new ArrayList<>(clientes); // Retorna uma nova lista com os clientes
        }
    }
}


/*
package cliente;

import java.util.*;

public class Cliente {
    private int idCliente;
    private String nome;
    private String cep;
    private String logradouro;
    private int numero;
    private String complemento;
    private String bairro;
    private String telefone;
    private String estado;
    private String cidade;
    private String email;

    // Construtor
    public Cliente(int idCliente, String nome, String cep, String logradouro, int numero, String complemento,
                   String bairro, String telefone, String estado, String cidade, String email) {

        this.idCliente = idCliente;
        this.nome = nome;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
        this.telefone = telefone;
        this.estado = estado;
        this.cidade = cidade;
        this.email = email;
    }

    // Getters e Setters
    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    protected void exibirInfo() {
        System.out.println("ID do Cliente: " + idCliente);
        System.out.println("Nome: " + nome);
        System.out.println("CEP: " + cep);
        System.out.println("Logradouro: " + logradouro);
        System.out.println("Número: " + numero);
        System.out.println("Complemento: " + complemento);
        System.out.println("Bairro: " + bairro);
        System.out.println("Telefone: " + telefone);
        System.out.println("Estado: " + estado);
        System.out.println("Cidade: " + cidade);
        System.out.println("Email: " + email);
    }

    public static class ClienteService {
        private List<Cliente> clientes = new ArrayList<>();
        private int nextId = 1000;

        // Create = Criando - Adiciona um novo cliente à lista.
        public Cliente addCliente(String nome, String cep, String logradouro, int numero, String complemento,
                                  String bairro, String telefone, String estado, String cidade, String email) {

            Cliente cliente = new Cliente(nextId++, nome, cep, logradouro, numero, complemento, bairro, telefone, estado, cidade, email);
            clientes.add(cliente);
            return cliente;
        }

        // Read = Leitura - Recupera um cliente pelo seu ID.
        public Cliente getCliente(int idCliente) {
            for (Cliente cliente : clientes) {
                if (cliente.getIdCliente() == idCliente) {
                    return cliente;
                }
            }
            System.out.print("Cliente não encontrado em nossos sistemas.");
            return null; // Cliente não encontrado
        }

        // Update - Atualiza os dados de um cliente existente.
        public boolean updateCliente(int idCliente, String nome, String cep, String logradouro, int numero, String complemento,
                                     String bairro, String telefone, String estado, String cidade, String email) {

            Cliente cliente = getCliente(idCliente);

            if (cliente != null) {
                cliente.setNome(nome);
                cliente.setCep(cep);
                cliente.setLogradouro(logradouro);
                cliente.setNumero(numero);
                cliente.setComplemento(complemento);
                cliente.setBairro(bairro);
                cliente.setTelefone(telefone);
                cliente.setEstado(estado);
                cliente.setCidade(cidade);
                cliente.setEmail(email);

                return true; // Atualização bem-sucedida
            }

            System.out.print("Cliente não encontrado em nossos sistemas.");
            return false; // Cliente não encontrado

        }

        // Delete - Remove um cliente da lista.
        public boolean deleteCliente(int idCliente) {
            Cliente cliente = getCliente(idCliente);
            if (cliente != null) {
                clientes.remove(cliente);
                return true; // Exclusão bem-sucedida
            }
            System.out.print("Cliente não encontrado em nossos sistemas.");
            return false; // Cliente não encontrado
        }

        // Retorna todos os clientes armazenados.
        public List<Cliente> getAllClientes() {
            return new ArrayList<>(clientes); // Retorna uma nova lista com os clientes
        }
    }
}  */

