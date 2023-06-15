import java.util.Scanner;
public class MainQuiz { // Main que executa o quiz

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String nick;
		String continuar = "Sim";
		int recorde = -1000;
		
		System.out.println("------------------------------------------------------------------");
		System.out.println("Iniciando o Quiz...");
		System.out.println("------------------------------------------------------------------");
		System.out.println("Digite o nick do primeiro jogador...");
		nick = scanner.nextLine(); // Recebe o nick do primeiro jogador
		Player J1 = new Player(nick);
		System.out.println("Digite o nick do segundo jogador...");
		nick = scanner.nextLine(); // Recebe o nick do segundo jogador
		Player J2 = new Player(nick);
		Quiz q1 = new Quiz();

		do {
			System.out.println("------------------------------------------------------------------");
			System.out.println("Sobre o jogo..."); // Explicação sobre o jogo
			System.out.println("As perguntas fáceis valem 40 pontos, as médias 60 pontos e as difícies 100 pontos...");
			System.out.println("Cada pergunta errada você perde 10 pontos...");
			q1.perguntaFacil1(J1); 
			q1.perguntaFacil2(J2);
			q1.perguntaFacil3(J1);
			q1.perguntaFacil4(J2); // São feitas as perguntas alternando os turnos
			q1.perguntaMedia1(J1);
			q1.perguntaMedia2(J2);
			q1.perguntaMedia3(J1);
			q1.perguntaMedia4(J2);
			q1.perguntaDificil1(J1);
			q1.perguntaDificil2(J2);
			if(J1.getPontos()>recorde) { // Anota o recorde atual
				recorde = J1.getPontos();
			} else if(J2.getPontos()>recorde) { 
				recorde = J2.getPontos();
			}
			q1.resultadoFinal(J1, J2);
			continuar = scanner.nextLine(); // Recebe a resposta se o jogador deseja continuar
		} while(continuar.equalsIgnoreCase("Sim")); 
		
		System.out.println("O maior recorde desse jogo foi de " + recorde + "pontos!!!"); // Exibe o maior recorde
		System.out.println("Finalizando o jogo....");
		scanner.close();
}}
