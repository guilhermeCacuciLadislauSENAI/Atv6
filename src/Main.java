public class Main {
    public static void main(String[] args) {
        Funcionario desenvolvedor1 = new Desenvolvedor("Guilherme", 5000.00, 30);
        Funcionario gerente1 = new Gerente("Arthur", 7000.00, 500.00);

        desenvolvedor1.calcularSalario();
        gerente1.calcularSalario();

    }
}