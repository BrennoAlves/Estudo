package controle;
import java.util.Scanner;

public class Df2 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um ano: ");
		int ano = input.nextInt();
		input.close();
		
		if (ano%4 == 0 || ano%100 == 0 || ano%400 == 0)
		{
			System.out.printf("O ano %d é um ano bissexto", ano);
		}
		else if (ano%4 != 0)
		{
			System.out.printf("O ano %d não é um ano bissexto", ano);
		}
		else
		{
			System.out.println("Erro");
		}
	}

}
