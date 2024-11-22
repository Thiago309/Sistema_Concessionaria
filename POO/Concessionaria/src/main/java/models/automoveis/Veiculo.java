package models.automoveis;
import java.util.*;

public class Veiculo {

    private int chassi;
    private double qtdKm;
    private String cor;
    private String localizacaoPatio;
    private String modelo;
    private String marca;
    private String statusVeiculo;
    private String ano;

    // Construtor
    public Veiculo(int chassi, double qtdKm, String cor, String localizacaoPatio, String modelo, String marca, String statusVeiculo, String ano) {
        this.chassi = chassi;
        this.qtdKm = qtdKm;
        this.cor = cor;
        this.localizacaoPatio = localizacaoPatio;
        this.modelo = modelo;
        this.marca = marca;
        this.statusVeiculo = statusVeiculo;
        this.ano = ano;
    }

    // Getters e Setters
    public int getChassi() {
        return chassi;
    }

    public void setChassi(int chassi) {
        this.chassi = chassi;
    }

    public double getQtdKm() {
        return qtdKm;
    }

    public void setQtdKm(double qtdKm) {
        this.qtdKm = qtdKm;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getLocalizacaoPatio() {
        return localizacaoPatio;
    }

    public void setLocalizacaoPatio(String localizacaoPatio) {
        this.localizacaoPatio = localizacaoPatio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getStatusVeiculo() {
        return statusVeiculo;
    }

    public void setStatusVeiculo(String statusVeiculo) {
        this.statusVeiculo = statusVeiculo;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public static class VeiculoService {
        private List<Veiculo> veiculos = new ArrayList<>();

        // Create Adiciona um novo veiculo a lista;
        public Veiculo addVeiculo(int chassi, double qtdKm, String cor, String localizacaoPatio, String modelo,
                                  String marca, String statusVeiculo, String ano) {

            Veiculo veiculo = new Veiculo(chassi, qtdKm, cor, localizacaoPatio, modelo, marca, statusVeiculo, ano);
            veiculos.add(veiculo);
            return veiculo;
        }

        // Read procura pelo veiculo através do chassi (chave unica).
        public Veiculo getVeiculo(int chassi) {
            for (Veiculo veiculo : veiculos) {
                if (veiculo.getChassi() == chassi) {
                    return veiculo;

                }
            }
            System.out.print("Veiculo não encontrado em nossos sistemas.");
            return null; // Veículo não encontrado
        }

        // Update
        public boolean updateVeiculo(int chassi, double qtdKm, String cor, String localizacaoPatio, String modelo,
                                     String marca, String statusVeiculo, String ano) {
            Veiculo veiculo = getVeiculo(chassi);
            if (veiculo != null) {
                veiculo.setQtdKm(qtdKm);
                veiculo.setCor(cor);
                veiculo.setLocalizacaoPatio(localizacaoPatio);
                veiculo.setModelo(modelo);
                veiculo.setMarca(marca);
                veiculo.setStatusVeiculo(statusVeiculo);
                veiculo.setAno(ano);
                return true; // Atualização bem-sucedida
            }
            System.out.print("Veiculo não encontrado em nossos sistemas.");
            return false; // Veículo não encontrado
        }

        // Delete
        public boolean deleteVeiculo(int chassi) {
            Veiculo veiculo = getVeiculo(chassi);
            if (veiculo != null) {
                veiculos.remove(veiculo);
                return true; // Exclusão bem-sucedida
            }
            System.out.print("Veiculo não encontrado em nossos sistemas.");
            return false; // Veículo não encontrado
        }

        // Listar todos os veículos
        public List<Veiculo> getAllVeiculos() {
            return new ArrayList<>(veiculos);
        }
    }
}

