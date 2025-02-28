public class Atividade16 {
    public static void main(String[] args) {
        double gastoJaneiro = 15000;
        double gastoFevereiro = 23000;
        double gastoMarco = 17000;

        double total = gastoJaneiro + gastoFevereiro + gastoMarco;
        double media = total / 3;

        System.out.println("Despesa total no trimestre: " + total);
        System.out.println("Média mensal de gastos: " + media);
    }
}