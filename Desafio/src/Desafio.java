import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o valor do Salário: R$ ");
        double valorSalario = sc.nextDouble();
        System.out.print("Digite o valor do Beneficio: R$ ");
        double valorBeneficio = sc.nextDouble();

        double valorImposto = 0;
        if(valorSalario >= 0 && valorSalario <= 1100){
            valorImposto = 0.05 * valorSalario;
        } else if(valorSalario >= 1100.01 && valorSalario <= 2500){
            valorImposto = 0.10 * valorSalario;
        } else{
            valorImposto = 0.15 * valorSalario;
        }

        double saida = valorSalario - valorImposto + valorBeneficio;
        System.out.println(String.format("%.2f", saida));
        
        sc.close();
    }
}
