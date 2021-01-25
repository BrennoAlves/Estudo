package controle;

import java.util.Scanner;
import java.util.Random;

public class Df5 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		
		int n = random.nextInt(30);
		int vidas = 10;
		int nDigitado = 0;
		
		System.out.println("Tente advinhar o número! \nDicas: Ele é um número inteiro entre 0 e 30\n Cada vez que errar você perde uma vida");
		
		for (; vidas > 0; vidas--)
		{
			System.out.printf("Você ainda tem %d vidas\n", vidas);
			System.out.println("==============================================================================");
			nDigitado = input.nextInt();
			
			if(nDigitado > 0 && nDigitado <= 30)
			{
				if (nDigitado == n)
				{
				System.out.println("Parabéns, você acertou!");
				break;
				}
				else if (nDigitado < n)
					System.out.println("Um pouco mais!");
				else if (nDigitado > n)
					System.out.println("Um pouco menos!");
			}
			else
			{
				System.out.println("Número inválido!");
			}
		}
		
		
		input.close();
	}

}
