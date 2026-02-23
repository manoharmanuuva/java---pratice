   public class Switchexp {
    public static void main(String args[]){
       // int number = 10;   // change value to test
        // new style
          /*   switch(Integer.compare(number, 0)){
                case 0 -> System.out.println("Zero");
                       
                case 1->System.out.println("positive");
                       
                case -1 -> System.out.println("Negative");
            }
        // old style   
            switch(Integer.compare(number, 0)){
                case 0 :
                       System.out.println("Zero");
                       break;
                       
                case 1:
                       System.out.println("positive");
                      break;
                case -1:
                        System.out.println("Negative");
                         break;
        }
*/        //advance


 int number = 11; 
 String result="";
 result=switch(Integer.compare(number, 0)){
    case 0 ->"zero";
    case 1 ->
    {
        if(number%2==0)
            yield "positive even";
        else 
            yield "positive odd";
    }
    case -1 ->"negative";
    default -> "unknown";
    
 };
 System.out.printf(" the number is %d is %s",number,result);
    }
}