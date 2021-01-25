package fundamentos;

import java.util.Scanner;

public class ConversorTemperatura2 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double temp = input.nextDouble();
		input.close();
		
		double fator = 5/9f;
		double calculo = ((temp - 32) * fator);
		System.out.printf("A temperatura é %.1f ºC", calculo);
		
	}

}
