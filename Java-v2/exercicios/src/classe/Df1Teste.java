package classe;

public class Df1Teste {

	public static void main(String[] args) {
		
		Df1.desconto = 0.25;
		
		var p1 = new Df1("Notebook",4356.89);
		var p2 = new Df1("Caneta Preta",12.56);
		
		System.out.println(p1.nome + " com desconto ficou " + p1.precoComDesconto());
		System.out.println(p2.nome + " com desconto ficou " + p2.precoComDesconto());
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		double media = (precoFinal1 + precoFinal2)/2;
		
		System.out.printf("A média do carrinho é R$%.2f",media);
		
	}
	
}