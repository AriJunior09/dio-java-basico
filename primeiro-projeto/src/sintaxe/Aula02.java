package sintaxe;
import java.util.Scanner;

public class Aula02{
    public static void main(String[] args){
      /*int idadeAri = 32;
      int idadeRute = 30;
      verificarMaisVelho(idadeAri, idadeRute);*/
      Scanner sc = new Scanner(System.in);
      System.out.print("Digite uma palavra: ");
      String palavra = sc.nextLine();

      contarLetras(palavra);


      sc.close();
    }

    static int contarLetras(String palavra){
      System.out.println("A palavra tem: " + palavra.length() + " letras");
      return 0;
    }

    /*static void verificarMaisVelho(int idade1, int idade2){
      if(idade1 > idade2){
        System.out.printf(" %d é mais velho!", idade1);
      }else if(idade1 == idade2){
        System.out.printf("Ambas tem a mesda idade! ");
      }else{
        System.out.printf(" %d é mais velho!", idade2);
      }
    }*/

    

}