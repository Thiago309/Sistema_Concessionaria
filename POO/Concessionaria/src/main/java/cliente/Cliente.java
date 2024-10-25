package cliente;

public class Cliente {
    protected String idCliente;
    protected String cep;
    protected String logradouro;
    protected int numero;
    protected String complemento;

    public Cliente() {

    }

    public Cliente(String idCliente, String cep, String logradouro, int numero, String complemento) {
        this.idCliente = idCliente;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }
}

    /*
    private String idCliente;
    private String nome;
    private String cep;
    private String logradouro;
    private int numero;
    private String complemento;

    public Cliente(String idCliente, String cep, String logradouro, int numero, String complemento) {
        this.idCliente = idCliente;
        this.cep = cep;
        this.logradouro = logradouro;
        this.numero = numero;
        this.complemento = complemento;
    }

    // Getters e Setters
    public String getIdCliente() { return idCliente; }
    public void setIdCliente(String idCliente) { this.idCliente = idCliente; }
    // Outros getters e setters...
}

     */

