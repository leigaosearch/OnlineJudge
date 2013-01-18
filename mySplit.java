import java.util.*;
import java.io.*;

public class Solution {    

    public static void main(String args[] ) throws Exception {
      
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        String line2 = br.readLine();
        
        mySplit(line, line2);
        
      
    }
  
  
public static String[] mySplit(String a, String delimeters) {

  int begin = 0;
  int end = 0;
  String[] tokens = new String[3]; 
  
  a += delimeters.charAt(0);
  
  for(int i=0; i<a.length(); i++)
  {
    begin = i;
    end = begin;
    while(!isDelimeter(a.charAt(i),delimeters))
    {
      i++;
    }
    
    end = i;
    
   System.out.println(a.substring(begin, end));
  }
  
  return tokens;
}

public static boolean isDelimeter(char ch, String delimeters)
{
  for(int i=0; i<delimeters.length(); i++)
  {
    if(ch == delimeters.charAt(i)) { return true; }
  }
  
  return false;
}
    

}
