import java.io.File;
import  java.io.FileOutputStream;
import java.util.Properties;
public class propfile {
    public static void main(String[] args) throws Exception{
        File file = new File("DBConfig.properties");
        System.out.println(file.exists());
        if(!file.exists()){
            file.createNewFile();
        }
        System.out.println(file.exists());
        Properties pro = new Properties();
        pro.setProperty("url","localhost");
        pro.setProperty("username","manoharmannuva");
        pro.setProperty("password","manu1234");
    
    FileOutputStream fos = new FileOutputStream(file);
    pro.store(fos,"");
    
}}
