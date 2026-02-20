public class pojo {
   private  int id;
   public String name;
   protected double salary;
   public pojo(){
    System.out.println("hello manohar");
   }
   public pojo(int id){
    this.id=id;
   }
   public void setID(int id){
    this.id=id;

   }
   public int getID(){
    return id;
   }
    
}
