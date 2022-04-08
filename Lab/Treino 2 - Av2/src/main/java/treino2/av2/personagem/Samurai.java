package treino2.av2.personagem;

import treino2.av2.interfaces.Cura;

public class Samurai extends Personagem implements Cura {

    private int honra;

    public Samurai(String nome, int vitalidade, int inteligencia, int fe, int honra){
        super(nome, (vitalidade+5), (inteligencia-2), (fe-2));
        this.honra = honra;
    }

    @Override
    public void passaLevel(){
        System.out.println("Samurai subiu de nível!");
        super.passaLevel();
        honra++;
    }

    @Override
    public void ganhaHabilidade(){
        System.out.println("Samurai ganhou a habilidade de usar mais uma espada");
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Honra do samurai: " + honra);
    }

    @Override
    public void aprendeCura(){
        System.out.println("Samurai aprendeu a se curar!");
    }

    @Override
    public void curar(){
        System.out.println("Samurai se curou!");
    }

}
