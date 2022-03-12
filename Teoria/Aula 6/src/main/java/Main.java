public class Main {

    public static void main(String[] args) {

        Kart kart1 = new Kart(); //como o motor é uma composição de kart, aqui o motor já foi criado pelo kart
        Kart kart2 = new Kart();

        kart1.nome = "kart1";
        kart2.nome = "kart2";

        kart1.motor.cilindradas = "100";
        kart1.motor.velocidadeMaxima = 120.02f;

        kart2.motor.cilindradas = "150";
        kart2.motor.velocidadeMaxima = 110.0f;

        Piloto piloto1 = new Piloto();
        Piloto piloto2 = new Piloto();

        piloto1.nome = "piloto1";
        piloto2.nome = "piloto2";

        kart1.piloto = piloto1;
        kart2.piloto = piloto2;

        piloto1.soltaSuperPoder();
        piloto2.soltaSuperPoder();

        kart1.fazerDrift();
        kart2.fazerDrift();

        kart1.motor.mostrainfo();;
        kart2.motor.mostrainfo();

        /*
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
*/

    }
}
