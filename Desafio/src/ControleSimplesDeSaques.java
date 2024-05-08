import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha quanto deseja reservar para limite diário: ");
        double limiteDiario = scanner.nextDouble();
        
        // Loop for para iterar sobre os saques:
        for (double i = 0; ; i++) {
            System.out.println("Digite o valor do saque: ");
            double saque = scanner.nextDouble();
            
            if (saque == 0) {
                System.out.println("Transacoes encerradas.");
                break;
            } else if (saque > limiteDiario) {
                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                break;
            } else {
                System.out.println("Saque realizado. Limite restante: " + (limiteDiario - saque));
            }
        }

        scanner.close();
    }
}
