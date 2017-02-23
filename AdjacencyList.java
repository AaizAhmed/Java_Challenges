package Java_Challenges;

import java.io.FileInputStream;
import java.util.*;
import java.util.Map.Entry;

public class AdjacencyList {
		
	private Map<Integer, ArrayList<Integer>> dict = new Hashtable<Integer, ArrayList<Integer>>();
	private int employeeListLength;
	
	/**
	 * This method reads the file and separate words form other charters.
	 * @param string
	 */
	private String[] fileReader(String string) {			

		String input = "";
		String[] list = null;
		
		//Reading file.
		try {
			
			FileInputStream stream = new FileInputStream(string);
			Scanner scan = new Scanner(stream);	
			
			while (scan.hasNext()) 
			{
				//Reading the file line by line as a String
				input += scan.next() + ",";		
			} 
			
			//Parsing the string input using the comma
			list = input.split(",");
			
			scan.close();
			return list; 
		}		
		
		catch(Exception e) {
			
			System.out.println ("Input problem, File not found. Returning a \"null\" string array.");
			return null;
		}
		
	}

	public Map<Integer, ArrayList<Integer>> getList(String list_1, String list_2) {
		
		//Storing the employee and friendship data in string arrays.
		
		String [] employeeList = fileReader(list_1);
		int list_1_length = fileReader(list_1).length;
		employeeListLength = list_1_length;
		
		String [] friendshipList = fileReader("friendship.csv");
		int list_2_length = fileReader(list_2).length;
		
		// Getting the employee IDs from employeeList array, starting at index three.
		// The value to i is incremented by three in each iteration.
		for (int i = 3; i < list_1_length; i += 3) {
			
			// Converting string to an integer value
			int tmp = Integer.parseInt(employeeList[i] );
			
			// Adding a new ArrayList corresponding to an employee ID
			dict.put(tmp, new ArrayList<Integer>() );
		}
		
		// Going over friendship list and adding 2 employees in the map.
		for (int i = 2; i < list_2_length; i+= 2) {
			
			if (i + 2 <= list_2_length) {
					
				int id_1 = Integer.parseInt(friendshipList[i] );
				int id_2 = Integer.parseInt(friendshipList[i+1] );
				
				// Adding employees in their friendship list based on the information in friendship.csv
				((ArrayList<Integer>) dict.get(id_1)).add(id_2);
				((ArrayList<Integer>) dict.get(id_2)).add(id_1);
			}
		}
				
		return dict;
	}
	
	private String ArrayListToString (ArrayList<Integer> friends) {
		
		String str = "";
		
		if ( friends.size() == 0 ) {
			
			str += "None";
		}
		
		for (int i = 0; i < friends.size(); i++) {
			
			str += friends.get(i); 
			
			 if ( (i + 1) < friends.size() ) {
				 
				 str += ", ";			  
			 }
		}
		
		return str;
	}
	
	public void printList () {
		
		String [] str = new String [employeeListLength]; 
		int i = 0;
		
		// Iterating over the AdjecencyList/Map of the employees
		for(Entry<Integer, ArrayList<Integer>> e : dict.entrySet())
		{
			str[i] = e.getKey() + ": " + ArrayListToString( e.getValue() );
			i++;
		}	
		
		//Printing the string array in reverse order to get the desired output in acceding order. 
		for (i = i-1; i >= 0; i--) {
			
			System.out.println(str[i]);
		}
	}

	public static void main(String[] args) {
		
		AdjacencyList list = new AdjacencyList();
				
		list.getList("employee.csv", "friendship.csv");
		
		list.printList();		
	}

}
