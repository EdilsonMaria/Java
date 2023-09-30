public class Diretor extends Funcionario{
    private int ações;
    public Diretor (String nome, double salario, int ações) {
        super(nome, salario);
        this.ações = ações;
    }

    public int getAções() {
        return ações;
    }

    public void setAções(int ações) {
        this.ações = ações;
    }

    public void detalhes(){
        System.out.println("O nome do Diretora é " + nome);
        System.out.println("O salario do Diretor é de R$" + salario);
        System.out.println("O diretor tem " + ações + " ações nessa empresa");
    }
}
