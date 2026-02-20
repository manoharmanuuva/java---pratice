public class thisjava {
    int age=23;
    public static void main(String[] args) {
        thisjava t = new thisjava();
       
        t.setage(30);
        System.out.println(t.getage());

    }
   public int getage(){
    return age;
   } 
    
    public int setage(int age){
      this.age=age;
        return age;
    }

    
}
