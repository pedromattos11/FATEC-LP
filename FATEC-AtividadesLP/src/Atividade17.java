import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da P1: ");
        double P1 = scanner.nextDouble();

        System.out.print("Digite a nota da E1: ");
        double E1 = scanner.nextDouble();

        System.out.print("Digite a nota da E2: ");
        double E2 = scanner.nextDouble();

        System.out.print("Digite a nota da API: ");
        double API = scanner.nextDouble();

        System.out.print("Digite a nota de X: ");
        double X = scanner.nextDouble();

        System.out.print("Digite a nota de SUB: ");
        double SUB = scanner.nextDouble();

        double partial1 = P1 * 0.6 + ((E1 + E2) / 2.0) * 0.4;

        double stepNumerator = Math.max(partial1 - 5.9, 0);
        double stepDenominator = partial1 - 5.9;
        double stepFactor = (stepDenominator != 0) ? (stepNumerator / stepDenominator) : 0;

        double stepValue = stepFactor * (API * 0.5);

        double mediaLP1 = (partial1 * 0.5) + stepValue + X + (SUB * 0.3);

        System.out.println("Média de LP1: " + mediaLP1);

        scanner.close();
    }
}