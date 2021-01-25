package controle;

import java.util.Scanner;

public class Df3 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Digite a primeira nota:");
		double nota1 = input.nextDouble();
		System.out.println("Digite a segunda nota: ");
		double nota2 = input.nextDouble();
		input.close();

		double media = ((nota1 + nota2) / 2);

		if (media <= 10 && media >= 7) 
		{
			System.out.printf("Sua média foi %.1f então você está aprovado", media);
		} 
		else if (media < 7 && media > 4) 
		{
			System.out.printf("Sua média foi %.1f então você está em recuperação", media);
		} else if (media <= 4 && media >= 0) 
		{
			System.out.printf("Sua média foi %.1f então você está reprovado", media);
		} else
			System.out.println("Erro");

	}

}
