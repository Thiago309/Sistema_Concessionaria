package cliente;

import java.util.Date;

public class PessoaFisica extends Cliente {

    private String cpf;
    private char sexo;
    private Date dtNascimento;

    // Construtor
    public PessoaFisica(int idCliente, String nome, String cep, String logradouro, int numero, String complemento,
                        String bairro, String telefone, String estado, String cidade, String email,
                        String cpf, char sexo, Date dtNascimento) {
        super(idCliente, nome, cep, logradouro, numero, complemento, bairro, telefone, estado, cidade, email);
        this.cpf = cpf;
        this.sexo = sexo;
        this.dtNascimento = dtNascimento;
    }

    // Getters e Setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    // Método para exibir informações da pessoa física
    public void exibirInfo() {
        super.exibirInfo(); // Chama o método exibirInfo da classe Cliente
        System.out.println("CPF: " + cpf);
        System.out.println("Sexo: " + sexo);
        System.out.println("Data de Nascimento: " + dtNascimento);
    }
}
