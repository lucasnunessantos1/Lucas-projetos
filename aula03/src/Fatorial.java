import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        /*Fatorial de um número: 5! = 5 * 4 * 3 * 2 * 1
         *                        4! = 4 * 3 * 2 * 1
         * */


        int fatorial = 1;
        System.out.println("Digite um valor para calcular o fatorial: ");
        int numero = leitor.nextInt();
        for(int i = numero; i > 1; i--){ //i: 4 - 3 - 2 - 1
            fatorial = i * fatorial; //fatorial: 4 - 12 - 24
        }
        System.out.println(numero + "! = " + fatorial);

    }
}
