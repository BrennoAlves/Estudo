package fundamentos;

public class TipoString {
	
	public static void main(String[] args) {
		System.out.println("Olá pessoal".charAt(2));
		
		String s = "Boa tarde";
		System.out.println(s.concat("!"));
		System.out.println(s.toLowerCase().startsWith("boa"));
		System.out.println(s.equalsIgnoreCase("boa tarde"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var idade = 33;
		var salario = 12345.987;
		
		String frase = String.format("Nome : %s %s tem  %d anos e ganha  R$%.2f", nome, sobrenome, idade, salario);
		System.out.println(frase);
	
	}
	
} 