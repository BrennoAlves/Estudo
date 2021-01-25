package controle;

import java.util.Scanner;

public class DesafioWhile {

	public static void main(String[] args) {
		//media nota dos alunos
		//loop até ele digitar -1
		//variavel para somar total
		//variavel para ter numero de alunos
		
		Scanner input = new Scanner(System.in);
		
		double nota = 0.0;
		double somatorio = 0.0;
		double contador = 0;
		
		while (nota != -1) {
			System.out.println("Digite a nota do aluno [-1 para sair]");
			nota = input.nextDouble();
			
			if (nota <= 10 && nota >= 0)
			{
				somatorio += nota;
				contador++;
			}
			else if (nota != -1)
				System.out.println("Nota invalida");
		}
		double media = somatorio/contador;
		System.out.printf("Foram %.0f notas e a media entre elas é %.1f", contador, media);
		input.close();
	}
	
}
