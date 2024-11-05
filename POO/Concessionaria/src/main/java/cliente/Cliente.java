package cliente;

public class Cliente {
    protected String idCliente;
    protected String nomeCliente;
    protected String cep;
    protected String logradouro;
    protected int telefone;
    protected String Estado;
    protected String Cidade;
    protected String Email;


    public Cliente() {

    }

    public Cliente(String idCliente, String cep, String logradouro, int numero, String complemento) {
        this.idCliente = idCliente;
        this.cep = cep;
        this.logradouro = logradouro;
        this.telefone = telefone;

    }
}
/*
    // Getters e Setters
    public String getIdCliente() { return idCliente; }
    public void setIdCliente(String idCliente) { this.idCliente = idCliente; }
    // Outros getters e setters...
}

     */

