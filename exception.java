public class exception {
   
    public static void main(String[] args) {
        method2();
        
    
        
    }
    public static void method2(){
        method1();
    }
    public static void  method1(){

    
    int a=100;
    int b = 0;
    int c = 0;
    try {
    c= a/b;
    }
    catch(ArithmeticException mr){
        System.out.println(mr.toString());

    } finally{
        System.out.println("the code eexecuttion is complete");
     
   
    System.out.println("the program execution will be start");
    System.out.println("the output is "+c);
    
     
    }
    
    
        
    }

    

   
    }
    
    

