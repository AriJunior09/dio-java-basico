package Operadores;

public class Aula03 {
    public static void main(String[] args){
        boolean condicao01 = true;
        boolean condicao02 = true;

        if(condicao01 && condicao02){
            System.out.println("Verdadeira nas duas!");
        }
        if(condicao01 || condicao02){
            System.out.println("Uma das condições é Verdadeira!");
        }
        if(!condicao01 && !condicao02){
            System.out.println("Falsa nas duas");
        }
    }
}
