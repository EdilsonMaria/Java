public class Moto extends Veiculo{
    private int cilindrada;

    public Moto (String marca, String modelo, int anoFabricacao, int cilindrada) {
        super(marca, modelo, anoFabricacao);
        this.cilindrada = cilindrada;
    }

    public void imprimir_detalhes_moto(){
        System.out.println("A marca da moto é" + marca);
        System.out.println("O modelo da moto é " + modelo);
        System.out.println("O Ano de fabricação da moto é " + anoFabricacao);
        System.out.println("A cilindrade da moto é " + cilindrada);
    }

}
