package fundamentos;

import java.util.Scanner;

public class IMC {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite sua atura em CM: ");
		double altura = input.nextDouble();
		System.out.println("Digite seu peso no formato [12.3]: ");
		double peso = input.nextDouble();
		input.close();
		
		altura *= altura;
		double conta = (peso/(altura/10000));
		System.out.printf("Seu IMC é %.2f" , conta );
		
	}

}
