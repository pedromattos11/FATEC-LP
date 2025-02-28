import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de carros vendidos: ");
        int carrosVendidos = scanner.nextInt();

        System.out.print("Digite o valor total das vendas: ");
        double totalVendas = scanner.nextDouble();

        System.out.print("Digite o salário fixo: ");
        double salarioFixo = scanner.nextDouble();

        System.out.print("Digite o valor por carro vendido: ");
        double valorCarro = scanner.nextDouble();

        double salarioFinal = salarioFixo + (carrosVendidos * valorCarro) + (totalVendas * 0.05);

        System.out.println("Salário final: " + salarioFinal);

        scanner.close();
    }
}