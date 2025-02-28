import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        if (valor < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Positivo");
        }

        scanner.close();
    }
}