import java.util.Scanner;

public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Leia a entrada do usuário como uma string representando o número da conta:
            System.out.print("Digite o número da conta: ");
            String numero = scanner.next();

            // Crie uma instância da classe para chamar o método verificarNumeroConta:
            VerificadorNumeroConta verificador = new VerificadorNumeroConta();
            verificador.verificarNumeroConta(numero);

            // Imprime que o número de conta é válido:
            System.out.println("Numero de conta valido.");
        } catch (IllegalArgumentException e) {
            // Aqui é impressa uma mensagem de erro, mostrando a mensagem associada à exceção:
            System.out.println("Erro: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private void verificarNumeroConta(String numeroConta) {
        // Verifique se o número da conta tem exatamente 8 dígitos:
        if (numeroConta.length() != 8) {
            // Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:
            throw new IllegalArgumentException("Numero de conta invalido. Digite exatamente 8 digitos.");
        }
    }
}
