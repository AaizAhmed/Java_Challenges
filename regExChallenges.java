package Java_Challenges;

public class regExChallenges 
{
	public String convertToRoman (int num)
	{		
		/* 
		   '\0' is the null character in Java.
		    so replace("\0", "I"); means replace all the null characters with I.
		    Can not use replace(null, "I"); it gives an error.		    		    
		    String ( charArray ) is a String constructor which converts char array to a String. 
		*/		
		
		String roman =  new String(new char[num]).replace("\0", "I");
	    
		roman = roman.replaceAll("IIIII", "V").replaceAll("IIII", "IV").replaceAll("VV", "X")
				     .replaceAll("VIV", "IX").replaceAll("XXXXX", "L").replaceAll("XXXX", "XL")
				     .replaceAll("LL", "C").replaceAll("LXL", "XC").replaceAll("CCCCC", "D")
				     .replaceAll("CCCC", "CD").replaceAll("DD", "M").replaceAll("DCD", "CM");
		
		return roman;
	}
	
	public int convertToDecimal (String roman)
	{		
		roman = roman.toUpperCase();
		
		roman = roman.replaceAll("CM", "DCD").replaceAll("M", "DD").replaceAll("CD", "CCCC")
				     .replaceAll("D", "CCCCC").replaceAll("XC", "LXL").replaceAll("C", "LL")
				     .replaceAll("XL", "XXXX").replaceAll("L", "XXXXX").replaceAll("IX", "VIV")
				     .replaceAll("X", "VV").replaceAll("IV", "IIII").replaceAll("V", "IIIII");
		
		return roman.length();
	}
	
	public static void main (String args [] )
	{
		regExChallenges learn = new regExChallenges();
		
		System.out.println( learn.convertToRoman(3999) );
		System.out.println( learn.convertToDecimal("DCXLIX") );
		
	}

}
