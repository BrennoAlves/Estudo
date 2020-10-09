package fundamentos;

public class OperadorTernario {
	
	public static void main(String[] args) {
		double media = 5.7f;
		
		String resultadoParcial = media >= 5.0 ? "em recuperação" : "reprovado";
		String resultado = media >= 7.0 ? "aprovado" : resultadoParcial;
		
		System.out.println("O aluno está " + resultado);
	}

}
