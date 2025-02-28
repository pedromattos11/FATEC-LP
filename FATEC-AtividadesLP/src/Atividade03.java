import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        double percBrancos = (votosBrancos * 100.0) / totalEleitores;
        double percNulos = (votosNulos * 100.0) / totalEleitores;
        double percValidos = (votosValidos * 100.0) / totalEleitores;

        System.out.println("Percentual de votos brancos: " + percBrancos + "%");
        System.out.println("Percentual de votos nulos: " + percNulos + "%");
        System.out.println("Percentual de votos válidos: " + percValidos + "%");

        scanner.close();
    }
}