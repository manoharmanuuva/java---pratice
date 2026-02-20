public class gb {

    public void finalize() {
        System.out.println("Garbage collected Manohar");
    }

    public static void main(String[] args) {
        gb g1 = new gb();
        gb g2 = new gb();
        gb g3= new gb();

        g1 = null;
        g2 = null;
        g3=g1;

        System.gc();

        
    }
}
