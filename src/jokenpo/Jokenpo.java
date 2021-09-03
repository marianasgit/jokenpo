package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Random sorteio = new Random();
		
		int valorComputador = sorteio.nextInt(3) + 1;
		int valorJogador;
		int pedra = 1, papel = 2, tesoura = 3;
		
		
		System.out.println("******J O K E N P Ô******");
		System.out.println();
		System.out.println("Escolha entre as opções: ");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println();
		
		System.out.print("Digite o número da opção escolhida (1, 2 ou 3): ");
		valorJogador = leitor.nextInt();
		System.out.println();
		leitor.close();
		
		String escolhaJogador, escolhaComputador;
		
		if (valorJogador == pedra) {
			escolhaJogador = "Pedra"; 
		} else if (valorJogador == papel) {
			escolhaJogador = "Papel";
		}else {
			escolhaJogador = "Tesoura";
		}
		
		if (valorComputador == pedra) {
			escolhaComputador = "Pedra";
		}else if (valorComputador == papel) {
			escolhaComputador = "Papel";
		}else {
			escolhaComputador = "Tesoura";
		}
		
		System.out.println("Você escolheu: " + escolhaJogador + "!");
		System.out.println("O computador escolheu: " + escolhaComputador + "!");
		
		
//		if (valorJogador == pedra) {
//			System.out.println("Você escolheu: Pedra");
//		} else if (valorJogador == papel) {
//			System.out.println("Você escolheu: Papel");
//		} else {
//			System.out.println("Você escolheu: Tesoura");
//		}
//		
//		if (valorComputador == pedra) {
//			System.out.println("A escolha do computador foi: Pedra");
//		} else if (valorComputador == papel) {
//			System.out.println("A escolha do computador foi: Papel");
//		} else {
//			System.out.println("A escolha do computador foi: Tesoura");
//		}
		
		System.out.println();
		
//		if (valorComputador == pedra && valorJogador == papel) {
//			System.out.println("Você venceu!");
//		} else if (valorComputador == pedra && valorJogador == tesoura) {
//			System.out.println("O computador venceu!");
//		} else if (valorComputador == papel && valorJogador == pedra) {
//			System.out.println("O computador venceu!");
//		} else if (valorComputador == papel && valorJogador == tesoura) {
//			System.out.println("Você venceu!");
//		} else if (valorComputador == tesoura && valorJogador == pedra) {
//			System.out.println("Você venceu!");
//		} else if (valorComputador == tesoura && valorJogador == papel) {
//			System.out.println("O computador venceu!");
//		} else {
//			System.out.println("Empate!");
//		}
		
		
		if (valorJogador == pedra) {
			if (valorComputador == pedra) {
				System.out.println("Empate!");
			} else if (valorComputador == papel) {
				System.out.println("O computador venceu!");
			} else {
				System.out.println("Você venceu!");
			}
				
		} else if (valorJogador == papel) {
			if (valorComputador == papel) {
				System.out.println("Empate!");
			} else if (valorComputador == pedra) {
				System.out.println("Você venceu!");
			} else {
				System.out.println("O computador venceu!");
			}
		} else {
			if (valorComputador == tesoura) {
				System.out.println("Empate!");
			} else if (valorComputador == pedra) {
				System.out.println("O computador venceu!");
			} else {
				System.out.println("Você venceu!");
			}
		}
		
	}

}
