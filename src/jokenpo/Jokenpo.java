package jokenpo;

import java.util.Random;
import java.util.Scanner;

public class Jokenpo {

	public static void main(String[] args) {
		
		Scanner leitor = new Scanner(System.in);
		
		Random sorteio = new Random();
		
		int valorSorteado = sorteio.nextInt(3) + 1;
		int valorJogador;
		
		System.out.println("******J O K E N P �******");
		System.out.println("Escolha entre as op��es: ");
		System.out.println("1 - Pedra");
		System.out.println("2 - Papel");
		System.out.println("3 - Tesoura");
		System.out.println();
		
		System.out.print("Digite o n�mero da op��o escolhida (1, 2 ou 3): ");
		valorJogador = leitor.nextInt();
		System.out.println();
		leitor.close();
		
		System.out.println("A op��o escolhida pelo m�quina foi: " + valorSorteado);
		System.out.println();
		
		if (valorSorteado == 1 && valorJogador == 2) {
			System.out.println("Voc� venceu!");
		} else if (valorSorteado == 1 && valorJogador == 3) {
			System.out.println("A m�quina venceu!");
		} else if (valorSorteado == 2 && valorJogador == 1) {
			System.out.println("A m�quina venceu!");
		} else if (valorSorteado == 2 && valorJogador == 3) {
			System.out.println("Voc� venceu!");
		} else if (valorSorteado == 3 && valorJogador == 1) {
			System.out.println("Voc� venceu!");
		} else if (valorSorteado == 3 && valorJogador == 2) {
			System.out.println("A m�quina venceu!");
		} else {
			System.out.println("Empate!");
		}
		
 
	}

}
