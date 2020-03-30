package Coleman_Problem1;

import java.io.File;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.HashSet;
import java.util.Set;
import java.util.Scanner;
import java.util.*;

public class DuplicateRemover {

  public Set<String> uniqueWords = new HashSet<>();
   Scanner sc = null; 
   public void remove(String dataFile) {

       try {
           Scanner scan = new Scanner(new File(dataFile));

           while (scan.hasNext()) {

               uniqueWords.add(scan.next());
           }
           
           
           scan.close();
       } catch (FileNotFoundException e) {
           System.out.println(e);
       }

   }
   

   public void write(String outputFile) {
       try {
           PrintWriter sc = new PrintWriter(new File(outputFile));

           for (String string : uniqueWords) {

               sc.println(string);
           }
           sc.flush();
           
           
           
           sc.close();
           
       } catch (FileNotFoundException e)
       {
           System.out.println(e);
       }
   }
}