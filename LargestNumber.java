package Java_Challenges;

import java.util.Map;
import java.util.TreeMap;

public class LargestNumber {  
		
	/*
	 * Write a function that given a list of non negative integers, 
	 * arranges them such that they form the largest possible number. 
	 * For example, given [50, 2, 1, 9], the largest formed number is 95021.
	 */

	public String largest (int[] list)
	{
		Map<Integer, Integer> map = new TreeMap<Integer, Integer>(); 

		for (int i = 0; i < list.length; i++)
		{
			int leftDigit = leftMostDigit (list[i]);
			
			//System.out.println(leftDigit + " " + list[i]);
			
			map.put(leftDigit, list[i]);
			
			//System.out.println( leftDigit + " " + map.get(leftDigit) );
		}
				
		int[] sortedList = new int [list.length]; 
		int i = list.length-1;
		
		for (Integer digit : map.keySet()) 
		{
			sortedList[i] = map.get(digit);				
			//System.out.println( digit + " " + map.get(digit) );
			
		    i--;
		}
		
		String str = "";
		
		for (int j = 0; j < list.length; j++)
		{
			//System.out.println( sortedList[j] );
			str += sortedList[j];
		}
		
		return str;	
	}
	
	private int leftMostDigit (int num) {
		
		if (num > 9 && num < 100) 
		{
			return num/10;
		}
		else if (num > 99 && num < 1000)
		{
			return num/100;
		}
		
		return num;		
	}
	
	public static void main(String[] args) {
		
		LargestNumber num = new LargestNumber();
		
		/**
		 * NOTE: It is assumed that the list does not contain numbers beginning with a digit more then once.
		 *       Thus list can't contain more then 10 numbers. A solution with out this limitation
		 *       is being developed at the moment. 
		 */
		
		int[] list = {50, 2, 1, 9};
		int[] list2 = {3, 20, 40, 550, 8, 1, 6, 70, 9, 0};
		
		System.out.println( num.largest(list) );
		System.out.println( num.largest(list2) );	
	}

}
