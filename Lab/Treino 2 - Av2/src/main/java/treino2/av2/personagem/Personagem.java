package treino2.av2.personagem;

import treino2.av2.arma.Arma;

public abstract class Personagem {

    public static int contador = 0;
    private String nome;
    private int vitalidade;
    private int inteligencia;
    private int fe;

    public Arma arma;

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public Personagem(String nome, int vitalidade, int inteligencia, int fe){
        this.nome = nome;
        this.vitalidade = vitalidade;
        this.inteligencia = inteligencia;
        this.fe = fe;
    }

    public void mostraInfo(){
        System.out.println("Nome do personagem: " + nome);
        System.out.println("Vitalidade do personagem: " + vitalidade);
        System.out.println("Inteligência do personagem: " + inteligencia);
        System.out.println("Fé do personagem: " + fe);

        if(arma != null) {
            System.out.println("Arma do personagem: " + arma.getTipo());
        }
    }

    public void passaLevel(){
        vitalidade++;
        inteligencia++;
        fe++;
    }

    public abstract void ganhaHabilidade();

}
