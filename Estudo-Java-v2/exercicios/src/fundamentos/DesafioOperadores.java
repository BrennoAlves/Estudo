package fundamentos;

public class DesafioOperadores {
	public static void main(String[] args) {
		//partes menores
		double p1 = (double)(6*(3+2));
		double p2 = (double)((1-5)*(2-7));
		
		//partes maiores
		double a = (double) Math.pow(p1,2)/(3*2);
		double b = (double) (Math.pow(p2,2))/(Math.pow(2, 2));
		double c = (double) a-b;
		double d = (double) Math.pow(c,3);
		double e = (double) Math.pow(10, 3);
		double res = (double) d/e;
		
		System.out.println(res);

	}

}
