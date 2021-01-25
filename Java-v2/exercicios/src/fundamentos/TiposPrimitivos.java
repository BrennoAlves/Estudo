package fundamentos;

public class TiposPrimitivos {
	
	public static void main(String[] args) {
		//informações do funcionario
		
		
		//Tipos numéricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_233L;
		//colocar l/L no final para mostrar que é um long
		//_ pode ser colocado para melhorar a leitura
		
		//Tipos numéricos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		//colocar f/F no final para transformar em um literal floatuante
		
		//Tipo booleano
		boolean estaDeFerias = false;
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Usando
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Número de viagens
		System.out.println(numeroDeVoos/2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		//Extras
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status: " + status);
		
		
		
		
	 }

}
