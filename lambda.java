public class lambda {
    public static void main(String[] args) {
        car c1 = new car(){
            public void drive(int speed)
{
    System.out.println("drive bmw"+speed);
}   


};
c1.drive(50);

tata t1 = new tata();
t1.drive(80);
 car c2 = speed ->
{
    System.out.println("drive suziki");     
};
c2.drive(60);
    
}
}
class tata implements car{
    @Override
    public void drive(int speed){
        System.out.println("driving tata");
    }
}
@FunctionalInterface
interface car{
    public void drive(int speed);
}

