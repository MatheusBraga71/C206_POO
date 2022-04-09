package av2.c206L3.personagem;

import av2.c206L3.interfaces.Alianca;
import av2.c206L3.interfaces.CombateCorpoACorpo;

public class Humano extends Personagem implements Alianca, CombateCorpoACorpo {

    private String tamanhoDoCabelo;

    public Humano(double vida, String nome, String tamanhoDoCabelo) {
        super(vida, nome);
        setClasse("Paladino");
        this.tamanhoDoCabelo = tamanhoDoCabelo;
    }

    public String Motivar(){
        String motivacao = "Motivando!";
        return motivacao;
    }

    @Override
    public void entrarEmRaid(){
        System.out.println(getNome() + " entrando em raid.");
    }

    @Override
    public void entrarEmPvP(){
        System.out.println(getNome() + " entrando em arena PvP.");
    }

    @Override
    public void mostrarInfo(){
        System.out.println("Nome do personagem: " + getNome());
        System.out.println("Vida: " + getVida());
        System.out.println("Classe: " + getClasse());

        System.out.println("Tamanho do cabelo: " + tamanhoDoCabelo);
    }

    @Override
    public void ForTheAlliance(){
        System.out.println("Pela Aiança!");
    }

    @Override
    public void InvadirHorda(){
        System.out.println("Invadindo Orgrimmar");
    }

    @Override
    public void SacarArma(){
        System.out.println("Desembainhando espada.");
    }
}
