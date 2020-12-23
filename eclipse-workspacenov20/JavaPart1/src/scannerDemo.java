import java.util.Scanner;

public class scannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input =  new Scanner(System.in);
		
		int age;
		String name;
		char gender;
		
		 System.out.println("Name:");
	        name = input.next();
	        
	        System.out.println("Age");
	        age = input.nextInt();
	        
	        System.out.println("Gender");
	        gender = input.next().charAt(0);
	        
	        System.out.println(name + "\n"+age+"\n"+gender);
	}

}
