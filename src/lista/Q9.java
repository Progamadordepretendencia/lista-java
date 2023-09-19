package lista;

import java.util.Scanner;

public class Q9 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o preço unitário do produto: ");
        double uni = scanner.nextDouble();

        System.out.print("Digite a quantidade que você deseja comprar: ");
        int qtd = scanner.nextInt();

        double precoTotal;

        if (qtd > 10) {
            
            precoTotal = qtd * uni * 0.9; 
        } else {
            precoTotal = qtd * uni; 
        }

        System.out.println("O preço total a ser pago é: R$ " + precoTotal);

        scanner.close();

	}
}
