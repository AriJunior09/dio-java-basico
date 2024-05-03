public class Exemplo_forArray {
    public static void main(String[] args) {
        String alunos[] = {"Ari", "Jonas", "Julia", "Marcos", "Felipe"}; // Em arrays o indice inicia em ZERO

        for (int x=0; x<alunos.length; x++){
            System.out.println("O Aluno no indice x="+ x + " é: " + alunos[x]);
        }
    }
    
}
