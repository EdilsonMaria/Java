public class Carro extends Veiculo{
    private int numPortas;

    //public Carro(){

    //} Construtor filho vazio caso o Usurio fosse imputar pelo teclado as informações dos veiculos
    public Carro (String marca, String modelo, int anoFabricacao, int numPortas) {
        super(marca, modelo, anoFabricacao);
        this.numPortas = numPortas;
    }

    public void imprimir_detalhes_carro(){
        System.out.println("A marca do veiculo é" + marca);
        System.out.println("O modelo do veiculo é " + modelo);
        System.out.println("O Ano de fabricação do veiculo é " + anoFabricacao);
        System.out.println("O numero de portas do veiculo é " + numPortas);
    }
}
