import java.util.Scanner;
public class main {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Produto p = new Produto();


    int sair;
    do {
        System.out.println("Dados para cadastrar o codigo de um produto:");

        System.out.println("Digite o codigo:");
        p.setCodigo(sc.nextInt());
        System.out.println("Digite o nome:");
        p.setNome(sc2.nextLine());
        System.out.println("Digite a quantidade:");
        p.setQuantidade(sc.nextInt());

        System.out.println(p.getCodigo());


        p.vender(qtde);

        p.getQuantidade();

    System.out.println("Digite 0 para repetir: ");
    sair = sc.nextInt();

    //System.out.println("Todos os produtos foram inseridos com sucesso, desejar realizar uma venda?: ");
    } while (sair == 0);
    System.out.println("Programa Encerrado");










    }
}
