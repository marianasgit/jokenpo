package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Random sorteio = new Random();
		
		int valorSorteado = sorteio.nextInt(3) + 1;
		int valorJogador;
		
		System.out.println("******J O K E N P Ô******");
		System.out.println("Escolha entre as opções: ");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println();
		
		System.out.print("Digite o número da opção escolhida (1, 2 ou 3): ");
		valorJogador = leitor.nextInt();
		System.out.println();
		leitor.close();
		
		if (valorJogador == 1) {
			System.out.println("Você escolheu: Pedra");
		} else if (valorJogador == 2) {
			System.out.println("Você escolheu: Papel");
		} else {
			System.out.println("Você escolheu: Tesoura");
		}
		
		if (valorSorteado == 1) {
			System.out.println("A escolha do computador foi: Pedra");
		} else if (valorSorteado == 2) {
			System.out.println("A escolha do computador foi: Papel");
		} else {
			System.out.println("A escolha do computador foi: Tesoura");
		}
		System.out.println();
		
		if (valorSorteado == 1 && valorJogador == 2) {
			System.out.println("Você venceu!");
		} else if (valorSorteado == 1 && valorJogador == 3) {
			System.out.println("O computador venceu!");
		} else if (valorSorteado == 2 && valorJogador == 1) {
			System.out.println("O computador venceu!");
		} else if (valorSorteado == 2 && valorJogador == 3) {
			System.out.println("Você venceu!");
		} else if (valorSorteado == 3 && valorJogador == 1) {
			System.out.println("Você venceu!");
		} else if (valorSorteado == 3 && valorJogador == 2) {
			System.out.println("O computador venceu!");
		} else {
			System.out.println("Empate!");
		}
		
 
	}

}
