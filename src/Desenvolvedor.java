public class Desenvolvedor extends Funcionario {

    private int quantidadeProjetos;

    public Desenvolvedor (String nome, double salarioBase, int quantidadeProjetos){
        super(nome, salarioBase);
        this.quantidadeProjetos = quantidadeProjetos;
    }

    @Override
    public void calcularSalario(){
        double salarioFinal = getSalarioBase() + (quantidadeProjetos * 500);
        System.out.printf("Salário do desenvolvedor: R$ %.2f%n", salarioFinal);
    }

    public int getQuantidadeProjetos(){
        return quantidadeProjetos;
    }
    public void setQuantidadeProjetos(int quantidadeProjetos){
        this.quantidadeProjetos = quantidadeProjetos;
    }


}
