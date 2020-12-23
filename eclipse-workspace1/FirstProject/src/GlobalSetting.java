import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalSetting {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream("C:\\Users\\hrish\\eclipse-workspace1\\FirstProject\\src\\data.properties");
		prop.load(fis);
		String b = (String) prop.getProperty("browser");
		System.out.println(b);
		
		prop.setProperty("browser", "Firefox");
		FileOutputStream fos = new FileOutputStream("C:\\Users\\hrish\\eclipse-workspace1\\FirstProject\\src\\data.properties");
		prop.store(fos, "browser");
		
	b = (String) prop.getProperty("browser");
		System.out.println(b);
		
		
		
		
		
	}

}
