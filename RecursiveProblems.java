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

	public int fibonacci(int n) {
		  
		  if (n == 0) {
			  
			  return 0;
		  }
		  else if (n == 1) {
			  
			  return 1;
		  }
		  else 
		  {		  
			  return fibonacci(n-1) + fibonacci (n-2); 
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
	
	public static void main (String[] args) {
		
		RecursiveProblems rp = new RecursiveProblems();		
		
		for (int i = 0; i < 10; i++)
			System.out.println( (i*10 + 26) + ":\t" + rp.sumDigits((i*10) + 26) );
	}
	
	
}
