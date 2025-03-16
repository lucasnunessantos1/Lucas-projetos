import java.util.Scanner;

public class DecisaoCompleta {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int idade;
        System.out.println("Digite a sua idade ");
        idade = leitor.nextInt();

        if (idade >=18) {
            System.out.println("Maior de idade!");

        } else{
            System.out.println("Menor de idade!");

        }


    }
}
