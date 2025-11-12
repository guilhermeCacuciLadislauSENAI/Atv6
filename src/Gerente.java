public class Gerente extends Funcionario {

    private double bonus;

    public Gerente(String nome, double salarioBase, double bonus){
        super(nome, salarioBase);
        this.bonus = bonus;
    }

    @Override
    public void calcularSalario(){
        double salarioFinal = getSalarioBase() + bonus;
        System.out.printf("Salário do gerente: R$ %.2f%n", salarioFinal);
    }

    public double getBonus(){
        return bonus;
    }
    public void setBonus(double bonus){
        this.bonus = bonus;
    }

}
