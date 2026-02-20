



public class obj {
    ;
int k;

if(k<18){
    System.out.println("the person are eligible to vote");

}else{
    System.out.println("the person not eligble to vote");
}
    int j = 2;
    public void manu(int amount){
        csestrenth= amount + csestrenth;
        System.out.println("the total strenth are"+csestrenth);
        
    }
    public void remove(int amount){
          csestrenth= amount -csestrenth;
          System.out.println("the total strenth are"+csestrenth);
                        
    }
    
    public obj(int a, int b){
        this.i=a;
        this.j=b;
        
    }
    public static void main(String[] args) {
        obj m = new obj(10,20);
        obj n = new obj(10, 20);
        
        System.out.println(m.i);
        System.out.println(m.j);
        System.out.println(n.i);
       
       m.manu(5);
       m.remove(2);
       System.out.println(m==n);
       



    }
}
