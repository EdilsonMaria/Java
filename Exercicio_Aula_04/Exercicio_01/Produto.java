public class Produto {
    private int codigo;
    private String  nome;
    private int quantidade;

    public void setCodigo(int codigodigitado) {
        this.codigo = codigodigitado;
    }
    public int getCodigo() {
        return codigo;
    }
    //
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    //
    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    public int getQuantidade() {
        return quantidade;
    }


    public void vender(int qtde){
        quantidade = quantidade-qtde;

    }

}
