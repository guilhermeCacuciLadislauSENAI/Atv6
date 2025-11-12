public class Estagiario extends Funcionario {

    public Estagiario (String nome, double salarioBase){
        super(nome, salarioBase);
    }

    @Override
    public void calcularSalario(){
        double descontoSalario = getSalarioBase() * 0.2;
        double salarioFinal = getSalarioBase() - descontoSalario;
        System.out.printf("Salário: R$ %.2f%n", salarioFinal);
    }

    @Override
    public String getCargo(){
        return "Estagiário";
    }

}
