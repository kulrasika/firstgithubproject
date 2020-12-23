import java.util.Scanner;

public class techgig {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* 
		 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
		 * Your class should be named CandidateCode.
		*/


		    	//Write code here     
				int cards_with_misty;
				int cards_from_ash;
				int no_of_days;		        
				
				int testcasecount;
				
				
				
				
		        Scanner input = new Scanner(System.in);
		        
		        System.out.println("no of test cases\n");
		        testcasecount = Integer.parseInt(input.nextLine());
		        
		        techgig t = new techgig();
		        t.Validate_testcasecount(testcasecount);
		        
		        int[] TotalCards = new int[testcasecount];
		        int[][] testdata = new int[testcasecount][3];
		        /*int testcasecount = input.nextint();
		        int cards_with_misty = input.nextInt();
		        int cards_from_ash = input.nextInt();
		        int no_of_days= input.nextInt();
		        */
		        
		        
		        
		        for(int i=0; i< testcasecount;i++)
		        {
		        
		        System.out.println("Enter input");
		        String inputvalue = input.nextLine();
		        
		        System.out.println(inputvalue);
		      
		        String[] temp = inputvalue.split(" ");
		        
		        
		        System.out.println(temp[0]);
		        System.out.println(temp[1]);
		        System.out.println(temp[2]);
		        testdata[i][0] = Integer.parseInt(temp[0]);
		        testdata[i][1] = Integer.parseInt(temp[1]);
		        testdata[i][2] = Integer.parseInt(temp[2]);
		        		
		        
		        System.out.println(testdata[i][0]);
		        System.out.println(testdata[i][1]);
		        System.out.println(testdata[i][2]);
		        
		        
		        cards_with_misty = testdata[i][0];
		        
		        t.Validate_cards_with_misty(cards_with_misty);
		        
		        cards_from_ash = testdata[i][1];
		        
		        t.Validate_cards_from_ash(cards_from_ash);
		        
		        no_of_days = testdata[i][2];
		        
		        t.Validate_no_of_days(no_of_days);
		        
		        TotalCards[i] = cards_with_misty+(cards_from_ash*(no_of_days-1));
		        
		        System.out.println("Total Cards:"+TotalCards[i]);
		        	       
		        	        
		        }
		        
		        input.close();
		        

		   }

	public int value;
	
	public void Validate_testcasecount(int value)
    {
	//this.value = value;
    if ((value < 1)||(value > 100))
    throw new IllegalArgumentException("Value is out of range");
    }
	
	public void Validate_cards_with_misty(int value)
    {
	this.value = value;
    if ((value < 1))
    throw new IllegalArgumentException("Value is out of range");
    //return value;
    }
	
	public void Validate_cards_from_ash(int value)
    {
	this.value = value;
    if ((value > 100000) || (value < 0))
    throw new IllegalArgumentException("Value is out of range");
    //return value;
    }
	
	private void Validate_no_of_days(int value)
    {
	this.value = value;
    if ((value < 1) || (value > 100000))
    throw new IllegalArgumentException("Value is out of range");
    //return value;
    }
	
	
		}


