public class Piloto {

    String nome;
    boolean vilao;

    public void soltaSuperPoder(){
        System.out.println("Piloto " + nome + " soltando super poder!");
        if(vilao)
            System.out.println("O piloto " + nome + " é um vilão");
        else
            System.out.println("O piloto " + nome + " não é um vilão");
    }
}
