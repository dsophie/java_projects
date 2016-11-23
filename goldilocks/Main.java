package goldilocks;

/*
 * Class Main for running the Finder
 * 
 * @author: Sophie Delaux
 * @version: 23/11/2016
 */

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main 
{
	public static void main(String[] args) throws FileNotFoundException 
	{
		Finder find = new Finder();
		ArrayList<Integer> r = find.getSeats();
		
		Collections.sort(r); //sorting
		
		for (int i = 0; i < r.size(); i++)
		{
			System.out.print(r.get(i) + " "); //printing of each seat possible for Goldilocks
		}
	}

}
