package Coleman_problem2;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Iterator;
import java.util.Scanner;
import java.util.*;

public class DuplicateCounter {
	
		public Map<String,Integer> WordCount = new HashMap<String,Integer>();
		Scanner sc = null;
		public void count(String dataFile)
		{

			
			
		  try
		  {
		   sc = new Scanner(new File(dataFile));
		  }
		  catch (FileNotFoundException e)
		  {
		   System.out.println(e());
		   
		  }
		  
		  
		  while(sc.hasNext())
		  {
		   String problem2 = sc.next().toLowerCase();   
		   Integer unique_word_counts = WordCount.get(problem2);
		   
		   if(unique_word_counts == null)
		   {
			   unique_word_counts = 1;
		   }
		   else
		   {
			   unique_word_counts = unique_word_counts + 1;
		   }
		   WordCount.put(problem2, unique_word_counts);
		  }
		  sc.close();
		}

		public char[] e() {
			return null;
		}


		

		public void write(String outputFile )
		{
		  try
		  {
		   PrintWriter sc = new PrintWriter(new File(outputFile ));
		  
		   for(String string : WordCount.keySet())
		   {
		    sc.println(string + " " + WordCount.get(string));
		   }
		   
		   
		   sc.close();  
		  }
		  catch (FileNotFoundException e)
		  {
		   System.out.println(e.getMessage());
		  }
		}
		}