package cliente;

public class PessoaJuridica extends Cliente{
    private String cnpj;
    private String inscricaoEstadual;
    private String nomeFantasia;
    private String site;

    // Construtor
    public PessoaJuridica(int idCliente, String nome, String cep, String logradouro, int numero, String complemento,
                          String bairro, String telefone, String estado, String cidade, String email,
                          String cnpj, String inscricaoEstadual, String nomeFantasia, String site) {
        super(idCliente, nome, cep, logradouro, numero, complemento, bairro, telefone, estado, cidade, email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.nomeFantasia = nomeFantasia;
        this.site = site;
    }

    // Getters e Setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    // Método para exibir informações da pessoa jurídica
    public void exibirInfo() {
        super.exibirInfo(); // Chama o método exibirInfo da classe Cliente
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Inscrição Estadual: " + inscricaoEstadual);
        System.out.println("Nome Fantasia: " + nomeFantasia);
        System.out.println("Site: " + site);
    }
}
