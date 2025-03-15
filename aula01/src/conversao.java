import java.util.Scanner;

public class conversao {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);

    double doacaoEmDolar;

        System.out.println("Digite o valor da doação em dólar: ");
        doacaoEmDolar = leitor.nextDouble();

    double doacaoEmReais = doacaoEmDolar * 5.98;
        System.out.println("O Valor da doação em reais é de R$: " + doacaoEmReais + "\nObrigado pela doação");




    }
}
