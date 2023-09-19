package lista;

import java.util.Scanner;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número máximo da sequência de Fibonacci desejado: ");
        int numeroMaximo = scanner.nextInt();

        int primeiroTermo = 0;
        int segundoTermo = 1;

        System.out.println("Sequência de Fibonacci até " + numeroMaximo + ":");
        System.out.print(primeiroTermo + " " + segundoTermo + " ");

        while (true) {
            int proximoTermo = primeiroTermo + segundoTermo;
            
            if (proximoTermo > numeroMaximo) {
                break; 
            }
            
            System.out.print(proximoTermo + " ");
            
            primeiroTermo = segundoTermo;
            segundoTermo = proximoTermo;
        }

        scanner.close();
    
	}

}
