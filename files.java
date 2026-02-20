import java.io.File;
import java.io.IOException;
import java.util.Arrays;


public class files {
    public static void main(String[] args)throws IOException {
        File m = new File("C:\\java pratice");
       System.out.print(Arrays.toString( m.listFiles()));
      //  if(m.exists())
      //  m.delete();

         //System.out.println(m.exists());
      // System.out.println(m.isHidden());
         //System.out.println(m.delete());
    }
    
}
