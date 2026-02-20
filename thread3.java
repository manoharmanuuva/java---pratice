public class thread3 {
     
 

 public static void main(String[] args) {
    Runnable r = new Runnable(){
        @Override
    public void run(){
        System.out.println("hello mannuva "+Thread.currentThread().getName());
    }

};
Runnable r2 = new Runnable(){
    @Override
    public void run(){
        System.out.println("hello manohar"+Thread.currentThread().getName());
    }

};
Thread t1 = new Thread(r);
t1.start();
Thread t2 = new Thread(r2);
t2.start();

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
    

