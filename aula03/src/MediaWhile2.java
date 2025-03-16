import java.util.Scanner;

public class MediaWhile2 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        double somaAlturas=0.0, media;
        int contador = 1; //inicialização

        System.out.println("Quantos alunos estão matriculados na turma? ");
        int qntAlunos = leitor.nextInt();
        while (contador <= qntAlunos) { //condição -> repetir o trecho enquanto for verdadeiro
            System.out.println("Digite a altura do " + contador + " aluno");
            somaAlturas = somaAlturas + leitor.nextDouble();
            contador++; //contador = contador + 1;


        }

        media = somaAlturas/6;
        System.out.println("A media de altura dos alunos é de " + media);
        leitor.close();
    }
}
