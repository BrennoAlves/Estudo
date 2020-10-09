package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	
	Data()
	{
		dia = 1;
		mes = 1;
		ano = 1970;
	}
	
	Data(int x, int y, int z)
	{ 
		dia = x;
		mes = y;
		ano = z;
		
	}
	 String printData() 
	{
		return String.format("%d/%d/%d", dia,mes,ano);
	}
	
}