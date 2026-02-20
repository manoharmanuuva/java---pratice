import java.util.Enumeration;
import java.util.Vector;

public class enumurationpratice {
    public static void main(String[] args) {
        Vector<String> m = new Vector<>();
        m.add("banana");
        m.add("manohar");

                 Enumeration<String> en= m.elements();
         while(en.hasMoreElements()){
            System.out.println(en.nextElement());
         }
    }
    
}
