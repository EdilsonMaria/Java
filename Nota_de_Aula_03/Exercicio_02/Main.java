public class Main {
    public static void main (String[] args) {
        Gerente ger = new Gerente("Edilson", 5000, "Engenharia", 5500);
        Diretor dir = new Diretor("Nayara", 20000, 500);


        ger.detalhes();
        System.out.println("----*----");
        dir.detalhes();

    }
}