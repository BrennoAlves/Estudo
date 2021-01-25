
package testelogico;


import java.util.Scanner;

public class TesteLogico {


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Digite sua primeira nota: ");
       float n1 = input.nextFloat();
        System.out.print("Digite sua segunda nota: ");
        float n2 = input.nextFloat();
        float nt = n1 + n2;
        float m = (nt) / 2;

        System.out.println("Sua nota total é " + nt);
        System.out.println("Sua média então foi " + m);
        System.out.println(div);
        if (m < 6){
            System.out.println("Então você ficou sem média");
        }
        else if (m >= 6){
            System.out.println("Você ficou com média");
        }
        else {
            System.out.println("Erro");
        }
 


    }
    
}
