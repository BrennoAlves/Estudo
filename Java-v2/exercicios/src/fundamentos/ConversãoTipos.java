package fundamentos;

import java.math.BigDecimal;

import javax.swing.JOptionPane;

public class ConversãoTipos {
	public static void main(String[] args) {
		
		double a = 1;
		System.out.println(a);
		
		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		
		int num2 = 100000;
		System.out.println(Integer.toString(num2).length());
		
		System.out.println(("" + num2).length());
		//quando concatena um número com uma String ele se torna String
		
		
		//convertendo string para numero usando um pop-up
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		String valor2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		//System.out.println(valor1 + valor2);
		
		double numero1 = Double.parseDouble(valor1);
		double numero2 = Double.parseDouble(valor2);
		
		double soma = numero1 + numero2;
		BigDecimal media = new BigDecimal(soma/2);
		BigDecimal teste = new BigDecimal(7.9 + 8.3);
		//Para calculos ultraprecisos usar a classe BigDecimal
		System.out.println("Soma é " + soma);
		System.out.println("Média é " + media);
		System.out.println(teste);
		
	}

}
