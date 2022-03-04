public class Main {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Phyll", 34, "12345678900");

      //  f1.nome = "Phyll";
      //  f1.cpf = "12345678900";
        f1.salario = 2000;
      //  f1.idade = 34;

        Funcionario f2 = new Funcionario();
        f2.nome = "Matheus";
        f2.cpf = "2345";
        f2.idade = 20;
        f2.salario = 950;

        f1.tirarFerias("Janeiro");
        System.out.println(f1.calculaSalarioAnual());



    }
}
