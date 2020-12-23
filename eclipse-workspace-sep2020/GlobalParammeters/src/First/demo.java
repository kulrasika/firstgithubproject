package First;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class demo {
	
	public static void main(String[] args)throws IOException {

		Properties p = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\hrish\\eclipse-workspace\\GlobalParammeters\\src\\First\\data.properties");
		p.load(file);
		System.out.println(p.getProperty("browser")); 
		System.out.println(p.getProperty("url")); 
		p.setProperty("browser", "chrome");
		FileOutputStream fos =new FileOutputStream("C:\\Users\\hrish\\eclipse-workspace\\GlobalParammeters\\src\\First\\data.properties");
		p.store(fos, null);
		
	
	}
}
