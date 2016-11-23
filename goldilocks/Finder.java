package goldilocks;

/*
 * Class Finder 
 * 
 * @author: Sophie Delaux
 * @version: 23/11/2016
 */

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.security.KeyStore.Entry;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Finder 
{
	private Scanner inFile;
	private int weight; //weight of Goldilocks
	private int maxTemp; //maximum temperature of porridge for Goldilocks
	private HashMap<Integer, Integer> choices; //map of all the places 
	private HashMap<Integer, Integer> references; //map of the index numbers of the places
	private ArrayList<Integer> results; //list of chairs when Goldilocks can seat
	
	public Finder() throws FileNotFoundException
	{
		inFile = new Scanner(new FileReader("/Users/sophiedelaux/Desktop/input.txt"));
		choices = new HashMap<Integer, Integer>();
		references = new HashMap<Integer, Integer>();
		results = new ArrayList<Integer>();
		readInputFile();
	}
	
	/*
	 * Read the input, set the weight and temperature variables and populate the maps
	 */
	public void readInputFile()
	{
		 weight = inFile.nextInt();
		 maxTemp = inFile.nextInt();
		 int i = 1;
		 while (inFile.hasNextInt())
		 {
			 int chair = inFile.nextInt();
			 int porridge = inFile.nextInt();
			 
			 choices.put(chair, porridge);
			 references.put(chair, i);
			 i = i + 1;
		 }
	}
	
	/*
	 * Iterate through each choice of seat and check if the weight and temperature are acceptable
	 * If they are, add them to the result map using their index number
	 */
	public ArrayList<Integer> getSeats()
	{
		Iterator<Map.Entry<Integer, Integer>> entries = choices.entrySet().iterator();
		while (entries.hasNext())
		{
			Map.Entry<Integer, Integer> content = entries.next();
			int chair = content.getKey();
			int porridge = content.getValue();				
			
			if (chair >= weight && porridge <= maxTemp)
			{
				results.add(references.get(chair));
			}	
		}
		return results;
	}
	
	
}
