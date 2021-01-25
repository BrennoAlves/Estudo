package classe;

public class DataTeste {
	
	public static void main(String[] args) {
		
		Data agora = new Data(1,1,1);
		agora.dia = 20;
		agora.ano = 2001;
		
		System.out.println(agora.printData());
		
	}

}
