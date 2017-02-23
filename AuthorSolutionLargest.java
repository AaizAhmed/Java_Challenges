package Java_Challenges;

import java.util.Arrays;
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
		Integer[] list = {50, 2, 1, 9};
		Integer[] list2 = {3, 20, 40, 550, 8, 1, 6, 70, 9, 0};
			
		AuthorSolutionLargest solution = new AuthorSolutionLargest ();
		
		Arrays.sort(values, solution);	
		Arrays.sort(list, solution);
		Arrays.sort(list2, solution);
		
		solution.printLargest(values);
		solution.printLargest(list);
		solution.printLargest(list2);		
	}
}    