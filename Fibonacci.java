package Java_Challenges;

import java.math.BigInteger;

/*
 * Write a function that computes the list of the first 100 Fibonacci numbers. 
 * By definition, the first two numbers in the Fibonacci sequence are 0 and 1, 
 * and each subsequent number is the sum of the previous two. As an example, 
 * here are the first 10 Fibonnaci numbers: 0, 1, 1, 2, 3, 5, 8, 13, 21, and 34.
 */

public class Fibonacci {
	
	public static BigInteger[] FibonnaciSequence (int limit) 
	{
		BigInteger [] fib = new BigInteger[limit];
		
		// Adding first 2 numbers
		fib[0] = BigInteger.ZERO;
		fib[1] = BigInteger.ONE;
				
		if ( limit > 2)
		for (int i = 2; i < limit; i++)
		{
			fib[i] = fib[i-1].add(fib[i-2]);
			
		}
		
		return fib;
	}
	
	public static BigInteger FibSum(int n)
    {
		BigInteger a, b, c, d;
		
		a = BigInteger.ZERO;
		b = BigInteger.ONE;
		d = BigInteger.ONE;
		
        if (n == 0)
        {	return a;	}
        
        for (int i = 2; i < n; i++)
        {
            c = a.add(b);
            d = d.add(c);
            
            a = b;
            b = c;              
        }
        
        return d;
    }

	public static void main(String[] args) {
		
		BigInteger [] fib100 = Fibonacci.FibonnaciSequence(100);
	
		for (int i = 0; i < 11; i++)
		{
			System.out.println("Number " + (i + 1) + " is: " + fib100[i]);
		}
		
		System.out.println( Fibonacci.FibSum(5) );

	}

}
