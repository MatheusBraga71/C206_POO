package projeto.oficina.funcionario;

import projeto.oficina.carros.Carro;
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

    public String getNome() {
        return nome;
    }
    /*
    @Override
    public void verificaMotor(Carro carro) {
        System.out.println("Realizando teste do motor do " + carro.getModelo());
    }

    @Override
    public void verificaLuzes(Carro carro) {
        System.out.println("Realizando teste da iluminação do " + carro.getModelo());
    }

    @Override
    public void verificaFreios(Carro carro) {
        System.out.println("Realizando teste dos freios do " + carro.getModelo());
    }

    */

    @Override
    public void verificaProblema(Carro carro) {

    }
}
