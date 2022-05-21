package projeto.oficina.funcionario;

import projeto.oficina.interfaces.VerificaStatus;

public class Mecanico implements VerificaStatus {

    private String cpf;
    private String nome;

    public Mecanico(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void verificacao() {

    }
}
