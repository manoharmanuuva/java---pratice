import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class filetext {
    public static void main(String[] args) throws IOException {
        File mano = new File("./manohar.txt");
        if(!mano.exists())
        mano.createNewFile();
        FileInputStream m = new FileInputStream(mano);
        int asciicode;
        while((asciicode=m.read())!=-1){
            System.out.print((char)asciicode);
        }
    }
    
}
