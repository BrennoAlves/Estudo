package classe;

public class Df1 {
	
	String nome;
	double preco;
	static double desconto;
	
	Df1()
	{
		
	}
	
	Df1(String n, double p)
	{
		nome = n;
		preco = p;
	}

	double precoComDesconto() 
		{
	return preco * (1 - desconto);	
		}
	
}
