public class switchadj {
    public static void main(String[] args) {
        String day = "sat";
        switch (day){
            case  "mon","tues","wed","thurs","fri"->System.out.println("ufff");
            case "sat","sun" -> System.out.println("yehhh");     
            default -> System.out.println("no day");
        }
    }
    
}
