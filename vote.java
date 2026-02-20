import java.util.Scanner;

public class vote {
    public static void main(String[] args) {
        
        System.out.println("Enter the age:");
        Scanner s = new Scanner(System.in);
        int age = s.nextInt();
        
        if (age >= 18) {
            System.out.println("The person is eligible to vote.");
        } else {
            System.out.println("The person is not eligible to vote.");
        }

        s.close();
    }
}