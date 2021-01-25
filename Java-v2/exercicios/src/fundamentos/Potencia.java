package fundamentos;

import java.util.Scanner;

public class Potencia {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número: ");
		Double n = input.nextDouble();
		input.close();
		
		System.out.printf("O quadrado de %.1f é %.1f e o cubo é %.1f ", n, n*n, n*n*n);
		
	}
}
