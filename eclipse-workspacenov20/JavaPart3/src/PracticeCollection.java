import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class PracticeCollection {
	
	public static void main(String[] args)
	
	{
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		ArrayList<Integer> numbersdone =  new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(5);
		numbers.add(5);
		numbers.add(6);
		numbers.add(2);
		numbers.add(8);
		numbers.add(3);
		numbers.add(5);
			
		int count = 0;

		int numbertocheck=999;
		
		HashMap<Integer,Integer> data = new HashMap<Integer,Integer>();
		boolean addelement = true;
		
		for(int i=0;i<8;i++)
		{
			numbertocheck =numbers.get(i);
			count = 1;
			
			if(!numbersdone.contains(numbertocheck))
			{//Starting with each element
				addelement = true;	
				for (int k=i+1;k<8;k++)
				{
				
					if(numbers.get(k)==numbertocheck)
					{ 
						count++; 
						numbersdone.add(numbers.get(k));
					}
				  
				}
			}
			else
			{				addelement=false;		}
			
		if(addelement)	
		{
		System.out.println(numbertocheck +"::::"+ count);
		data.put(numbertocheck,count);
		}
	}
		
		System.out.println("Following are the numbers with the times they repeated");
		for(Integer key:data.keySet())
		{
			System.out.println("Number:  "+ key);
			System.out.println("Times repeated:  "+ data.get(key));
		}
		//System.out.println(data);
		
	}

}
