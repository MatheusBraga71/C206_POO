package treino2.av2;

import treino2.av2.arma.Arma;
import treino2.av2.personagem.Astrologo;
import treino2.av2.personagem.Confessor;
import treino2.av2.personagem.Personagem;
import treino2.av2.personagem.Samurai;

public class Main {

    public static void main(String[] args) {

        Personagem ast = new Astrologo("Stellar", 10, 10, 10);
        Arma wand = new Arma("Cajado");
        ast.setArma(wand);

        Personagem sam = new Samurai("Dororo", 10, 10,10,5);
        Arma enma = new Arma("katana");
        sam.setArma(enma);

        Personagem con = new Confessor("Pope", 10,10,10);
        Arma divine = new Arma("Alabarda");
        con.setArma(divine);

        Personagem[] personagens = new Personagem[5];

        personagens[0] = ast;
        personagens[1] = sam;
        personagens[2] = con;

        for(Personagem personagem : personagens){
            if(personagem != null) {

                if (personagem instanceof Astrologo) {
                    Astrologo a = (Astrologo) personagem;
                    System.out.println("Status atual do astrólogo:");
                    a.mostraInfo();
                    a.passaLevel();
                    a.ganhaHabilidade();
                    a.aprendeFeitico();
                    a.usaFeitico(15);
                    a.aprendeCura();
                    a.curar();
                    System.out.println("Status após subir de nivel");
                    a.mostraInfo();
                } else if (personagem instanceof Samurai) {
                    Samurai s = (Samurai) personagem;
                    System.out.println("Status atual do samurai:");
                    s.mostraInfo();
                    s.passaLevel();
                    s.ganhaHabilidade();
                    s.aprendeCura();
                    s.curar();
                    System.out.println("Status após subir de nivel");
                    s.mostraInfo();
                } else {
                    Confessor c = (Confessor) personagem;
                    System.out.println("Status atual do confessor: ");
                    c.mostraInfo();
                    c.passaLevel();
                    c.ganhaHabilidade();
                    c.aprendeCura();
                    c.curar();
                    System.out.println("Status após subir de nivel");
                    c.mostraInfo();
                }
            }
        }
    }
}
