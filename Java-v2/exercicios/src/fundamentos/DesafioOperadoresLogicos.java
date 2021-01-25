package fundamentos;

import java.util.Scanner;

public class DesafioOperadoresLogicos {
	
	public static void main(String[] args) {
		//Trabalhou na terça
		//Trabalhou na quinta
		//Se ambos forem ok executa uma compra de uma televisão de 50
		//Se apenas um ok executa uma compra de uma televisão de 32
		//Ambos os casos executa tomar sorvete
		//Se ambos derem errado nenhum deles acontece
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Você trabalhou terça? ");
		String t1 =  input.next();

		System.out.println("Você trabalhou quinta? ");
		String t2 =  input.next();

				
		
		input.close();
				
		if(t1.equals("Sim") || t1.equals("sim") || t1.equals("S") || t1.equals("s"))
		{
			if (t2.equals("Sim") || t2.equals("sim") || t2.equals("S") || t2.equals("s"))
			{
				System.out.println("Parabéns, vocês vão comprar uma TV de 50'' e tomar sorvete");
			} 
			else
			{
				System.out.println("Parabéns, vocês vão comprar uma TV de 32'' e tomar sorvete");
			}
		}
		else if(t2.equals("Sim") || t2.equals("sim") || t2.equals("S") || t2.equals("s"))
		{
			if (t1.equals("Sim") || t1.equals("sim")|| t1.equals("S") || t1.equals("s"))
			{
				System.out.println("Parabéns, vocês vão comprar uma TV de 50'' e tomar sorvete");
			} 
			else
			{
				System.out.println("Parabéns, vocês vão comprar uma TV de 32'' e tomar sorvete");
			}
			
		}
		else
		{
			System.out.println("Infelizmente, vocês não vão comprar uma TV e nem tomar sorvete");
		}
		
		
	}

}
