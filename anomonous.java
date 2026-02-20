public class anomonous {
    String m= "mannuva manohar";
    public void greet(){
        System.out.println("good morning my dear "+m);

    }
    public static void main(String[] args) {
        new anomonous().greet();
        anomonous r = new anomonous ();
        r.greet();
    }
    
}
