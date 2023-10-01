public class Carro {
    protected String marca;
    protected String modelo;

    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    public void Mostrar_detalhe (){
        System.out.println("A marca do veiculo é " + marca);
        System.out.println("O modelo do veiculo é " + modelo);
    }
}
