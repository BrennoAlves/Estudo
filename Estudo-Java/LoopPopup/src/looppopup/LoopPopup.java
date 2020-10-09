package looppopup;

import javax.swing.JOptionPane;

public class LoopPopup {

    public static void main(String[] args) {
        //JOptionPane.showMessageDialog(null, "Olá mundo", "Boas Vindas", JOptionPane.ERROR_MESSAGE);

        //media
        int n, soma = 0;
        int contador = 0;
        int par = 0;
        int impar = 0;
        int cem = 0;
        do {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br> (Valor 0 interrompe</html>"));
            soma += n;
            contador++;

            if (n == 0) {
                contador = contador - 1;
                break;
            } else if (n % 2 == 0) {
                par++;
                if (n >= 100) {
                    cem++;
                } else {
                }
            } else {
                impar++;
            }

        } while (n != 0);

        int media = soma / contador;
        JOptionPane.showMessageDialog(null, "<html> Resultado Final <br>"
                + "<br>Somatório vale: " + soma
                + "<br>Números Pares: " + par
                + "<br>Números de Impares: " + impar
                + "<br>Números acima de cem: " + cem
                + "<br>Media: " + media
                + "</html>");
    }

}
