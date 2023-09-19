package lista;

import java.util.Scanner;

public class Q3 {
		public static void main(String[] args) {
			
			Scanner entrada = new Scanner(System.in);
			
			System.out.println("Digite o numero para criação da tabuada: ");
			
			int numero = entrada.nextInt();
			
			for (int i = 0; i <= 10; i++) {
				int out = numero * i;
				System.out.println(numero + "x" + i + "=" + out);
			}
			
			
			entrada.close();
		}
	
}
