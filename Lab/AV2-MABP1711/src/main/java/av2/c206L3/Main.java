package av2.c206L3;

import av2.c206L3.guilda.Guilda;
import av2.c206L3.personagem.Anao;
import av2.c206L3.personagem.Humano;
import av2.c206L3.personagem.Personagem;
import av2.c206L3.personagem.Troll;
import av2.c206L3.personagem.Orc;

public class Main {

    public static void main(String[] args) {

        Guilda alianca = new Guilda("Aliança");
        Guilda horda = new Guilda("Horda");

        Personagem[] aliados = new Personagem[5];
        Personagem[] invasores = new Personagem[5];

        Personagem anao = new Anao(25, "Giant Leo", "Longa");

        Personagem humano = new Humano(15, "Escanor", "Curto");

        aliados[0] = anao;
        aliados[1] = humano;

        alianca.setMembros(aliados);

        Personagem orc = new Orc(30, "Ragnir", "Verde");
        Personagem troll = new Troll(40, "Trost", "Grande e afiada");

        invasores[0] = orc;
        invasores[1] = troll;

        horda.setMembros(invasores);

        alianca.mostraInfo();
        System.out.print("\n");

        horda.mostraInfo();
        System.out.print("\n");

        System.out.println("Guild Raid: ");
        alianca.GuildRaid();
        System.out.print("\n");

        horda.GuildRaid();
        System.out.print("\n");
    }
}
