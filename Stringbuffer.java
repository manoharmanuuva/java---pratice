public class Stringbuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("hello manohar");
         System.out.println(sb.hashCode());
        sb= sb.append("how are you ?");
        System.out.println(sb.hashCode());
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
        String m= "manohar";
        System.out.println(m);
        System.out.println(m.hashCode());
        String m2 = m +"mannuva";
        System.out.println(m2);
        System.out.println(m2.hashCode());
        String m3 = "manoharmannuva";
        System.out.println(m2.equals(m3));
    System.out.println(sb);
}
}