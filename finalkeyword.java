public class finalkeyword {
   // variables
   /*int  value=50;
public finalkeyword(){
   value=100;
}

     final static  int num = 10;
    public static void main(String[] args) {

    
     /*   finalkeyword obj = new finalkeyword();
       obj.show();
        
        System.out.println("The value of num is: " + num);
    }
    public void show(){
         int values=20;
       
       System.out.println("The value of value is: " + value);
    System.out.println("The value of values is: " + values);
    // method
       public void hello(final int a){
         
         System.out.println("hello value is: "+a);
       }
       public static void main(String[] args) {
         
           finalkeyword obj = new finalkeyword();
           
           obj.hello(10);
       }*/
      public  void display(){
         System.out.println("hii final method");
      }
      static class child extends finalkeyword{
         @Override
         public void display(){
            System.out.println("hii cchild");
            
         }

      }
      public static void main(String[] args) {
          child obj = new child();
          obj.display();
    
    
}
