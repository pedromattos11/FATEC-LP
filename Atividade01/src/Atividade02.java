import java.util.Scanner;

public class Atividade02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Digite o número total de eleitores: ");
        int totalEleitores = scanner.nextInt();

        System.out.print("Digite o número de votos brancos: ");
        int votosBrancos = scanner.nextInt();

        System.out.print("Digite o número de votos nulos: ");
        int votosNulos = scanner.nextInt();

        System.out.print("Digite o número de votos válidos: ");
        int votosValidos = scanner.nextInt();

        // Verifica se os votos somam o total de eleitores
        int somaVotos = votosBrancos + votosNulos + votosValidos;
        if (somaVotos != totalEleitores) { // SE SOMA DE VOTOS FOR DIFERENTE DE TOTAL DE ELEITORES
            System.out.println("Erro: A soma dos votos não corresponde ao total de eleitores!");
        } else {
            // Cálculo dos percentuais
            double percentualBrancos = (votosBrancos * 100.0) / totalEleitores;
            double percentualNulos = (votosNulos * 100.0) / totalEleitores;
            double percentualValidos = (votosValidos * 100.0) / totalEleitores;

            // Exibir resultados
            System.out.println("\nResultados:");
            System.out.printf("Percentual de votos brancos: %.2f%%\n", percentualBrancos);
            System.out.printf("Percentual de votos nulos: %.2f%%\n", percentualNulos);
            System.out.printf("Percentual de votos válidos: %.2f%%\n", percentualValidos);
        }

        scanner.close();
    }
}