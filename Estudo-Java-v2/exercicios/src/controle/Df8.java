package controle;

import java.util.Scanner;

public class Df8 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double n = 0.0;
		double maior = 0.0;
		
		for (int c = 0; c < 10; c++)
		{
			System.out.println("Digite um núero: ");
			n = input.nextDouble();
			if (n > maior)
				maior = n;
			
		}
		
		System.out.println("O maior número é " + maior);
		
		input.close();	
	}

}
