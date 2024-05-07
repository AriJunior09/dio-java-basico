package candidatura;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
	public static void main(String[] args) {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO"};
		for(String candidato: candidatos) {
			entrandoEmContato(candidato);
		}
	}
	static void entrandoEmContato(String candidato) {
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu = false;
		do {
			atendeu = atender();
			continuarTentando = !atendeu;
			if(continuarTentando) {
				tentativasRealizadas++;
			}else {
				System.out.println("Contato realizado com sucesso!");
			}
		}while(continuarTentando && tentativasRealizadas < 3);
		if(atendeu) {
			System.out.printf("Conseguimos contato com %s após %d Tentativa(s)%n", candidato, tentativasRealizadas);
		}else {
			System.out.printf("Não conseguimos contato com o %s %n", candidato);
		}
	}
	static boolean atender() {
		return new Random().nextInt(3)==1;
	}

	static void imprimirSelecionados() {
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
		System.out.println("Imprimindo a lista de candidatos informando o indice do elemento");

		for(int indice=0; indice < candidatos.length; indice++) {
			System.out.printf("O Candidato de n° %d é: %s %n", indice+1, candidatos[indice]);

		}
		System.out.println("Forma Abreviada usando o for each:");
		for(String candidato: candidatos) {
			System.out.printf("O Candidato selecionado foi: %s %n", candidato);
		}
	}
	static void selecaoCandidatos() {
		// Array com lista de candidatos
		String [] candidatos = {"FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA", "JORGE"};
		int candidatosSelecionados = 0;
		int candidatoAtual = 0;
		double salarioBase = 2000.0;
		while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
			String candidato = candidatos[candidatoAtual];
			double salarioPretendido = valorPretendido();
			System.out.printf("O Candidato %s solicitou esse salário: R$ %.2f%n", candidato, salarioPretendido);
			if(salarioBase >= salarioPretendido) {
				System.out.printf("O Candidato %s foi selecionado para a vaga! %n", candidato);
				candidatosSelecionados++;
			}
			candidatoAtual++;
		}
	}
	static double valorPretendido() {
		return ThreadLocalRandom.current().nextDouble(1800, 2200);
	}
	static void analisarCandidato(double salarioPretendido) {
		double salarioBase = 2000.0;
		if(salarioBase > salarioPretendido) {
			System.out.println("Ligar para o Candidato");
		}else if(salarioBase == salarioPretendido) {
			System.out.println("Ligar para o Candidato com a contra proposta");
		}else {
			System.out.println("Aguardando resultado demais Candidatos");
		}
	}

}
