package fundamentos;

import java.util.Scanner;

public class DesafioConversao {
	
	public static void main(String[] args) {
		//pegar os ultimos 3 salarios, pode ser digitado com ponto ou virgula
		
		Scanner input = new Scanner(System.in);
			
		System.out.println("Digite seu salario do primeiro mês: ");
		String salario1 = input.nextLine();
		
		System.out.println("Digite seu salario do segundo mês: ");
		String salario2 = input.nextLine();
		
		System.out.println("Digite seu salario do terceiro mês: ");
		String salario3 = input.nextLine();
		
		input.close();
		
		salario1 = salario1.replace(",", ".");
		salario2 = salario3.replace(",", ".");
		salario3 = salario2.replace(",", ".");

		double soma = Double.parseDouble(salario1) + Double.parseDouble(salario2) + Double.parseDouble(salario3);
		double media = soma/3;
		System.out.printf("Sua média salarial dos últimos 3 meses foi R$%.2f", media );
		
	}

}
