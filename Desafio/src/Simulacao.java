import java.util.Scanner;

public class Simulacao {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double saldo = 0;

        int opcao;
        do {
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    double deposito = sc.nextDouble();
                    saldo += deposito;
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 2:
                    double saque = sc.nextDouble();
                    if (saque > saldo) {
                        System.out.println("Saldo insuficiente");
                    }else{
                        saldo -= saque;
                        System.out.println("Saldo atual: " + saldo);
                    }
                    break;
                case 3:
                    System.out.println("Saldo atual: " + saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

    }
}
