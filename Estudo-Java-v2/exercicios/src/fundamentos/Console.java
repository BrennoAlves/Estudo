package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("ado");
		System.out.println("Ado");
		//o print ln salta para a proxima linha para o proximo codigo
		
		Scanner input = new Scanner(System.in);
		System.out.print("Digite o seu nome: ");
		String nome = input.nextLine();
		int idade = input.nextInt();
		
		System.out.println("\nNome: " + nome + "\nIdade: " + idade);
		
		input.close();
		
	}

}
