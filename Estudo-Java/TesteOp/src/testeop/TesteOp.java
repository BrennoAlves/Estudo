
package testeop;


public class TesteOp {
    
    public static void main(String[] args) {
        double n = 15 + Math.random() * (50-15);
         n += n*n;
        float n1 = (float) Math.sqrt(n);
        System.out.println(Math.floor(n1));
    }
    
}
