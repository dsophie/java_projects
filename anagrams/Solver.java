package anagrams;

/*
* Class Solver 
* 
* @author: Sophie Delaux
* @version: 24/11/2016
*/
public class Solver 
{
	private String comp1; //first string 
	private String comp2; //second string
	
	public Solver(String input)
	{
		String[] inputArray = input.split("\\?"); //generate the 2 strings
		comp1 = inputArray[0].trim();
		comp2 = inputArray[1].trim();
	}
	
	public String searchAnagram()
	{
		String result = "";
		
		String letters = comp1.toLowerCase();
		String compared = comp2.toLowerCase();
		int counter = 0;
		
		for (int i = 0; i < letters.length(); i++)
		{
			String c = "" + letters.charAt(i);
			if (compared.contains(c)) //if the second string contains the character
			{
				counter ++; //increment counter
			}
		}
		
		if (counter == letters.length()) //if counter equals to length of the string
		{
			//the 2 strings are anagrams
			result = "\"" + comp1 + "\" is an anagram of \"" + comp2 + "\"";
		}
		else
		{
			result = comp1 + " is NOT an anagram of " + comp2;
		}
		
		return result;
	}
	
}
