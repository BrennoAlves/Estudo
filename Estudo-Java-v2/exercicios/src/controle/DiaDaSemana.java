 package controle;

import java.util.Scanner;

public class DiaDaSemana {

	public static void main(String[] args) {
			
		Scanner input = new Scanner(System.in);
		System.out.println("Digite um número do dia que você quer: ");
		String dia = input.next();
		input.close();
		
		dia = dia.toLowerCase();
		
		if (dia.equals("1"))
			System.out.println("Domingo");
		else if (dia.equals("2"))
			System.out.println("Segunda-feira");
		else if (dia.equals("3"))
			System.out.println("Terça-feira");
		else if (dia.equals("4"))
			System.out.println("Quarta-feira");
		else if (dia.equals("5"))
			System.out.println("Quinta-feira");
		else if (dia.equals("6"))
			System.out.println("Sexta-feira");
		else if (dia.equals("7"))
			System.out.println("Sábado");
		
		else if (dia.equals("domingo"))
			System.out.println("Domingo é o dia 1");
		else if (dia.equals("segunda"))
			System.out.println("Segunda-feira é o dia 2");
		else if (dia.equals("terça"))
			System.out.println("Terça-feira é o dia 3");
		else if (dia.equals("quarta"))
			System.out.println("Quarta-feira é o dia 4");
		else if (dia.equals("quinta"))
			System.out.println("Quinta-feira é o dia 5");
		else if (dia.equals("sexta"))
			System.out.println("Sexta-feira é o dia 6");
		else if (dia.equals("sábado") || dia.equals("sabado"))
			System.out.println("Sábado é o dia 7");
		else
			System.out.println("Erro");
		
	}
	
}
