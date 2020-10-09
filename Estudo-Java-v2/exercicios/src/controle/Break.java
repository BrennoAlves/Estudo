package controle;

public class Break {

	public static void main(String[] args) {

		externo: for (int i = 0; i < 10; i++) {
			if (true) {
				if (i == 5)
					break externo;
				System.out.println(i);
			}
		}
	}
}
