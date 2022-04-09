package av2.c206L3.personagem;

import av2.c206L3.interfaces.CombateCorpoACorpo;
import av2.c206L3.interfaces.Horda;

public class Orc extends Personagem implements Horda,CombateCorpoACorpo{

    private String corDaPele;

    public Orc(double vida, String nome, String corDaPele){
        super(vida, nome);
        setClasse("Guerreiro");
        this.corDaPele = corDaPele;

    }

    public String Enfurecer(){
        String furia = "Enfurecendo!";
        return furia;
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

        System.out.println("Cor da pele: " + corDaPele);
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
    public void SacarArma(){
        System.out.println("Pegando machado de duas mãos.");
    }

}
