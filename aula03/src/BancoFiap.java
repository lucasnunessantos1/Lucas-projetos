import java.util.Scanner;

public class BancoFiap {
    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
       int opcao;
       double saldo = 0, valor;

        do {
            System.out.println("Bem vindo ao Banco FIAP");
            System.out.println("\nOperações disponíveis neste caixa:" + "\n\n1 - Depósito\t\t2 - Saque" +
                    "\n3 - Consultar Saldo\t4 - Sair");
            System.out.println("Opção: ");
            opcao = leitor.nextInt();
            switch (opcao) {
                case 1 -> {
                    System.out.println("Deposito");
                    System.out.println("Informe o valor a ser depositado R$ ");
                    valor = leitor.nextDouble();
                    saldo += valor;
                }
                case 2 -> {
                    System.out.println("Saque");
                    System.out.println("Informe o valor a ser sacado R$ ");
                    valor = leitor.nextDouble();
                    saldo -= valor;
                }
                case 3 -> {
                    System.out.println("Saldo = R$" + saldo);
                }
                case 4 -> {
                    System.out.println("Obrigada por utilizar o nosso banco!");
                }
                default -> System.out.println("Opção inválida");
            }
        }
        while (opcao != 4);

    }
}
