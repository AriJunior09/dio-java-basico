import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        // TODO: Conhecer e importar a classe Scanner

        // Exibir as mensagens para o nosso usuário

        // Obter pela scanner os valores digitados no terminal

        // Exibir a mensagem conta criada

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o número da conta: ");
         int numero = sc.nextInt();

         System.out.print("Digite o nome da agência: ");
         String agencia = sc.next();

         System.out.print("Digite o nome do cliente: ");
         String nomeCliente = sc.next();

         System.out.print("Digite o saldo da Conta: ");
         double saldo = sc.nextDouble();



         System.out.printf("Olá %s, a sua conta %d do Banco %s está disponível e com saldo de %.2f", nomeCliente, numero, agencia, saldo);

    } 
    
}
