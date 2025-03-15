import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n1, n2, resultado;
        System.out.println("Digite o primeiro numero: ");
        n1 = leitor.nextInt();
        System.out.println("Digite o segundo numero: ");
        n2 = leitor.nextInt();
        resultado = n1 + n2;
        System.out.println("A soma é de: " + resultado + "!");

        int subtracao = n1 - n2;
        System.out.println("A subtração é de: " + subtracao + "!");

       double res = (double) n1 / n2;
        System.out.println("A divisão é de: " + res + "!");

        resultado = n1 % n2;
        System.out.println("o resto da divisão é de: " + resultado + "!");



    }
}
