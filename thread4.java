
public class thread4 {
 
     
 

 public static void main(String[] args)throws InterruptedException  {
    Runnable r = () -> {
       // for(int i=0;i<10;i++){

        System.out.println("hello mannuva "+Thread.currentThread().getName() +">>" + Thread.currentThread().getId());
        
    
      //  }
 };
Runnable r2 = ()   ->{
   // for(int i=0;i<10;i++){



        System.out.println("hello manohar"+Thread.currentThread().getName());
   // }   
};


Thread t1 = new Thread(r);
System.out.println(t1.getState());
t1.start();
System.out.println(t1.getState());
Thread.sleep(10000);

Thread t2 = new Thread(r2);
t2.start();
System.out.println(Thread.activeCount());
System.out.println(t1.getState());

}
}
/* 
class employee1 implements Runnable{
    
        
   
    @Override
    public void run(){
        System.out.println("manohar " +Thread.currentThread().getName());
    }}
    class manager implements Runnable{
       
        @Override
    public void run(){
        System.out.println("hello  "  +Thread.currentThread().getName());
        

    }
    }


 
    

*/
    


    

