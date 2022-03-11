public class Main {

    public static void main(String[] args) {

        Kart kart1 = new Kart(); //como o motor é uma composição de kart, aqui o motor já foi criado pelo kart
        Kart kart2 = new Kart();

        kart1.nome = "kart1";
        kart2.nome = "kart2";

        kart1.motor.cilindradas = "100";
        kart1.motor.velocidadeMaxima = 100;

        kart2.motor.cilindradas = "150";
        kart2.motor.velocidadeMaxima = 100;

        /*
        Piloto p1 = new Piloto();
        p1.nome = "Bowser";
        p1.vilao = true;

        Piloto p2 = new Piloto();
        p2.nome = "Yoshi";
        p2.vilao = false;

        Kart kart1 = new Kart();
        kart1.nome = "Maverick";
        kart1.piloto = p1;
        kart1.motor.cilindradas = "100";
        kart1.motor.velocidadeMaxima = 100;

        Kart kart2 = new Kart();
        kart2.nome = "Fuscão";
        kart2.piloto = p2;
        kart2.motor.cilindradas = "150";
        kart2.motor.velocidadeMaxima = 98;


         */
        kart1.pular();
        kart1.fazerDrift();
        kart1.soltarTurbo();
        kart1.piloto.soltaSuperPoder();
        kart1.motor.mostrainfo();

        kart2.pular();
        kart2.fazerDrift();
        kart2.soltarTurbo();
        kart2.piloto.soltaSuperPoder();
        kart2.motor.mostrainfo();


    }
}
