public class Produto {
    private int codigo;
    private String  nome;
    private int quantidade;
    private int qtd_venda;
    private int qtd_final;

    public void setcodigo(int codigo) {
        this.codigo = codigo;
    }
    public int getcodigo() {
        return codigo;
    }
    //
    public void setnome(String nome) {
        this.nome = nome;
    }
    public String getnome() {
        return nome;
    }
    //
    public void setquantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getquantidade() {
        return quantidade;
    }

    public void setqtd_venda(int qtd_venda) {this.qtd_venda = qtd_venda;}
    public  int getqtd_venda() { return  qtd_venda;}
    public void setqtd_final(int qtd_final) {this.qtd_final = qtd_final;}
    public  int getqtd_final() { qtd_final =  quantidade - qtd_venda;
        return qtd_final;}

}