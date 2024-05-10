package metodos;

public class Aula01 {
    public static void main(String[] args) {
        double salarioInicial = 1412.00;
        double taxa = 0.08;
        double bonus = 735.00;
        double descontos = 124.00;

        System.out.printf("O salario inicial é: %.2f \n", salarioInicial);
        System.out.printf("O total de desconto do INSS é: R$ %.2f \n ", calcularInss(salarioInicial, taxa));
        System.out.printf("O total do salario com os bonus é: R$ %.2f \n ", calcularBonusMenosTaxa(salarioInicial, bonus, taxa));
        System.out.printf("O salario Final é: %.2f \n", calcularFinal(salarioInicial, descontos, bonus, taxa));
    }

    public static double calcularInss(double salarioInicial, double taxa){
        return salarioInicial * taxa;
    }

    public static double calcularBonusMenosTaxa(double salarioInicial, double bonus, double taxa){
        return salarioInicial + bonus - calcularInss(salarioInicial, taxa);
    }

    public static double calcularFinal(double salarioInicial, double desconto, double bonus, double taxa){
        return calcularBonusMenosTaxa(salarioInicial, bonus, taxa) - desconto;
    }
    
}




