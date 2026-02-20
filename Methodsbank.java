public class Methodsbank {

    int currentBalance=500;
    public void greet(){
        System.out.println("hello good evening,welcome to the bank applicatiion");
    }
    
    
    public void deposit(int amount){
        currentBalance = amount + currentBalance;
        System.out.println("your current amount is after deposit" + currentBalance);


    }
    public void withdraw(int amount){
        currentBalance = currentBalance - amount;
        System.out.println("your current amount is after withdraw "+ currentBalance);
    }
     public int currentBalance(){
        System.out.println("your current balance is " + currentBalance);
        return currentBalance;}
    
    public static void main(String[] args) {
        Methodsbank v = new Methodsbank();
        v.greet();
       v. currentBalance();
       v.deposit(100);
       v.deposit(2000);
       v.withdraw(200);
    }
    
}
