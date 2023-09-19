package lista;

import java.util.Scanner;

public class Q10 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Digite o segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Digite o terceiro número: ");
        int numero3 = scanner.nextInt();

        int maiorNumero;

        if (numero1 >= numero2 && numero1 >= numero3) {
            maiorNumero = numero1;
        } else if (numero2 >= numero1 && numero2 >= numero3) {
            maiorNumero = numero2;
        } else {
            maiorNumero = numero3;
        }

        System.out.println("O maior número é: " + maiorNumero);

        scanner.close();
	}
}
