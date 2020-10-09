package controle;

import java.util.Scanner;

public class Df6 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		double n = 0.0;
		double t = 0.0;
		
		while("ado" == "ado")
			{
				System.out.println("Digite um número: ");
				n = input.nextDouble();
				if (n > 0)
				{
					t += n;
				}
				else if (n < 0)
				{
					System.out.printf("A soma dos números é %.1f",t);
					input.close();
					break;
				}
			}
		
		
	}

}
