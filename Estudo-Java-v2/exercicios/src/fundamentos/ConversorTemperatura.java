package fundamentos;

import java.util.Scanner;

public class ConversorTemperatura {
  public static void main(String[] args) {
	//pegar a temperatura em C e converter para F
	  
	  Scanner input = new Scanner(System.in);
	  System.out.println("Digite a temperatura em Celsius: ");
	  double temp =  input.nextDouble();
	  input.close();
	  
	  double fator = 9/5f ;
	  double calculo = ((temp * fator) + 32);
	  System.out.printf("Resultado é %.1f °F",calculo);
	  
	  
}
}
