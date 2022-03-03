public class Main {

    public static void main(String[] args) {

        // Criação de um objeto Ashen
        Ashen p = new Ashen();
        p.vida = 100;
        p.nome = "DeadMan";

        // Criação de um objeto Arma
        Arma arma = new Arma();
        arma.nome = "LastHope";
        arma.poder = 450;
        arma.resistencia = 50;
        arma.descricao = "Arma criada pelos últimos sobreviventes para dizimar os inimigos";

        // Agregação
        p.arma = arma;

        System.out.println("Vida do "+ p.nome + ": " + p.vida);
        System.out.println("Informações sobre a arma usada");
        p.arma.mostraInfoArma();

        p.tomarDano();
        p.usarArma();

        System.out.println("Informações do personagem após tomar dano e usar a arma:");

        System.out.println("Vida do "+ p.nome + ": " + p.vida);
        System.out.println("Informações sobre a arma usada");
        p.arma.mostraInfoArma();

    }
}
