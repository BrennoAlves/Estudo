package classe;

public class Area {

	double raio;
	static final double PI = 3.14;
	
	Area(double raioInicial) 
	{
		//pi = 3.14;
		raio = raioInicial;
	}
	
	double area() 
	{
		return PI * raio * raio;
	}
	
}
