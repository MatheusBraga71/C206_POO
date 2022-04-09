package av2.c206L3.personagem;

public abstract class Personagem {

    private double vida;
    private String nome;
    private String classe;

    private static int personagensCriados = 0;

    public String getNome() {
        return nome;
    }

    public double getVida() {
        return vida;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public static int getPersonagensCriados() {
        return personagensCriados;
    }

    public Personagem(double vida, String nome){
        this.vida = vida;
        this.nome = nome;
        this.classe = classe;
        personagensCriados++;
    }

    public abstract void entrarEmRaid();

    public abstract void entrarEmPvP();

    public abstract void mostrarInfo();
}
