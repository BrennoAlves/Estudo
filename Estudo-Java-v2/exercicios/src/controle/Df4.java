package controle;

import java.util.Scanner;

public class Df4 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número: ");
		double n = input.nextDouble();
		input.close();
		
		int div = 0;
		
		for( int c = 1; c <= n ; c++ )
		{
			if (n%c == 0)
				div++;
		}

		
		if (div == 2)
		{
			System.out.printf("%.0f é um número primo", n);
		}
		else if (div != 2)
		{
			System.out.printf("%.0f não é um número primo", n);
		}
		else
		{
			System.out.println("Erro");
		}
	
	}
}