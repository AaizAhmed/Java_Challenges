package Java_Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class AuthorSolutionLargest implements Comparator<Integer>{
	
	@Override
	public int compare(Integer X, Integer Y)
	{		
		String x = X.toString();
		String  y = Y.toString();

		// Now see which of the two formed numbers is greater
		return (x + y).compareTo(y + x) * -1;
	}

	private void printLargest(Integer[] arr)
	{
		String result = "";
		
		for (Integer x : arr) 
		{	 
			result += x.toString();	
		}
		
		System.out.println(result);
	}
	
	public static void main (String [] args)
	{
		Integer[] values = {45, 4};
		
		AuthorSolutionLargest solution = new AuthorSolutionLargest ();
		
		Arrays.sort(values, solution);	
		
		solution.printLargest(values);
		
	}
}    