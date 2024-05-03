import java.util.Random;
public class Exemplo_doWhile {
    public static void main(String[] args) {
        
    }

    public static boolean tocando(){
        boolean atendeu = new Random().nextInt(3)==1;
        System.out.println("Atendeu? " + atendeu);
        // Negando o ato de continuar tocando
        return  ! atendeu;
    }
}
