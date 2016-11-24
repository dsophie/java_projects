package anagrams;

/*
* Class Main, runs the Solver Class 
* 
* @author: Sophie Delaux
* @version: 24/11/2016
*/

public class Main 
{

	public static void main(String[] args) 
	{
		//pass the input string as an argument
		Solver solve = new Solver("Seth Rogan ? Gathers No");
		System.out.println(solve.searchAnagram());
	}

}
