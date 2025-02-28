import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de horas trabalhadas no mês: ");
        int horasTrabalhadas = scanner.nextInt();

        System.out.print("Digite o salário por hora: ");
        double salarioHora = scanner.nextDouble();

        int jornadaMensal = 40 * 4;
        double salarioTotal;

        if (horasTrabalhadas > jornadaMensal) {
            int horasExtras = horasTrabalhadas - jornadaMensal;
            salarioTotal = (jornadaMensal * salarioHora) + (horasExtras * salarioHora * 1.5);
        } else {
            salarioTotal = horasTrabalhadas * salarioHora;
        }

        System.out.println("Salário total: " + salarioTotal);

        scanner.close();
    }
}