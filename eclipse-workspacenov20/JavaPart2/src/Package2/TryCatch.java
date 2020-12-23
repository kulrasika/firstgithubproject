package Package2;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]= {1,2,3};
		int a = 4;
		
		int b = 0;
		
	 try {
		 System.out.println(x[4]);
		 int c = a/b;
		 System.out.println(c);
	 }
	 catch(ArithmeticException ae)
	 {
		 System.out.println("Your program has hit arithmatic error");
	 }
	 catch(ArrayIndexOutOfBoundsException abe)
	 {
		 System.out.println("ArrayIndex OutOfBounds Exception");
	 }
	 catch(Exception e)
	 {
		 System.out.println("Error!!");
	 }
	 
finally
{
	System.out.println("Closing all connections");
}
	}

}
