package av2.c206L3.personagem;

import av2.c206L3.interfaces.CombateCorpoACorpo;
import av2.c206L3.interfaces.CombateDistancia;
import av2.c206L3.interfaces.Horda;

public class Troll extends Personagem implements Horda, CombateDistancia {

    private String tamanhoDaPresa;

    public Troll(double vida, String nome, String tamanhoDaPresa){
        super(vida, nome);
        setClasse("Xamã");
        this.tamanhoDaPresa = tamanhoDaPresa;
    }

    public String Regenerar(){
        String regen = "Regenrando!";
        return  regen;
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

        System.out.println("Tamanho da presa: " + tamanhoDaPresa);
    }

    @Override
    public void ForTheHorde(){
        System.out.println("Pela Horda!");
    }

    @Override
    public void InvadirAlianca(){
        System.out.println("Invadindo Stormwind");
    }

    @Override
    public void CastarSpell(){
        System.out.println("Castando totem.");
    }
}
