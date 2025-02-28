import java.util.Scanner;

public class Atividade14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora de início: ");
        int inicio = scanner.nextInt();

        System.out.print("Digite a hora de fim: ");
        int fim = scanner.nextInt();

        int duracao = fim <= inicio ? (24 - inicio) + fim : fim - inicio;

        System.out.println("Duração do jogo: " + duracao + " horas");

        scanner.close();
    }
}