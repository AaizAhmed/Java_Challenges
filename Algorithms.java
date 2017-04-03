package Java_Challenges;

import java.util.ArrayList;

public class Algorithms
{
   private static boolean isPrime(int num)
   {    
      if (num < 2) 
      {
         return false;
      }
      
      for (int divideBy = 2; divideBy <= Math.sqrt(num); divideBy++ )
      {
         if (num % divideBy == 0)
         {
            return false;
         }
      }           
      
      return true;
   }
   
   private static int nextPrime(int num)
   {      
      for (int index = num; true; index++)
      {
         if (isPrime(index))
         {
            return index;
         }
      }

   }
   
   private static ArrayList<Integer> primeFactors(int num)
   {
      ArrayList<Integer> factors= new ArrayList<Integer>();
      
      for (int index = 2; index < num; index++)
      {
         if (isPrime(index))
         {
            if (num % index == 0)
            {
               factors.add(index);
            }
         }
      }
      
      return factors;
   }
   
   private static int nthFib(int num)
   { 
      int first = 0;
      int second = 1;
      int next = 0;
      
      if (num == 1)
      {
         return first;
      }
      if (num == 2)
      {
         return second;
      }
      
      for (int count = 3; count <= num; count++)
      {
         next = first + second;
         first = second;
         second = next;
      }
      
      return next;
   }
   
   private static int findGCD (int numOne, int numTwo)
   {
      int gcd = 1;
      
      int smaller = Math.min(numOne, numTwo);
      
      for (int divideBy = 2; divideBy <= smaller; divideBy++)
      {  if (numOne % divideBy == 0)
         {  if (numTwo % divideBy == 0)
            {   gcd = divideBy;
            }
         }
      }
      
      return gcd;
   }
   
   public static void main(String[] args)
   {    
      System.out.println( findGCD(100, 50) );
      
   }

}
