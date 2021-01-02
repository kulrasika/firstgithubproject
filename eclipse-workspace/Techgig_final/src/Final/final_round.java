package Final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.Stack;

public class final_round {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//I just added few comments
		
		int r ;
		int c ;
		
		Scanner input = new Scanner(System.in);	
		String inputdimension = input.nextLine();
		String[] tempdimension = inputdimension.split(" ");
		
		r = Integer.parseInt(tempdimension[0]);
		c = Integer.parseInt(tempdimension[1]);
		
		final_round fr = new final_round();
		
		fr.Validaterow(r);
		fr.Validatecolumn(c);
		
		int matrix[][] = new int[r][c];
		//int testmatrix[][] = matrix.clone();
		
		//reading matrix now
		
		String inputvalue;
		
		for(int i=0;i<r;i++)
		{
			inputvalue = input.nextLine();
			String[] temp = inputvalue.split(" ");
			
			for(int j=0;j<c;j++)
			{
				if(temp[j].equals("1")|| temp[j].equals("0"))
				matrix[i][j]= Integer.parseInt(temp[j]);	
				else
				throw new NumberFormatException("Value of coding belt input is out of desired range");
				
							
			}
		}
		
		
		
		
		
		
		
		Stack<Integer> stack = new Stack<Integer>();
		ArrayList<Integer> lengthofchains = new ArrayList<Integer>();
		
		for (int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				if(matrix[i][j]==0)
				break;
				
				if(matrix[i][j]==2)
				break;
				
				if(matrix[i][j]==1)
				{
					int count = 0;
					
					while(!stack.isEmpty() ||  matrix[i][j]==1)
					{
						
					int current;
									
					if(matrix[i][j]==2)
					{
						current = stack.pop();
						i = current/10;
						j = current%10;
					}
					
												
					if(((j+1)<c) && (matrix[i][j+1]==1)&& !stack.contains((i*10+(j+1))))
						stack.push(i*10+(j+1));	
					
					if(((i+1)<r) && ((j+1)<c) && matrix[i+1][j+1]==1 && !stack.contains(((i+1)*10)+(j+1)))
						stack.push(((i+1)*10)+(j+1));
					
					if(((i+1)<r) && matrix[i+1][j]==1 && !stack.contains((i+1)*10+(j)))
						stack.push((i+1)*10+(j));
					
					if(((i+1)<r) && (j-1)>=0 && matrix[i+1][j-1]==1 &&!stack.contains((i+1)*10+(j-1)))
						stack.push((i+1)*10+(j-1));
					
					if((j-1)>=0 && matrix[i][j-1]==1 &&!stack.contains((i)*10+(j-1)))
						stack.push((i)*10+(j-1));					
					
					if(((i-1)>=0) && ((j-1)>=0) && matrix[i-1][j-1]==1 && !stack.contains(((i-1)*10)+(j-1)))
						stack.push(((i-1)*10)+(j-1));
					
					if((i-1)>=0 && matrix[i-1][j]==1 &&!stack.contains((i-1)*10+(j)))
						stack.push((i-1)*10+(j));
					
					if(((i-1)>=0) && (j+1)<c && matrix[i-1][j+1]==1 &&!stack.contains((i-1)*10+(j+1)))
						stack.push((i-1)*10+(j+1));
					
					if(matrix[i][j]==1)
					matrix[i][j]=2;
					
					
					
					count++;
					
					}
					
					lengthofchains.add(count);
				}
				
				
				
			}
		}
		
		
		Collections.sort(lengthofchains);
		
		System.out.println(lengthofchains.get(lengthofchains.size()-1));
		
		
		
	
	
	}
	
	public int row,column;
	
	public void Validaterow(int row)
	{
		this.row = row;
		
		if (row<1)
			throw new IllegalArgumentException("Value of row is out of desired range");
		
		
	}
		
	public void Validatecolumn(int column)
	{
		this.column = column;
		
		if (column>10)		
		throw new IllegalArgumentException("Value of column is out of desired range");
	}

}
