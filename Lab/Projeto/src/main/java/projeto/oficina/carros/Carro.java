package projeto.oficina.carros;

public class Carro {

    private int numeroChassi;
    private String cor;
    private String modelo;
    private String Dono_cpf;


    public Carro(int numeroChassi, String cor, String modelo){
        this.numeroChassi = numeroChassi;
        this.cor = cor;
        this.modelo = modelo;
    }

    public int getNumeroChassi() {
        return numeroChassi;
    }

    public void setNumeroChassi(int numeroChassi) {
        this.numeroChassi = numeroChassi;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDono_cpf() {
        return Dono_cpf;
    }

    public void setDono_cpf(String dono_cpf) {
        Dono_cpf = dono_cpf;
    }
}

