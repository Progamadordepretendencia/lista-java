package lista;

import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Digite uma operação matemática como adição, subtração, multiplicação, divisão");
		Scanner scanner = new Scanner(System.in);
		String op = scanner.next();
		
		switch (op.charAt(0)) {
		case 'A':
		case 'a':
			System.out.println("digite o primeiro numero");
			int num1 = scanner.nextInt();
			System.out.println("digite o segundo numero");
			int num2 = scanner.nextInt();
			int soma = num1 + num2;		
			System.out.println("A soma deu "+ soma);
			break;
		case 's':
		case 'S':
			System.out.println("digite o primeiro numero");
			int num1S = scanner.nextInt();
			System.out.println("digite o segundo numero");
			int num2S = scanner.nextInt();
			int subtracao = num1S - num2S;		
			System.out.println("A subtração deu "+ subtracao);
			break;
		case 'm':
		case 'M':
			System.out.println("digite o primeiro numero");
			int num1M = scanner.nextInt();
			System.out.println("digite o segundo numero");
			int num2M = scanner.nextInt();
			int mul = num1M * num2M;		
			System.out.println("A soma deu "+ mul);
			break;
		case 'd':
		case 'D':
			System.out.println("digite o primeiro numero");
			int num1D = scanner.nextInt();
			System.out.println("digite o segundo numero");
			int num2D = scanner.nextInt();
			int div = num1D/num2D;		
			System.out.println("A soma deu "+ div);
			break;

		default:
			System.out.println("A palavra digitada não é uma operação válida");
			break;
		}
		
		scanner.close();
	}

}
