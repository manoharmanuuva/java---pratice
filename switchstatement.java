public class switchstatement {
    
    public static void main(String args[]){
        int number = 5;   // change value to test

        switch(number){
            case 5:
                System.out.println("Five");
                break;
            default:
                if(number > 0)
                    System.out.println("Positive");
                else
                    System.out.println("Negative");
        }
    }
}
    

