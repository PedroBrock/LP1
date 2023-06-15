import java.util.Scanner;

public class Quiz { // Aqui ficam as perguntas e o tratamento das respostas
					// Além do método resultadoFinal que imprime o vencendor
	
	Scanner scanner = new Scanner(System.in);
	
	public void resultadoFinal(Player jogador1, Player jogador2){
		System.out.println("------------------------------------------------------------------");
		System.out.println("Jogador " + jogador1.getNickname() + " teve pontuação de " + jogador1.getPontos() + " pontos!");
		System.out.println("Jogador " + jogador2.getNickname() + " teve pontuação de " + jogador2.getPontos() + " pontos!");
		if(jogador1.getPontos()>jogador2.getPontos()) {
			System.out.println("Jogador " + jogador1.getNickname() + " foi o vencedor!!!");
		}else if(jogador2.getPontos()>jogador1.getPontos()){
			System.out.println("Jogador " + jogador2.getNickname() + " foi o vencedor!!!");
		}else {
			System.out.println("Jogadores terminaram empatados com " + jogador1.getPontos() + " pontos!");
		}
		System.out.println("Deseja jogar novamente? (Sim - para continuar)");
		System.out.println("------------------------------------------------------------------");
		jogador1.setPontos(0);
		jogador2.setPontos(0);
	}
	
	public void perguntaFacil1(Player jogador) {
		System.out.println("------------------------------------------------------------------");
		System.out.println("Vez do Jogador " + jogador.getNickname() +  " (Pergunta nível fácil)");
		System.out.println("Como fazer comentários em Java?");
		System.out.println("[1] /*");
		System.out.println("[2] */");
		System.out.println("[3] \\");
		System.out.println("[4] #");
		System.out.println("[5] //");
		System.out.println("Digite sua resposta: ");
		System.out.println("Para soliticar uma dica digite dica (ganha metade dos pontos)");
		System.out.println("------------------------------------------------------------------\n");
		String resposta = scanner.nextLine();
		if (resposta.equals("5")) {
			System.out.println("Resposta correta, ganhou 40 pontos!\n");
			jogador.aumentarPontos(40);
		}else if(resposta.equals("1")|resposta.equals("2")|resposta.equals("3")|resposta.equals("4")){
			System.out.println("Resposta errada, perdeu 10 pontos!\n");
			jogador.diminuirPontos(10);
			} else if(resposta.equalsIgnoreCase("dica")) {
			 System.out.println("As alternativas 2 e 4 estão erradas");
			 System.out.println("Digite sua resposta: ");
			 String novaResposta = scanner.nextLine();
			 if(novaResposta.equals("5")) {
				 System.out.println("Resposta correta, ganhou 20 pontos!\n");
					jogador.aumentarPontos(20);
				}else if(novaResposta.equals("1")|novaResposta.equals("2")|novaResposta.equals("3")|novaResposta.equals("4")){
					System.out.println("Resposta errada, perdeu 10 pontos!\n");
					jogador.diminuirPontos(10);
					} else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
			 }else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
		}
	public void perguntaFacil2(Player jogador) {
		System.out.println("------------------------------------------------------------------");
		System.out.println("Vez do Jogador " + jogador.getNickname() + "(Pergunta nível fácil)");
		System.out.println("Qual método é usado para saber o tamanho de uma string?");
		System.out.println("[1] length()");
		System.out.println("[2] getSize()");
		System.out.println("[3] len()");
		System.out.println("[4] getLength()");
		System.out.println("[5] size()");
		System.out.println("Digite sua resposta: ");
		System.out.println("Para soliticar uma dica digite dica (ganha metade dos pontos)");
		System.out.println("------------------------------------------------------------------\n");
		String resposta = scanner.nextLine();
		if (resposta.equals("1")) {
			System.out.println("Resposta correta, ganhou 40 pontos!\n");
			jogador.aumentarPontos(40);
		}else if(resposta.equals("5")|resposta.equals("2")|resposta.equals("3")|resposta.equals("4")){
			System.out.println("Resposta errada, perdeu 10 pontos!\n");
			jogador.diminuirPontos(10);
			} else if(resposta.equalsIgnoreCase("dica")) {
			 System.out.println("As alternativas 3 e 5 estão erradas");
			 System.out.println("Digite sua resposta: ");
			 String novaResposta = scanner.nextLine();
			 if(novaResposta.equals("1")) {
				 System.out.println("Resposta correta, ganhou 20 pontos!\n");
					jogador.aumentarPontos(20);
				}else if(novaResposta.equals("1")|novaResposta.equals("2")|novaResposta.equals("3")|novaResposta.equals("4")){
					System.out.println("Resposta errada, perdeu 10 pontos!\n");
					jogador.diminuirPontos(10);
					} else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					} 
			 } else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
		}
	public void perguntaFacil3(Player jogador) {
		System.out.println("------------------------------------------------------------------");
		System.out.println("Vez do Jogador " + jogador.getNickname() + "\n" + "Pergunta nível fácil" + "\n");
		System.out.println("Qual método é usado para retornar uma string com caracteres maiúsculos?");
		System.out.println("[1] tuc()");
		System.out.println("[2] toUpperCase()");
		System.out.println("[3] touppercase()");
		System.out.println("[4] upperCase()");
		System.out.println("[5] uppercase()");
		System.out.println("Digite sua resposta: ");
		System.out.println("Para soliticar uma dica digite dica (ganha metade dos pontos)");
		System.out.println("------------------------------------------------------------------");
		String resposta = scanner.nextLine();
		if (resposta.equals("2")) {
			System.out.println("Resposta correta, ganhou 40 pontos!\n");
			jogador.aumentarPontos(40);
		}else if(resposta.equals("1")|resposta.equals("5")|resposta.equals("3")|resposta.equals("4")){
			System.out.println("Resposta errada, perdeu 10 pontos!\n");
			jogador.diminuirPontos(10);
			} else if(resposta.equalsIgnoreCase("dica")) {
			 System.out.println("As alternativas 1 e 5 estão erradas");
			 System.out.println("Digite sua resposta: ");
			 String novaResposta = scanner.nextLine();
			 if(novaResposta.equals("2")) {
				 System.out.println("Resposta correta, ganhou 20 pontos!\n");
					jogador.aumentarPontos(20);
				}else if(novaResposta.equals("1")|novaResposta.equals("2")|novaResposta.equals("3")|novaResposta.equals("4")){
					System.out.println("Resposta errada, perdeu 10 pontos!\n");
					jogador.diminuirPontos(10);
					} else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
			 } else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
		}
	public void perguntaFacil4(Player jogador) {
		System.out.println("------------------------------------------------------------------");
		System.out.println("Vez do Jogador " + jogador.getNickname() + "\n" + "Pergunta nível fácil" + "\n");
		System.out.println("Qual a ordem correta dos modificadores de visibilidade?");
		System.out.println("[1] private < public < protected");
		System.out.println("[2] protected < private < public");
		System.out.println("[3] public < protected < private");
		System.out.println("[4] private < protected < public");
		System.out.println("[5] private < protected = public");
		System.out.println("Digite sua resposta: ");
		System.out.println("Para soliticar uma dica digite dica (ganha metade dos pontos)");
		System.out.println("------------------------------------------------------------------");
		String resposta = scanner.nextLine();
		if (resposta.equals("4")) {
			System.out.println("Resposta correta, ganhou 40 pontos!\n");
			jogador.aumentarPontos(40);
		}else if(resposta.equals("1")|resposta.equals("2")|resposta.equals("3")|resposta.equals("5")){
			System.out.println("Resposta errada, perdeu 10 pontos!\n");
			jogador.diminuirPontos(10);
			} else if(resposta.equalsIgnoreCase("dica")) {
			 System.out.println("As alternativas 2 e 5 estão erradas");
			 System.out.println("Digite sua resposta: ");
			 String novaResposta = scanner.nextLine();
			 if(novaResposta.equals("4")) {
				 System.out.println("Resposta correta, ganhou 20 pontos!\n");
					jogador.aumentarPontos(20);
				}else if(novaResposta.equals("1")|novaResposta.equals("2")|novaResposta.equals("3")|novaResposta.equals("4")){
					System.out.println("Resposta errada, perdeu 10 pontos!\n");
					jogador.diminuirPontos(10);
					} else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
			 } else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
		}
	public void perguntaMedia1(Player jogador){
		System.out.println("------------------------------------------------------------------");
		System.out.println("Vez do Jogador " + jogador.getNickname() + "\n" + "Pergunta nível médio" + "\n");
		System.out.println("Quem foi o criador do Java?");
		System.out.println("[1] Bill Gates");
		System.out.println("[2] James Gosling");
		System.out.println("[3] Steve Jobs");
		System.out.println("[4] Elon Musk");
		System.out.println("[5] Jeff Bezos");
		System.out.println("Digite sua resposta: ");
		System.out.println("Para soliticar uma dica digite dica (ganha metade dos pontos)");
		System.out.println("------------------------------------------------------------------");
		String resposta = scanner.nextLine();
		if (resposta.equals("2")) {
			System.out.println("Resposta correta, ganhou 60 pontos!\n");
			jogador.aumentarPontos(60);
		}else if(resposta.equals("1")|resposta.equals("5")|resposta.equals("3")|resposta.equals("4")){
			System.out.println("Resposta errada, perdeu 10 pontos!\n");
			jogador.diminuirPontos(10);
			} else if(resposta.equalsIgnoreCase("dica")) {
			 System.out.println("As alternativas 1 e 4 estão erradas");
			 System.out.println("Digite sua resposta: ");
			 String novaResposta = scanner.nextLine();
			 if(novaResposta.equals("2")) {
				 System.out.println("Resposta correta, ganhou 30 pontos!\n");
					jogador.aumentarPontos(30);
				}else if(novaResposta.equals("1")|novaResposta.equals("2")|novaResposta.equals("3")|novaResposta.equals("4")){
					System.out.println("Resposta errada, perdeu 10 pontos!\n");
					jogador.diminuirPontos(10);
					} else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
			 } else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
		}
	public void perguntaMedia2(Player jogador){
		System.out.println("------------------------------------------------------------------");
		System.out.println("Vez do Jogador " + jogador.getNickname() + "\n" + "Pergunta nível médio" + "\n");
		System.out.println("Qual alternativa falsa sobre interface?");
		System.out.println("[1] Uma classe não pode implementar mais de uma interface");
		System.out.println("[2] Uma interface pode estender outra interface");
		System.out.println("[3] Uma classe que implementa interface deve implementar todos os métodos de interface");
		System.out.println("[4] É usado para obter herança múltipla");
		System.out.println("[5] Todos os métodos são públicos e abstratos");
		System.out.println("Digite sua resposta: ");
		System.out.println("Para soliticar uma dica digite dica (ganha metade dos pontos)");
		System.out.println("------------------------------------------------------------------");
		String resposta = scanner.nextLine();
		if (resposta.equals("1")) {
			System.out.println("Resposta correta, ganhou 60 pontos!\n");
			jogador.aumentarPontos(60);
		}else if(resposta.equals("2")|resposta.equals("5")|resposta.equals("3")|resposta.equals("4")){
			System.out.println("Resposta errada, perdeu 10 pontos!\n");
			jogador.diminuirPontos(10);
			} else if(resposta.equalsIgnoreCase("dica")) {
			 System.out.println("As alternativas 2 e 5 estão erradas");
			 System.out.println("Digite sua resposta: ");
			 String novaResposta = scanner.nextLine();
			 if(novaResposta.equals("1")) {
				 System.out.println("Resposta correta, ganhou 30 pontos!\n");
					jogador.aumentarPontos(30);
				}else if(novaResposta.equals("1")|novaResposta.equals("2")|novaResposta.equals("3")|novaResposta.equals("4")){
					System.out.println("Resposta errada, perdeu 10 pontos!\n");
					jogador.diminuirPontos(10);
					} else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
			 } else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
		}
	public void perguntaMedia3(Player jogador){
		System.out.println("------------------------------------------------------------------");
		System.out.println("Vez do Jogador " + jogador.getNickname() + "\n" + "Pergunta nível médio" + "\n");
		System.out.println("Qual alternativa falsa sobre construtores?");
		System.out.println("[1] Os construtores têm o mesmo nome da classe");
		System.out.println("[2] Os construtores têm modificadores de acesso");
		System.out.println("[3] Se nenhum construtor for implementado, é o construtor padrão que será invocado");
		System.out.println("[4] Só são chamados na instanciação do objeto");
		System.out.println("[5] Os construtores retornam valor");
		System.out.println("Digite sua resposta: ");
		System.out.println("Para soliticar uma dica digite dica (ganha metade dos pontos)");
		System.out.println("------------------------------------------------------------------");
		String resposta = scanner.nextLine();
		if (resposta.equals("5")) {
			System.out.println("Resposta correta, ganhou 60 pontos!\n");
			jogador.aumentarPontos(60);
		}else if(resposta.equals("2")|resposta.equals("1")|resposta.equals("3")|resposta.equals("4")){
			System.out.println("Resposta errada, perdeu 10 pontos!\n");
			jogador.diminuirPontos(10);
			} else if(resposta.equalsIgnoreCase("dica")) {
			 System.out.println("As alternativas 2 e 3 estão erradas");
			 System.out.println("Digite sua resposta: ");
			 String novaResposta = scanner.nextLine();
			 if(novaResposta.equals("5")) {
				 System.out.println("Resposta correta, ganhou 30 pontos!\n");
					jogador.aumentarPontos(30);
				}else if(novaResposta.equals("1")|novaResposta.equals("2")|novaResposta.equals("3")|novaResposta.equals("4")){
					System.out.println("Resposta errada, perdeu 10 pontos!\n");
					jogador.diminuirPontos(10);
					} else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
			 } else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
		}
	public void perguntaMedia4(Player jogador){
		System.out.println("------------------------------------------------------------------");
		System.out.println("Vez do Jogador " + jogador.getNickname() + "\n" + "Pergunta nível médio" + "\n");
		System.out.println("Qual empresa é dona do Java?");
		System.out.println("[1] Meta");
		System.out.println("[2] Sun");
		System.out.println("[3] Amazon");
		System.out.println("[4] Oracle Corporation");
		System.out.println("[5] Time Warner");
		System.out.println("Digite sua resposta: ");
		System.out.println("Para soliticar uma dica digite dica (ganha metade dos pontos)");
		System.out.println("------------------------------------------------------------------");
		String resposta = scanner.nextLine();
		if (resposta.equals("4")) {
			System.out.println("Resposta correta, ganhou 60 pontos!\n");
			jogador.aumentarPontos(60);
		}else if(resposta.equals("2")|resposta.equals("5")|resposta.equals("3")|resposta.equals("1")){
			System.out.println("Resposta errada, perdeu 10 pontos!\n");
			jogador.diminuirPontos(10);
			} else if(resposta.equalsIgnoreCase("dica")) {
			 System.out.println("As alternativas 3 e 5 estão erradas");
			 System.out.println("Digite sua resposta: ");
			 String novaResposta = scanner.nextLine();
			 if(novaResposta.equals("4")) {
				 System.out.println("Resposta correta, ganhou 30 pontos!\n");
					jogador.aumentarPontos(30);
				}else if(novaResposta.equals("1")|novaResposta.equals("2")|novaResposta.equals("3")|novaResposta.equals("4")){
					System.out.println("Resposta errada, perdeu 10 pontos!\n");
					jogador.diminuirPontos(10);
					} else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
			 } else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
		}
	public void perguntaDificil1(Player jogador){
		System.out.println("------------------------------------------------------------------");
		System.out.println("Vez do Jogador " + jogador.getNickname() + "\n" + "Pergunta nível difícil" + "\n");
		System.out.println("Qual o tamanho de uma variável boolean?");
		System.out.println("[1] 4 bit");
		System.out.println("[2] 8 bit");
		System.out.println("[3] 16 bit");
		System.out.println("[4] 32 bit");
		System.out.println("[5] Não definida precisamente");
		System.out.println("Digite sua resposta: ");
		System.out.println("Para soliticar uma dica digite dica (ganha metade dos pontos)");
		System.out.println("------------------------------------------------------------------");
		String resposta = scanner.nextLine();
		if (resposta.equals("3")) {
			System.out.println("Resposta correta, ganhou 100 pontos!\n");
			jogador.aumentarPontos(100);
		}else if(resposta.equals("2")|resposta.equals("5")|resposta.equals("1")|resposta.equals("4")){
			System.out.println("Resposta errada, perdeu 10 pontos!\n");
			jogador.diminuirPontos(10);
			} else if(resposta.equals("dica")) {
			 System.out.println("As alternativas 4 e 5 estão erradas");
			 System.out.println("Digite sua resposta: ");
			 String novaResposta = scanner.nextLine();
			 if(novaResposta.equals("3")) {
				 System.out.println("Resposta correta, ganhou 50 pontos!\n");
					jogador.aumentarPontos(50);
				}else if(novaResposta.equals("1")|novaResposta.equals("2")|novaResposta.equals("3")|novaResposta.equals("4")){
					System.out.println("Resposta errada, perdeu 10 pontos!\n");
					jogador.diminuirPontos(10);
					} else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
			 } else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
		}
	public void perguntaDificil2(Player jogador){
		System.out.println("------------------------------------------------------------------");
		System.out.println("Vez do Jogador " + jogador.getNickname() + "\n" + "Pergunta nível difícil" + "\n");
		System.out.println("java.util.Collections é um?");
		System.out.println("[1] Classe");
		System.out.println("[2] Interface");
		System.out.println("[3] Objeto");
		System.out.println("[4] Tipo de herança");
		System.out.println("[5] Nenhum desses");
		System.out.println("Digite sua resposta: ");
		System.out.println("Para soliticar uma dica digite dica (ganha metade dos pontos)");
		System.out.println("------------------------------------------------------------------");
		String resposta = scanner.nextLine();
		if (resposta.equals("1")) {
			System.out.println("Resposta correta, ganhou 100 pontos!\n");
			jogador.aumentarPontos(100);
		}else if(resposta.equals("2")|resposta.equals("5")|resposta.equals("3")|resposta.equals("4")){
			System.out.println("Resposta errada, perdeu 10 pontos!\n");
			jogador.diminuirPontos(10);
			} else if(resposta.equalsIgnoreCase("dica")) {
			 System.out.println("As alternativas 2 e 5 estão erradas");
			 System.out.println("Digite sua resposta: ");
			 String novaResposta = scanner.nextLine();
			 if(novaResposta.equals("1")) {
				 System.out.println("Resposta correta, ganhou 50 pontos!\n");
					jogador.aumentarPontos(50);
				}else if(novaResposta.equals("1")|novaResposta.equals("2")|novaResposta.equals("3")|novaResposta.equals("4")){
					System.out.println("Resposta errada, perdeu 10 pontos!\n");
					jogador.diminuirPontos(10);
					} else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
			 } else {
						System.out.println("Resposta inválida, perdeu 10 pontos!\n");
					}
		}
}