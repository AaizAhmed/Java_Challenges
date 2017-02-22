/**
 * Converting upper case to lower case and vice versa.
 */
package Java_Challenges;

//import for Scanner and other utility classes
import java.util.*;

public class InputProblems 
{
	public static void main(String[] args) 
	{		
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
		String line = scan.nextLine();
				
		int length = line.length();		
		String output = "";
			
		for (int i = 0; i < length; i++) 
		{
			char c = line.charAt(i);
			String l = "";
			
			//Adding space in the sentence.
			if (c == 32) { output += " "; }
			
			if (c >= 65 && c <= 90) 
			{	
				l += c;				
				l = l.toLowerCase();
				output += l;				
				l = "";
			}
			else 
			{			
				if (c >= 97 && c <= 122) 
				{	
					l += c;					
					l = l.toUpperCase();
					output += l;					
					l = "";
				}
			}
		}
		
		System.out.println(output);
	}
}
