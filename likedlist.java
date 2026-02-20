import java.util.*;
public class likedlist {
    
public static void main(String[] args) {
    LinkedList<String> rr = new LinkedList<>();
    ArrayList <String> mm = new ArrayList<>();
    mm.add("mamnnuva");
    mm.add("adi");
    rr.add(0,"mannuva");
    rr.add(1,"manohar");

    rr.addAll(mm);
    rr.remove(2);
   
       
   // System.out.println(mm);
     System.out.println(rr);

    
    
    
    
    
}
}
