
package testeopternario;


public class TesteOpTernario {

    public static void main(String[] args) {
        String n1 = "Ado";
        String n2 = "Ado";
        String n3 = new String("Ado");
        String res = (n1 == n3) ? "igual" : "diferente";
        // não serve para objetos

        String resOO = (n1.equals(n3))?"igual":"diferente";
        //serve para objetos
        System.out.println(res);
        System.out.println(resOO);

    }
    
}
