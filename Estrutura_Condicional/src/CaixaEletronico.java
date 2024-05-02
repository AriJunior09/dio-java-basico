public class CaixaEletronico {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 10.0;

        if(valorSolicitado < saldo){
            saldo -= valorSolicitado;
            System.out.printf("Saque realizado no valor de: R$ %.2f%n", valorSolicitado);
        }
        else{
            System.out.println("Saldo insuficiente!");
        }

        System.out.printf("Seu saldo é: R$ %.2f ", saldo);
        
    }
}
