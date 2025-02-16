package tests;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.regex.Pattern;

public class HashSetText {
  
  public static void main(String[] args) {
    Set<String> result = new HashSet<String>();
    result.add("UDRVAS");
    result.add("ANDINO");
    
    Scanner scanner;
    try {
      scanner = new Scanner(new File("src/utils/red_txt.txt"));
      scanner.useDelimiter(Pattern.compile("[\\r\\n;]+"));
      
      while (scanner.hasNext()) {
        String str = scanner.next();
        System.out.println(str);
      }
      
    } catch (FileNotFoundException e) {
      
      e.printStackTrace();
    }
    
    
    
  }

}
