import java.util.Scanner;

public class MediaFor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        double somaAlturas=0.0, media;
        int contador; //inicialização

        for (contador = 1; contador <= 6; contador++) { //condição -> repetir o trecho enquanto for verdadeiro
            System.out.println("Digite a altura do " + contador + " aluno");
            somaAlturas = somaAlturas + leitor.nextDouble();

        }

        media = somaAlturas/6;
        System.out.println("A media de altura dos alunos é de " + media);
        leitor.close();

    }
}
