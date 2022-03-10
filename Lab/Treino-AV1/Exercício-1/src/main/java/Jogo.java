public class Jogo {

    String nome;
    String genero;
    double preco;
    boolean dlc;

    void mostraInfo(){
        System.out.println("Nome do jogo: " + nome);
        System.out.println("Gênero do jogo: " + genero);
        System.out.println("Preço do jogo: " + preco);
        System.out.println("Possui DLC: " + dlc);
    }
}
