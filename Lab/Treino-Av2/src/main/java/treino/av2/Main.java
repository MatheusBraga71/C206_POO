package treino.av2;

import treino.av2.carro.Carro;
import treino.av2.funcionario.Contador;
import treino.av2.funcionario.Funcionario;
import treino.av2.funcionario.GerenteRegional;
import treino.av2.funcionario.Vendedor;

public class Main {

    public static void main(String[] args) {

        Funcionario gerenteRegional = new GerenteRegional("Matheus", 5000.00, "Controle");
        Funcionario vendedor = new Vendedor("Paulo", 1300.00);
        Funcionario contador = new Contador("Davi", 2500.00, 345);

        Funcionario[] funcionarios = new Funcionario[5];

        Carro c1 = new Carro("Preto", "Porsche");
        Carro c2 = new Carro("Azul", "Mustang");
        Carro c3 = new Carro("Vermelho", "Ferrari");

        funcionarios[0] = gerenteRegional;
        funcionarios[1] = vendedor;
        funcionarios[2] = contador;

        funcionarios[0].setCarro(c1);
        funcionarios[1].setCarro(c2);
        funcionarios[2].setCarro(c3);

        for(Funcionario funcionario : funcionarios){
            if(funcionario instanceof GerenteRegional){
                GerenteRegional gR = (GerenteRegional) funcionario;
                gR.recebeSalario();
                gR.agendaReuniao("Feedback");
                gR.fechaVenda(13000);
                gR.mostraInfo();
            }
            else if(funcionario instanceof Vendedor){
                Vendedor v = (Vendedor) funcionario;
                v.recebeSalario();
                v.fechaVenda(1000); //200
                v.mostraInfo();
            }
            else if(funcionario instanceof Contador){
                Contador c = (Contador) funcionario;
                c.recebeSalario();
                c.cadastraDespesa("Tinta da impressora");
                c.mostraInfo();
            }
        }
    }
}
