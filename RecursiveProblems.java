package Java_Challenges;

public class RecursiveProblems {

	public int factorial(int n) {
		  
		  if (n == 1) {
		    
		    return n; 
		  }
		  else {
			  
		  return n * factorial (n-1);
		  }
		}
	
	public int bunnyEars(int bunnies) {
	
		if (bunnies == 0) return 0;
		
		return bunnies * 2;
	}

	/**
	 * Calculate the sum of first n Fibonacci number
	 * NOTE: Exponential run time
	 * @param n
	 * @return sum
	 */
	public int fibonacciSum (int n) 
	{		  
		  if (n == 0) 
		  {			  
			  return 0;
		  }
		  else if (n == 1) 
		  {			  
			  return 1;
		  }
		  else 
		  {		  
			  return fibonacciSum (n-1) + fibonacciSum (n-2); 
		  }		  
	}

	public int bunnyEars2(int bunnies) {
		
		if (bunnies == 0) return 0;
		else if (bunnies % 2 == 1) return bunnyEars2 (bunnies-1) + 2;
		else if (bunnies % 2 == 0) return bunnyEars2 (bunnies-1) + 3;
		
		return bunnies;
	}
	
	public int sumDigits(int n) {
		  
		if (n < 10)  return n;
			
		return sumDigits(n/10) + n % 10;
	}
	
	 public int fib(int n)
	    {
	        int a = 0, b = 1, c;
	        if (n == 0)
	            return a;
	        
	        for (int i = 2; i <= n; i++)
	        {
	            c = a + b;
	            a = b;
	            b = c;
	        }
	        return b;
	    }
	
	public static void main (String[] args) {
		
		RecursiveProblems rp = new RecursiveProblems();		
		
		long time = System.currentTimeMillis();
		//System.out.println( rp.fibonacciSum(49) );
		System.out.println("Time: " + (System.currentTimeMillis() - time) );
		
		time = System.currentTimeMillis();
		System.out.println( rp.fib(50) );
		System.out.println("Time: " + (System.currentTimeMillis() - time) );
	}
	
}
