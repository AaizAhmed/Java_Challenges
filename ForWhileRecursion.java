package Java_Challenges;

/*
 * Write three functions that compute the sum of the numbers in a given list 
 * using a for-loop, a while-loop, and recursion.
 */

public class ForWhileRecursion 
{
	
	public int sumForLoop ( int [] list ) 
	{
		int sum = 0;
		
		for (int i = 0; i < list.length; i++) {
			
			sum += list[i];
		}
		
		return sum;
	}
	
	public int sumWhileLoop ( int [] list ) 
	{
		int sum = 0;
		
		int i = 0;
		while (i < list.length) 
		{
			sum += list[i];
			i++;
		}
		
		return sum;
	}

	public int sumRecursion ( int [] list, int index ) 
	{
		 if (index == list.length) 
		 {			 
			 return 0;
		 }
		 //Now it's time for the recursion
		 else 
		 {
			 return list[index] + sumRecursion (list, index + 1);
		 }
	}
	
	public static void main(String[] args) 
	{
		ForWhileRecursion test = new ForWhileRecursion();
		
		int [] list = {1, 2, 3, 4, 5};
		
		System.out.println(test.sumForLoop(list) );
		
		System.out.println(test.sumWhileLoop(list) );
		
		System.out.println(test.sumRecursion(list, 0) );

	}

}
