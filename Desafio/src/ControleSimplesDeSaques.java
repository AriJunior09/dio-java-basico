import java.util.Scanner;

public class ControleSimplesDeSaques {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double limiteDiario = scanner.nextDouble();
        
        // Loop for para iterar sobre os saques:
        for (double i = 0; ; i++) {
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
