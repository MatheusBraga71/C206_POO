package treino2.av2.personagem;

import treino2.av2.interfaces.Cura;
import treino2.av2.interfaces.Magia;

public class Astrologo extends Personagem implements Magia, Cura {

    public Astrologo(String nome, int vitalidade, int inteligencia, int fe){
        super(nome, (vitalidade-2), (inteligencia+5), (fe-2));
    }

    @Override
    public void passaLevel(){
        System.out.println("Astrologo subiu de nível!");
        super.passaLevel();
    }

    @Override
    public void ganhaHabilidade(){
        System.out.println("Astrologo ganhou a habilidade de localização estelar");
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
    }

    @Override
    public void aprendeFeitico(){
        System.out.println("Novo feitiço aprendido!");
    }

    @Override
    public void usaFeitico(int dano){
        System.out.println("Feitiço castado, o dano foi de: " + dano);
    }

    @Override
    public void aprendeCura(){
        System.out.println("Astrólogo aprendeu a curar!");
    }

    @Override
    public void curar(){
        System.out.println("Astrólogo se curou!");
    }
}
