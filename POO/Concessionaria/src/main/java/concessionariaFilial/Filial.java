package concessionariaFilial;

public class Filial {
    import java.util.ArrayList;
import java.util.List;

    public class Concessionaria {
        private String nome;
        private String cnpj;
        private String endereco;
        private List<Carro> estoqueCarros;
        private List<Venda> listaVendas;

        // Construtor
        public Concessionaria(String nome, String cnpj, String endereco) {
            this.nome = nome;
            this.cnpj = cnpj;
            this.endereco = endereco;
            this.estoqueCarros = new ArrayList<>();
            this.listaVendas = new ArrayList<>();
        }

        // Método para adicionar um carro ao estoque
        public void adicionarCarroEstoque(Carro carro) {
            estoqueCarros.add(carro);
        }

        // Método para remover um carro do estoque pelo chassi
        public void removerCarroEstoque(String chassi) {
            estoqueCarros.removeIf(carro -> carro.getChassi().equals(chassi));
        }

        // Método para listar carros disponíveis no estoque
        public List<Carro> listarCarrosDisponiveis() {
            return estoqueCarros;
        }

        // Método para gerar relatório de vendas
        public void gerarRelatorioVendas() {
            for (Venda venda : listaVendas) {
                System.out.println(venda);
            }
        }
    }

}
