import java.util.concurrent.ThreadLocalRandom;;
public class Exemplo_while {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            Double valorDoce = valorAleatorio(); // Pegar um doce com um valor aleatorio
            if(valorDoce > mesada){ // Se o valor do doce for igual o da mesada, o valor do doce ficara igual o da mesada, só regra de negocio para não ter valor negativo.
                valorDoce = mesada;
            }
            System.out.printf("Doce no valor de R$ %.2f adicionado no carrinho!%n", valorDoce);
                mesada -= valorDoce;
            
            
        }
        System.out.println("Mesada: " + mesada);
        System.out.println("João gastou toda a mesada!");
    }

    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }
    
}
