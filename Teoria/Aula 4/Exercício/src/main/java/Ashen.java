public class Ashen {

    String nome;
    int vida;

    Arma arma;

    void usarArma()
    {
       arma.resistencia -= 2;
    }

    void tomarDano()
    {
        vida -= 5;
    }
}
