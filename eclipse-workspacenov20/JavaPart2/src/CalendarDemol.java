import java.text.SimpleDateFormat;
import java.util.Calendar;

public class CalendarDemol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Calendar c = Calendar.getInstance();
    SimpleDateFormat sdf = new SimpleDateFormat("M.d.yyyy");
    System.out.println((sdf.format(c.getTime())));
    
   
    

	}

}
