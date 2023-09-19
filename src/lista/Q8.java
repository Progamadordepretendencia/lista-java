package lista;

import java.util.Scanner;

public class Q8 {
		public static void main(String[] args) {
			System.out.println("Digite sua idade: ");
			Scanner scanner = new Scanner(System.in);
			int idade = scanner.nextInt();
			
			if (idade > 18) {
				System.out.println("Maior de 18 anos");
			}else {
				System.out.println("Menor de 18 anos");
			}
		
			
			scanner.close();
		}
		
}
