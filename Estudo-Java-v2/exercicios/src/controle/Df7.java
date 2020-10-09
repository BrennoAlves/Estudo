package controle;

import java.util.Scanner;

public class Df7 {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.println("Digite a palavra: ");
		String palavra = input.next();
		input.close();
		
		var tamanho = palavra.length();
		
		for (int c = 0; c < tamanho; c++)
		{
			System.out.println(palavra.charAt(c));
		}
		
		
	}
	
}
