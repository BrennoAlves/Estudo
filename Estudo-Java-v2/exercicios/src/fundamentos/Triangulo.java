package fundamentos;

import java.util.Scanner;

public class Triangulo {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite o valor da base: ");
		double base = input.nextDouble();
		System.out.println("Digite o valor da altura: ");
		double altura = input.nextDouble();
		input.close();
		
		System.out.printf("A área do triângulo de base %.1f e altura %.1f é %.2f", base, altura, ((base*altura)/2));
		
		
		
	}

}
