import java.util.Scanner;

public class Atividade10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da 1a. avaliação: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Digite a nota da 2a. avaliação: ");
        double nota2 = scanner.nextDouble();

        double media = (nota1 + nota2) / 2;

        if (media >= 6) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        System.out.println("Média: " + media);

        scanner.close();
    }
}