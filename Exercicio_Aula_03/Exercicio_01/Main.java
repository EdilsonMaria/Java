//Elabore um programa de uma idustriaque realiza a folha mensal de pagamentos
//de seus funcionarios baseando nas seguintes regras:


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        Funcionario fun = new Funcionario ();

        int sair;
        do {

            System.out.println("Dados do funcionario:");

            System.out.println("Matricula:");
            fun.Matricula = sc.nextInt();

            sc.nextLine(); //Limpando o Buffet

            System.out.println("Nome:");
            fun.Nome = sc.nextLine();

            System.out.println("Salario bruto:");
            fun.Salario_bruto = sc1.nextDouble();

            sc1.nextLine();

            fun.calc_inss();
            fun.cal_liquido();
            System.out.println("Matricula:" + fun.Matricula);
            System.out.println("Nome Completo:" + fun.Nome);
            System.out.println("Salario Bruto:" + fun.Salario_bruto);
            System.out.println("Dedução do INSS:" + fun.descontoINSS);
            System.out.println("Salario liquido:" + fun.salarioLiquido);

            System.out.println("Digite 0 para repetir: ");
            sair = sc.nextInt();

        } while (sair == 0);
        System.out.println("Programa Encerrado");

    }
}