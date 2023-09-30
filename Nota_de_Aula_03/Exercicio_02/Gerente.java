public class Gerente extends Funcionario{
    private String departamento;
    private double calcularbonus;
    private double bonus;
    public Gerente (String nome, double salario, String departamento, double calcularbonus) {
        super(nome, salario);
        this.departamento = departamento;
        this.calcularbonus = calcularbonus;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getCalcularbonus() {
        return calcularbonus;
    }

    public void setCalcularbonus(double calcularbonus) {
        this.calcularbonus = calcularbonus;
    }

    public double adicionalBonus(){
        double calculando = bonus / 100;
        double somar = getSalario() * calculando;
        calcularbonus = somar + getSalario();;
        return calcularbonus;
    }

    public void detalhes(){
        System.out.println("O nome do Gerente é " + nome);
        System.out.println("O salario do gerente é de R$" + salario);
        System.out.println("O departamento de " + departamento + " ,onde o gerente trabalha " +
                "tem adicional de 10%, sendo assim seu salario total é de R$" + calcularbonus);
    }



}
