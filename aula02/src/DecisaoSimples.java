import java.util.Scanner;

public class DecisaoSimples {
    public static void main(String[] args) {
       Scanner leitor = new Scanner(System.in);


        System.out.println("Aula 02 - Decisão simples");
        System.out.println("Digite sua idade: ");
        int idade = leitor.nextInt();

        if(idade >= 18) {
            System.out.println("Pode tirar a habilitação");
            System.out.println("O voto é obrigatório!");
        }
        //Processamento = cálculo e atribuições (=)
    }
}