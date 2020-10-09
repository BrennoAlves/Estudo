package fundamentos;

public class ConverterTemperatura {
	
	public static void main(String[] args) {
		float f = 86;
		float c = 0;
		final float ajuste = 32;
		final float fator = (float) 5/9;
		
		c = (f - ajuste)*fator;
		System.out.println(c);		
		
	}
}
