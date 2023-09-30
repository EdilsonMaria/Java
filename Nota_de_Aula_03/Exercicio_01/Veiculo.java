public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int anoFabricacao;
    //public Veiculo(){

    //} Construtor pai vazio caso o Usurio fosse imputar pelo teclado as informações dos veiculos
    public Veiculo(String marca, String modelo, int anoFabricacao) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
    }

}