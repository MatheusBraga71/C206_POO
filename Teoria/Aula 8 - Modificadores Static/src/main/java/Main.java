public class Main {

    public static void main(String[] args) {

        Soma soma = new Soma();
        System.out.println(soma.x); //X não é static, então há a necessidade de instanciar

        System.out.println(Soma.soma(10, 50)); //não tem necessidade de instanciar a função

        Soma soma1 = new Soma();
        Soma soma2 = new Soma();
        Soma soma3 = new Soma();

        System.out.println(Soma.y); // A cada instanciação de variável o construtor é chamado e soma 1 na variável y

    }
}
// métodos do tipo static são utilitários(helpers), são usados para ajudar as classes em algumas funções