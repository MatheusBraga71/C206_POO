package av2.c206L3.personagem;

import av2.c206L3.interfaces.Alianca;
import av2.c206L3.interfaces.CombateDistancia;

public class Anao extends Personagem implements Alianca, CombateDistancia {

    private String tamanhoDaBarba;

    public Anao(double vida, String nome, String tamanhoDaBarba){
        super(vida, nome);
        setClasse("Caçador");
        this.tamanhoDaBarba = tamanhoDaBarba;
    }

    public String Endurecer(){
        String endurecer = "Endurecendo!";
        return endurecer;
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

        System.out.println("Tamanho da barba: " + tamanhoDaBarba);
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
    public void CastarSpell(){
        System.out.println("Atirando");
    }

}
