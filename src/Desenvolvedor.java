public class Desenvolvedor extends Funcionario {

    private int quantidadeProjetos;

    public Desenvolvedor (String nome, double salarioBase, int quantidadeProjetos){
        super(nome, salarioBase);
        this.quantidadeProjetos = quantidadeProjetos;
    }

    @Override
    public void calcularSalario(){
        double salarioFinal = getSalarioBase() + (quantidadeProjetos * 500);
        System.out.printf("Salário: R$ %.2f%n", salarioFinal);
    }

    @Override
    public String getCargo(){
        return "Desenvolvedor";
    }

    public int getQuantidadeProjetos(){
        return quantidadeProjetos;
    }
    public void setQuantidadeProjetos(int quantidadeProjetos){
        this.quantidadeProjetos = quantidadeProjetos;
    }


}
