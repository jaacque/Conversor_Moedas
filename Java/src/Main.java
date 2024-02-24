import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);
        int option = 0;

        while (option != 5) {
            System.out.println("\nMenu de opções:");
            System.out.println("1 - Dolar para Real \n" +
                    "2 - Real para Dolar \n" +
                    "3 - Euro para Real \n" +
                    "4 - Real para Euro \n" +
                    "5 - Sair\n");

            System.out.println("Informe a opção: ");
            option = read.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Informe o valor em dolar: ");
                    converterToReal(read.nextDouble(), 4.94);
                    break;
                case 2:
                    System.out.println("Informe o valor em real: ");
                    System.out.printf("O valor convertido para real é de US$%.2f", converterFromReal(read.nextDouble(), 4.94));
                    break;
                case 3:
                    System.out.println("Informe o valor em euro: ");
                    converterToReal(read.nextDouble(), 5.34);
                    break;
                case 4:
                    System.out.println("Informe o valor em real: ");
                    System.out.printf("O valor convertido para real é de €%.2f", converterFromReal(read.nextDouble(), 5.34));
                    break;
                case 5:
                    System.out.println("*****************\n" +
                            "Sessão finalizada." +
                            "\n*****************");
                    break;
                default:
                    System.out.println("\nOpção inválida." +
                            "\nTente novamente!");
            }
        }
    }

    private static void converterToReal(double op, double currency){
        double convertion = op * currency;
        System.out.printf("O valor convertido para real é de R$%.2f", convertion);
    }

    private static double converterFromReal(double op, double currency){
        return op / currency;
    }
}