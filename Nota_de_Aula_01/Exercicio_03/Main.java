import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Calculadora cal = new Calculadora ();
        System.out.println("Escolha a operação: \n 1 - Soma; \n 2 - Subtração \n 3 - Divisão;  \n 4 - Multiplicação; \n 0 - Sair ");
        int r;
        do {
            int x = sc.nextInt();

            System.out.print("Digite o primeiro número: ");
            double numero1 = sc.nextDouble();
            System.out.print("Digite o segundo número: ");
            double numero2 = sc.nextDouble();

            double resultado = 0;
            switch (x) {

                case 1:
                    resultado = cal.somar(numero1, numero2);
                    System.out.println("Resultado:" + resultado);
                    break;
                case 2:
                    resultado = cal.subtrair(numero1, numero2);
                    System.out.println("Resultado:" + resultado);
                    break;
                case 3:
                    resultado = cal.dividir(numero1, numero2);
                    System.out.println("Resultado:" + resultado);
                    break;
                case 4:
                    resultado = cal.multiplicar(numero1, numero2);
                    System.out.println("Resultado:" + resultado);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println("Para ver novamente, digite 0");
            r = sc.nextInt();
        }while (r == 0) ;

    }

}
