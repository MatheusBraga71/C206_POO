package treino.av2.funcionario;

import treino.av2.interfaces.Reuniao;
import treino.av2.interfaces.Venda;

public class GerenteRegional extends Funcionario implements Reuniao, Venda {

    private String departamento;

    public GerenteRegional(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public void recebeSalario(){
        System.out.println("O Gerente Regional " + getNome() + " recebeu seu salário de: "+ getSalario());
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Departamento: " + departamento);
    }

    public void promoveFuncionario(){
        System.out.println("Funcionário foi promovido!");
    }

    @Override
    public void agendaReuniao(String motivo){
        System.out.println("Motivo da reunião: " + motivo);
    }

    @Override
    public void fechaVenda(double valorVenda){
        System.out.println("Venda no valor de " + valorVenda + " fechada!");
    }
}
