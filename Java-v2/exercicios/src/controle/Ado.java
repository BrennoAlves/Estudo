package controle;

import java.util.Scanner;

public class Ado {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		String stop = "";
		
		while (!stop.toLowerCase().equals("ado")) 
		{
			System.out.println("Qual a palavra mágica ?");
			//ado
			stop = input.next();
		}
		
		input.close();
	}
	
}
