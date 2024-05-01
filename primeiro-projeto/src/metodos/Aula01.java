package metodos;

public class Aula01 {
    public static void main(String[] args) {

            // Chamando o método saudacao
            saudacao();
    
            // Chamando o método saudacaoPersonalizada com um argumento
            saudacaoPersonalizada("João");
    
            // Chamando o método soma e armazenando o resultado em uma variável
            int resultado = soma(5, 3);
            System.out.println("A soma é: " + resultado);
        
    }
    // Método que recebe um parâmetro do tipo String e não retorna nenhum valor
    public static void saudacao() {
            System.out.println("Olá, mundo!");
    }
    
    // Método que recebe um parâmetro do tipo String e não retorna nenhum valor
    public static void saudacaoPersonalizada(String nome) {
            System.out.println("Olá, " + nome + "!");
    }
    
    // Método que recebe dois parâmetros inteiros e retorna a soma deles
    public static int soma(int a, int b) {
            return a + b;
    }
        
}
