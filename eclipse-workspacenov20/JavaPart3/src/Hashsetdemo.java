import java.util.HashSet;
import java.util.Iterator;

public class Hashsetdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> h  = new HashSet<String>();
 h.add("India");
 h.add("Australia");
 h.add("Azerbaijan");
 h.add("UK");
 h.add("Armenia");
 
 System.out.println(h);
 
 h.remove("UK");
 System.out.println(h);
 
 boolean ifcontains = h.contains("Armenia");
System.out.println(ifcontains);


Iterator i = h.iterator();

while(i.hasNext())
{
	System.out.println(i.next());
}


	}

}
