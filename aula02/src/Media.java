import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        /*Tirar a média de um aluno e exibir a situação aprovado ou reprovado
         * para ser aprovado => media >= 7 frequencia >= 75*/

        double n1, n2, frequencia;
        System.out.println("Digite a nota 1: ");
        n1 = leitor.nextDouble();
        System.out.println("Digite a nota 2: ");
        n2 = leitor.nextDouble();
        System.out.println("Digite a frequencia: ");
        frequencia = leitor.nextDouble();
        double media = (n1 + n2) /2;

        if (media >= 7 && frequencia >= 75) {
            System.out.println("Aluno aprovado na matéria");
        }
        else {
            System.out.println("Aluno reprovado na matéria");
        }



    }
}
