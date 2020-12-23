
public class StaticVar {

	String name;
	String address;
	int age;
	static String city;
	
	StaticVar(String name,String address, int age)
	{
		this.name=name;
		this.address=address;
		this.age=age;
		
	}
	
	public static void PrintCity()
	{
		System.out.println(city);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StaticVar a = new StaticVar("Bob", "Ramnagar", 50);
		System.out.println();
		StaticVar.city = "Bangalore";
		
		System.out.println(a.city);
		
		a.PrintCity();
		StaticVar.PrintCity();
		
		StaticVar b = new StaticVar("Ram", "NewBangalore", 34);
		
		b.city = "Chennai";		
		a.PrintCity();
		
		
		
		

	}

}
