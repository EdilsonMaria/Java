public class Funcionario {
    int Matricula;
    String Nome;
    double Salario_bruto, descontoINSS, salarioLiquido;

   public double calc_inss(){
        return descontoINSS = Salario_bruto * 0.15;
    }

    public double cal_liquido() {
        return salarioLiquido = Salario_bruto - descontoINSS;
    }


}
