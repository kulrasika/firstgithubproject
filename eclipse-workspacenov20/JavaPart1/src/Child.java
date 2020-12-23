
public class Child extends Parent{
	
	public Child()
	{ super();		
	  System.out.println("Im a Child Constructor");
	}
	int i = 20;
	
	public void Calculate()
	{
		int i = 100;
		System.out.println("Object Value:"+this.i);
		System.out.println("Local Value:"+i);
	}
	
	
	
	public void Print()
	{
		super.Print();
		System.out.println("Im in Child class");
	}
	
	public void PrintParentData()
	{
		System.out.println(super.i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		Child a = new Child();
		Parent b = new Child();
		
		System.out.println(a.i);
		
		System.out.println(b.i);
		

	a.Print();
	b.Print();
	
	a.PrintParentData();
	
a.Calculate();
	
	}

}