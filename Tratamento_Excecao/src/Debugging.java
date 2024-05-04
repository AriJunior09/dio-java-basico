import java.util.Scanner;

public class Debugging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] alunos = { "Camila", "Lucas", "Bruna", "Pedro" };

        double media = calcularMediaDaTurma(alunos, sc);

        System.out.printf("Media da turma %.1f", media);

    }

    static double calcularMediaDaTurma(String[] alunos, Scanner scanner) {
        double soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do aluno %s: ", aluno);
            double nota = scanner.nextDouble();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
