import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de maçãs compradas: ");
        int quant = scanner.nextInt();

        double preco = quant < 12 ? 1.30 : 1.00;
        double custoTotal = quant * preco;

        System.out.println("Custo total: R$ " + custoTotal);

        scanner.close();
    }
}