package Java_Challenges;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
      ArrayList<Integer> factors = new ArrayList<Integer>();
      
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
   
   /**
    * We flip numbers in recursive call and at the end it will
    * always be 1%1 == 0
    * 
    * @param   numOne
    * @param   numTwo
    * @return  GCD
    */
   private static int findGCD_2 (int numOne, int numTwo)
   {  
      if(numTwo == 0)
         return numOne;
      else
         return findGCD_2(numTwo, numOne%numTwo);
   }
   
   private static void swapNumbers(int a, int b)
   {
      System.out.printf("Before swap: a = %d\tb = %d\n", a, b); 
 
//      All of these work!! ==> ^ is XOR 
      b = a ^ b;
      a = a ^ b;
      b = a ^ b;
      
//      a = a ^ b;
//      b = a ^ b;
//      a = a ^ b;
      
//      a = a-b;
//      b = b+a;
//      a = b-a;
      
//      b = b-a;
//      a = a+b;
//      b = a-b;
      
      System.out.printf("Before swap: a = %d\tb = %d\n", a, b);
   }

   private static Integer[] removeDuplicates(Integer[] array)
   {
      Set<Integer> mySet = new HashSet<Integer>();
      
      for (int index = 0; index < array.length; index++)
      {
         mySet.add( array[index] );
      }
       
      Integer[] finalArray = (Integer[]) mySet.toArray(new Integer[mySet.size()]);      
      return finalArray;
   }   

   private static Integer[] removeDuplicates_2(Integer[] array)
   {
      HashMap<Integer, Integer> mySet = new HashMap<Integer, Integer>();
      
      for (int index = 0; index < array.length; index++)
      {         
         mySet.put(array[index], 1);
      }      
           
      Integer[] finalArray = mySet.keySet().toArray(new Integer[mySet.size()]);   
      return finalArray;
   }   
   
   private static String reverseString(String str)
   {
      String reversed = new StringBuffer(str).reverse().toString();
      return reversed;
      
      // Can also use str.charAt(index) from last-1 to 0
      // reversed += str.charAt(index)
   }
   
   private static String reverseSentence(String str)
   {      
      String[] strArray = str.split(" ");
      String reversed = "";
      
      int end = strArray.length-1;
      for (int i = end; i >= 0; i--)
      {
         reversed += strArray[i] + " ";
      }
      
      return reversed;      
   }
   
   private static String reverseInPlace(String str)
   {
      String[] strArray = str.split(" ");
      String reverse = "";
      
      for (int index = 0; index < strArray.length; index++)
      {
         String tmp = new StringBuffer(strArray[index]).reverse().toString();
         reverse += tmp + " ";
      }
      
      return reverse;            
   }
   
   private static char firstNonRepeatingChar(String str)
   {
      LinkedHashMap<Character, Integer> countFreq = new LinkedHashMap<Character, Integer>();
      
      for (int index = 0; index < str.length(); index++)
      {
         char current = str.charAt(index);
         
         if (countFreq.get(current) != null)
         {
            int count = countFreq.get(current);
            countFreq.put(current, ++count);
         }
         else 
         {
            countFreq.put(current, 1);
         }
      }
      
      for (Entry<Character, Integer> entry : countFreq.entrySet()) 
      {
         char key = entry.getKey();
         int value = entry.getValue();
         
         if (value == 1)
         {
            return key;
         }
      }   
      
      return ' ';  
   }   

   private static String removeDuplicateChars(String str)
   {
      LinkedHashMap<Character, Integer> countFreq = new LinkedHashMap<Character, Integer>();
      
      for (int index = 0; index < str.length(); index++)
      {
         char current = str.charAt(index);
         
         if (countFreq.get(current) != null)
         {
            int count = countFreq.get(current);
            countFreq.put(current, ++count);
         }
         else 
         {
            countFreq.put(current, 1);
         }
      }
      
      String removed = "";
      
      for( Entry<Character, Integer> entry : countFreq.entrySet() ) 
      {
         char key = entry.getKey();
         int value = entry.getValue();
         
         if (value == 1)
         {
            removed += key;
         }
      }   
      return removed;
   }
   
   private static boolean isPalindrome(String str)
   {
      str = str.replaceAll("\\W", "");
      str = str.replaceAll("\\d", "");
      
      String reverse = new StringBuffer(str).reverse().toString();
      
      if (str.equalsIgnoreCase(reverse))
      {
         return true;
      }
      
      return false;            
   }
   
   private static int missingNum(int[] numbers)
   {
      // Sine 1 num missing get sum of length+1
      int n = numbers.length+1;
      int expectedSum = n*(n+1)/2;
      
      int sum = 0;      
      
      for (int index = 0; index < numbers.length; index++)
      {
         sum += numbers[index];
      }
      
      return expectedSum - sum;
   }

   private static boolean sumOfTwo(int[] numbers, int numTotal)
   {
      HashMap<Integer, Integer> diffMap = new HashMap<Integer, Integer>();
      int difference;
      
      for (int index = 0; index < numbers.length; index++)
      {
          difference = numTotal - numbers[index]; 
        
          if (diffMap.containsKey(difference))
          {
             return true;
          }
          else
          {
             diffMap.put(numbers[index], 1);
          }
      }
      return false;
   }
   
   private static int largestSum(int[] numbers)
   {
      Arrays.sort(numbers);      
      int n = numbers.length-1;
      
      return numbers[n]+numbers[n-1];
   }
   
   /**
    * Count number of zeros from 1 to N
    * 
    * @param   number
    * @return  total number of zeros
    */
   private static int countZeros(int number)
   {  
      int count = 0;
         
      while(number > 0)
      {
         count += number/10;
         number = number/10;
      }   
      
      return count;
   }
   
   private static void permute(String prefix, String permMe)
   {
      int n = permMe.length();
      
      if (n == 0)
      {
         System.out.println(prefix);
      }
      else
      {
         for (int index = 0; index < n; index++)
         {
            permute( prefix+permMe.charAt(index), 
                     permMe.substring(0, index)+permMe.substring(index+1, n));
         }
      }
   }
   
   private static void permute_2(String permMe, int first, int last)
   {
      if (first == last)
      {
         System.out.println(permMe);
      }
      else
      {
         for (int index = first; index <= last; index++)
         {
            permMe = swap(permMe, first, index);
            permute_2(permMe, first+1, last);
            permMe = swap(permMe, first, index);
         }
      }      
   }
   
   private static String swap(String str, int indexOne, int indexTwo)
   {
      char[] charArray = str.toCharArray();
      char temp = charArray[indexOne];
      charArray[indexOne] = charArray[indexTwo];
      charArray[indexTwo] = temp;      
      return String.valueOf(charArray);
   }
   
   private static int[] mergeArrays(int[] arrOne, int[] arrTwo)
   {
      
      int[] merged = new int[arrOne.length + arrTwo.length];
      
      int indexOne = 0, indexTwo = 0, mergeIndex = 0;
      
      while(indexOne < arrOne.length && indexTwo < arrTwo.length)
      {         
         if (arrOne[indexOne] < arrTwo[indexTwo])
         {
            merged[mergeIndex++] = arrOne[indexOne++];
         }
         else
         {
            merged[mergeIndex++] = arrTwo[indexTwo++];
         }
      }
      
      System.arraycopy(arrOne, indexOne, merged, mergeIndex, (arrOne.length-indexOne));
      System.arraycopy(arrTwo, indexTwo, merged, mergeIndex, (arrTwo.length-indexTwo));
      
      return merged;
   }   
   
   public static void main(String[] args)
   {     
      int[] myArr = new int[] {1, 2, 5, 7, 9};
      int[] myArr_1 = new int[] {1, 2, 4, 6, 8, 10};
      
      int[] myArr_2 = mergeArrays(myArr, myArr_1);
      
      for (int num: myArr_2)
      {
         System.out.println( num );
      } 

   }

}
