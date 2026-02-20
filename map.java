import java.util.*;
public class map {
    public static void main(String[] args) {
        Map<Integer,String> m = new LinkedHashMap<>();
        m.put(523326,"tpkm");
        m.put(1234565,"hyd");
        m.put(7569333,"manu");
        Set<Integer> keys = m.keySet();
        for(Integer key:keys){
            System.out.println(key);

        }
        Collection<String> values = m.values();
        for(String Value : values){
            System.out.println(Value);

        }
        System.out.println(m.get(523326));
        for(Integer Key:keys){
            System.out.println(Key+">>>>"+m.get(Key));
        }
        
    }

    
}
