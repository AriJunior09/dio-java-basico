import java.util.Scanner;

public class SimulacaoBancaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;

        int opcao;
        do {
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Consultar saldo");
            System.out.println("0 - Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor do Depósito: R$ ");
                    double deposito = scanner.nextDouble();
                    saldo += deposito;
                    break;
                case 2:
                    System.out.print("Digite o valor do Saque: R$ ");
                    double saque = scanner.nextDouble();
                    while (saque > saldo) {
                        System.out.println("Saldo insuficiente, escolha um valor menor!");
                        System.out.print("Digite um valor de saque válido: R$ ");
                        saque = scanner.nextDouble();
                    }
                    saldo -= saque;
                    System.out.println("Saque realizado!");
                    break;

                case 3:
                    System.out.println("Consultando o seu saldo");
                    System.out.println("Saldo atual: R$ " + saldo);
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

    }
}
