public class innerclass {
    private int m =10;
   public static void main(String[] args) {
      innerclass m1=new innerclass();
      test4 m2 =new innerclass().new test4();
      m2.hello();
   }
    public class test4{
        public void hello(){
            System.out.println(m);
            
        }


    }}

    