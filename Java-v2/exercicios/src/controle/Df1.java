package controle;

import java.util.Scanner;

public class Df1 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double n = input.nextDouble();
		input.close();
		
		if (n >= 0 && n <= 10 && (n%2) == 0)
		{
			System.out.println("Show");
		}
		
	}
	
}
