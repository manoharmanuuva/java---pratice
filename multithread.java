public class multithread {
    public static void main(String[] args) {
    //*System.out.println("hello manohar");
      // System.out.println(Thread.currentThread().getName());
     // System.out.println( Thread.activeCount());
//System.out.println(Thread.currentThread().getId());  }

/*Thread t1= new Thread();
Thread t2= new Thread();
Thread t3= new Thread();
Thread t4= new Thread();
Thread t5= new Thread();

t1.start();
t2.start();
t3.start();
t4.start();
t5.start();
System.out.println( Thread.activeCount());*/
employee1 m = new employee1("manohar");
manager m1=new manager("mannuva");
m.start();
m1.start();
 System.out.println( Thread.activeCount());


    }
}
class employee1 extends Thread{
    public employee1(String tName){
        super(tName);
    }
    @Override
    public void run(){
        System.out.println("manohar " +Thread.currentThread().getName());
    }}
    class manager extends Thread{
        public manager(String tname){
            super(tname);
        }
        @Override
    public void run(){
        System.out.println("hello  "  +Thread.currentThread().getName());
        

    }
    }


