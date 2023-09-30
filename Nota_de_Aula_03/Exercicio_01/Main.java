public class Main {
    public static void main (String[] args) {
        Carro car = new Carro("Fiat", "Uno", 2023, 5);
        Moto mot = new Moto("Honda", "CG125", 2023, 125);

        //Carro car2 = new Carro(); Estanciando um construtor vazio caso o usuario fosse umputar as informações


        car.imprimir_detalhes_carro();
        System.out.println("----*----");
        mot.imprimir_detalhes_moto();
    }
}
