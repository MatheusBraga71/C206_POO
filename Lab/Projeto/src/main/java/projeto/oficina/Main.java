package projeto.oficina;

import projeto.oficina.DAO.CarroDAO;
import projeto.oficina.DAO.DonoDAO;
import projeto.oficina.carros.Carro;
import projeto.oficina.dono.Dono;

public class Main {

    public static void main(String[] args) {


        CarroDAO cDAO = new CarroDAO();

        Carro carro = new Carro(12345, "Preto", "Sport");

        DonoDAO dDAO = new DonoDAO();

        Dono d1 = new Dono();
        d1.setCpf("123456");
        d1.setNome("João");

        carro.setDono_cpf(d1.getCpf());

        //dDAO.inserirDono(d1);

        //cDAO.inserirCarro(carro);

        cDAO.buscarCarrosSemFiltro();

        cDAO.buscarCarroPorNumeroDoChassi(12345);

        cDAO.deletarCarro(12345);

        //dDAO.buscarDonoPorCPF("3");

        //dDAO.atualizarDono("123456",d2);

        //dDAO.deletarDono("566768");


    }
}
