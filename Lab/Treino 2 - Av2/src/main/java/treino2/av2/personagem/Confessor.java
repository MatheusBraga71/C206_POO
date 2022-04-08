package treino2.av2.personagem;

import treino2.av2.interfaces.Cura;

public class Confessor extends Personagem implements Cura {

    public Confessor(String nome, int vitalidade, int inteligencia, int fe){
        super(nome, (vitalidade-2), (inteligencia-2), (fe+5));
    }

    @Override
    public void passaLevel(){
        System.out.println("Confessor subiu de nivel");
        super.passaLevel();
    }

    @Override
    public void ganhaHabilidade(){
        System.out.println("Confessor ganhou a habilidade Olhar da Penitência");
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
    }

    @Override
    public void aprendeCura(){
        System.out.println("Confessor aprendeu a se curar!");
    }

    @Override
    public void curar(){
        System.out.println("Confessor se curou!");
    }
}
