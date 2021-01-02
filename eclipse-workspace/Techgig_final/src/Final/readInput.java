package Final;

import java.util.Scanner;

public class readInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// I added comment from Y Guy
		
		Scanner input = new Scanner(System.in);
		
		
		String inputmatrix = input.nextLine();
		String[] temp = inputmatrix.split(" ");
		
		System.out.println(temp[0]);
		System.out.println(temp[1]);
		System.out.println(temp[2]);
		System.out.println(temp[3]);
		
		

	}

}
