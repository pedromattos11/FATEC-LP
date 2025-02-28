import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();

        double celsius = (fahrenheit - 32) * 5 / 9;

        System.out.println("Temperatura em Celsius: " + celsius);

        scanner.close();
    }
}