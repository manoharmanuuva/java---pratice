import java.util.ArrayList;

public class wrapperclass {
    public static void main(String[] args) {
       
    Integer i = Integer.valueOf(50);          //boxing
System.out.println(i); 
int a = 10;
Integer i1=a;
System.out.println(i1); //autoboxing


    
Integer i2=Integer.valueOf(20);
int b=i2;
System.out.println(b);       //unboxing
ArrayList<Double> m = new ArrayList<>();
m.add(10.55);
m.add(Double.valueOf(2.09));
System.out.println(m); 
int age = m.get(0);
System.out.println(age);
int k = (int) age;
System.out.println(k);
}
} 
        
        
        
        
       
    
