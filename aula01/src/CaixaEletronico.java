import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);


        int quantia;
        int notaDe50, notaDe20, notaDe10;

        System.out.println("Digite o valor do saque:R$ ");
        quantia = leitor.nextInt();
        notaDe50 = quantia / 50;
        quantia = quantia % 50;
        notaDe20 = quantia / 20;
        quantia = quantia % 20;
        notaDe10 = quantia / 10;

        System.out.printf("\n%d notas de R$ 50", notaDe50);
        System.out.printf("\n%d notas de R$ 20", notaDe20);
        System.out.printf("\n%d notas de R$ 10", notaDe10);




    }
}
