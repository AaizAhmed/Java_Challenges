package Java_Challenges;

/*
 * Write a function that combines two lists by alternatingly taking elements. 
 * For example: given the two lists [a, b, c] and [1, 2, 3], the function should return [a, 1, b, 2, c, 3].
 */

public class CombineLists {
	
	public static String [] Combine (String[] list1, String [] list2) {
		
		int length = list1.length + list2.length;
		String[] tmp = new String[length];

//-------------------------One Solution------------------
//		for (int i = 0; i < list1.length; i++) 
//		{
//			tmp[i*2] = list1[i]; 
//		}
//		
//		for (int i = 0; i < list2.length; i++) 
//		{
//			int index = i*2 + 1;
//			
//			tmp[index] = list2[i]; 
//		}
//-------------------------------------------------------
		
		for (int i = 0; i < length; i++) 
		{
			if ( i % 2 == 0) 
			{
				tmp[i] = list1[i/2];
			}
			else
			{
				tmp[i] = list2[i/2];
			}
		}
		
		return tmp;
	}

	public static void main(String[] args) {
		
		String[] a = {"a", "b", "c", "d", "e"};
		String[] b = {"1", "2", "3", "4", "5"};
		
		int length = a.length + b.length;
		
		String[] finalList = CombineLists.Combine(a, b);
		
		for (int i = 0; i < length; i++)
		{
			System.out.println(finalList[i]);
		}

	}

}
