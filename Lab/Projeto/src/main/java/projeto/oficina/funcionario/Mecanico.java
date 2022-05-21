package projeto.oficina.funcionario;

import projeto.oficina.interfaces.VerificaStatus;

public class Mecanico implements VerificaStatus {

    private String cpf;
    private String nome;

    public Mecanico(String cpf, String nome){
        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public void verificacao() {

    }
}
