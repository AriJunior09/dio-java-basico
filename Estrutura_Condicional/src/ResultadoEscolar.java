import java.util.Scanner;

public class ResultadoEscolar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Digite a primeira nota: ");
        int nota1 = sc.nextInt();
        System.out.print("Digite a segunda nota: ");
        int nota2 = sc.nextInt();
        double media = (nota1 + nota2) / 2;
        System.out.printf("A sua média é: %.2f%n", media);

        if(media >= 7)
        System.out.println("Aprovado");

        else
        System.out.println("Reprovado!");

        sc.close();
        
    }
    
}
