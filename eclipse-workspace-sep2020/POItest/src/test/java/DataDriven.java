import java.io.IOException;
import java.util.ArrayList;

public class DataDriven{
	
	public static void main(String [] args) throws IOException
	{
		FirstPOI fpoi = new FirstPOI();
		ArrayList data = fpoi.GetData("Purchase");
		
		System.out.println(data.get(0));
		System.out.println(data.get(1));
		System.out.println(data.get(2));
		System.out.println(data.get(3));
		
		
		
		
	}

	
}


	
