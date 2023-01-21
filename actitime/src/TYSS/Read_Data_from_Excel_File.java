package TYSS;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Read_Data_from_Excel_File {

	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("./src/test/resources/Commondata.properties");
		Properties p = new Properties();
        p.load(fis);
        
        String url = p.getProperty("URL");
        String Br = p.getProperty("Browser");
        String email= p.getProperty("Email");
        String pass = p.getProperty("Password");
        
        System.out.println(url);
        System.out.println(Br);
        System.out.println(email);
       System.out.println(pass);

}
}
