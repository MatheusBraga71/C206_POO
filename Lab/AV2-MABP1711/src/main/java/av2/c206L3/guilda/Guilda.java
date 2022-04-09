package av2.c206L3.guilda;

import av2.c206L3.personagem.*;

public class Guilda {

    private String nome;

    private Personagem[] membros = new Personagem[4];

    public void setMembros(Personagem[] membros) {
        this.membros = membros;
    }

    public Guilda(String nome){
        this.nome = nome;
    }

    public void GuildRaid(){
        for(int i = 0; i< membros.length;i++){
            if(membros[i] != null) {
                membros[i].entrarEmRaid();
            }
        }
    }

    public void mostraInfo(){
        System.out.println("Nome da Guilda: " + nome);
        for (Personagem membro : membros) {
            if (membro != null) {
                if (membro instanceof Anao) {
                    Anao a = (Anao) membro;
                    a.mostrarInfo();
                    a.InvadirHorda();
                    a.entrarEmPvP();
                    a.entrarEmRaid();
                    a.ForTheAlliance();
                    a.Endurecer();
                    a.CastarSpell();
                    System.out.print("\n");
                }
                else if(membro instanceof Humano){
                    Humano h = (Humano)membro;
                    h.mostrarInfo();
                    h.InvadirHorda();
                    h.entrarEmPvP();
                    h.entrarEmRaid();
                    h.ForTheAlliance();
                    h.Motivar();
                    h.SacarArma();
                    System.out.print("\n");
                }
                else if(membro instanceof Orc){
                    Orc o = (Orc)membro;
                    o.mostrarInfo();
                    o.InvadirAlianca();
                    o.entrarEmPvP();
                    o.entrarEmRaid();
                    o.ForTheHorde();
                    o.Enfurecer();
                    o.SacarArma();
                    System.out.print("\n");
                }
                else{
                    Troll t = (Troll)membro;
                    t.mostrarInfo();
                    t.InvadirAlianca();
                    t.entrarEmPvP();
                    t.entrarEmRaid();
                    t.ForTheHorde();
                    t.Regenerar();
                    t.CastarSpell();
                    System.out.print("\n");
                }
            }
        }
    }
}
