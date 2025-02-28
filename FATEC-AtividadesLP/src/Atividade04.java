import java.util.Scanner;

    public class Atividade04 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o custo de fábrica do carro: ");
            double custoFabrica = scanner.nextDouble();

            double custoFinal = custoFabrica * 1.73;

            System.out.println("Custo final ao consumidor: " + custoFinal);

            scanner.close();
        }
    }