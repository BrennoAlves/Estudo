package fundamentos;

import java.util.Scanner;

public class ProjetoFinal {
	public static void main(String[] args) {
		//Input de dois numeros
		//Input da operação matematica
		//resultado
		//não pode usar if
		
		Scanner input = new Scanner(System.in);
		System.out.println("Digite seu primeiro número: ");
		double n1 = input.nextDouble();
		System.out.println("Escolha o seu simbolo do seu operador: ");
		String operadorCru = input.next();
		System.out.println("Digite seu segundo número: ");
		double n2 = input.nextDouble();

		input.close();
		
		
		Double teste = "+".equals(operadorCru) ? n1 + n2 : 0;
		teste = "+".equals(operadorCru) ? n1 + n2 : 0;
		teste = "-".equals(operadorCru) ? n1 - n2 : teste;
		teste = "*".equals(operadorCru) ? n1 * n2 : teste;
		teste = "/".equals(operadorCru) ? n1 / n2 : teste;
		teste = "%".equals(operadorCru) ? n1 % n2 : teste;
		
		System.out.println(teste);
		
	}

}
