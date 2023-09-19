package lista;

import java.util.Random;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner chute = new Scanner(System.in);
		Random choice = new Random();
		
		
		System.out.println("O computador irá sortear um número entre 1 e 100 preciso que digite um valor");
		System.out.println("Chute um numero entre 1 e 100.  ");
		
		int numChoice = choice.nextInt(100) + 1;
		
		
		int num;
		
		while (true) {
			System.out.println("Digite o vosso palipite");
			num = chute.nextInt();
			
			if (num == numChoice) {
				System.out.println("Parabéns! Você acertou o número");
                break;
            } else if (num < numChoice) {
                System.out.println("Tente novamente. O número é maior.");
            } else {
                System.out.println("Tente novamente. O número é menor.");
            }
		}
		
		chute.close();

	}

}
