import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		HashMap<String,String> hp = new HashMap<String, String>();
		hp.put("India", "Delhi");
		
		
		hp.put("India", "Delhi");
		
		hp.put("Netherlands", "Den Hague");
		
		hp.put("Australia", "Canberra");
		
		hp.put("UK", "London");
		
		System.out.println(hp);
		
		System.out.println(hp.get("Inda"));

		hp.remove("UK");
		
		
		System.out.println(hp);
		
		System.out.println(hp.size());
		
		Set s = hp.entrySet();
		
		Iterator it = s.iterator();
		
	for (Entry e : hp.entrySet())
	{
		System.out.println(e.getKey());
		System.out.println("::");
		System.out.println(e.getValue());
	}
	
	
	
	while(it.hasNext())
	{
	Map.Entry mp = ( Map.Entry )it.next();
	System.out.println(mp.getKey());
	System.out.println(mp.getValue());                      
	Map.
	
	}
		
	}
		
		
	}

