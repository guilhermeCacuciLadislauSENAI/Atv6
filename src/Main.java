public class Main {
    public static void main(String[] args) {

        Funcionario [] funcionarios = new Funcionario[15];

        funcionarios[0] = new Desenvolvedor("Guilherme", 5000.00, 10);
        funcionarios[1] = new Desenvolvedor("Arthur", 3000.00, 5);
        funcionarios[2] = new Desenvolvedor("Matheus", 4500.00, 8);
        funcionarios[3] = new Desenvolvedor("Yuz", 3500.00, 7);
        funcionarios[4] = new Desenvolvedor("Elieu", 4700.00, 9);
        funcionarios[5] = new Gerente("Hudson", 8000.00, 1000.00);
        funcionarios[6] = new Gerente("Heitor", 9000.00, 1500.00);
        funcionarios[7] = new Gerente("Samuel", 9500.00, 2000.00);
        funcionarios[8] = new Gerente("Theo", 10000.00, 1700.00);
        funcionarios[9] = new Gerente("Pedro", 8700.00, 2500.00);
        funcionarios[10] = new Estagiario("Ícaro", 1000.00);
        funcionarios[11] = new Estagiario("Ryan", 1500.00);
        funcionarios[12] = new Estagiario("Wesley", 1700.00);
        funcionarios[13] = new Estagiario("Rafael", 1500.00);
        funcionarios[14] = new Estagiario("César", 1000.00);


        for(Funcionario f : funcionarios){
            System.out.print("Nome: " + f.getNome() + " - Cargo: " + f.getCargo() + " - ");
            f.calcularSalario();
        }

    }
}