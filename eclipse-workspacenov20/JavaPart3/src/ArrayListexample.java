import java.util.ArrayList;

public class ArrayListexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 ArrayList<String> a = new ArrayList<String>();
 a.add("Rahul");
 a.add("Jay");
 a.add("Lisa");
 a.add("Emily");
 
 System.out.println(a);
 a.add(1, "Jim");
 System.out.println(a);
 
 a.remove(0);
 System.out.println(a);
 //a.removeAll(a);
 
 
 System.out.println(a.indexOf("Emily"));
 System.out.println(a.isEmpty());
 System.out.println(a.contains("Jim"));
 System.out.println(a.lastIndexOf(a));
ArrayList<Integer> b = (ArrayList<Integer>) a.clone(); 
System.out.println(b);
 System.out.println(a.size());
	}

}
