package strings;

import java.util.*;
import java.lang.*;
import java.io.*;

public class RotateString {
    // public static int isCyclicRotation(String p, String q)  {

        
        public static boolean  rev(String a, String b){


         
             String n="";
             n+=a.charAt(a.length()-1);
            for(int i=0;i<a.length()-1;i++)
            {
               n += a.charAt(i);
            }
            System.out.println(n);
            if(n.equals(b))
            	return true;
            else
            return 	false;
        }   
    
  public static void main(String[] args)
    {
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      try
      {
      String a=br.readLine();
      
      String b=br.readLine();
	 boolean res= rev("hello","ohell");
	 if(res)
	 {
		 System.out.println("1");
		 
	 }
	 else
		 System.out.println("0");
      }
      catch(IOException e)
      {
    	  e.printStackTrace();
      }
     
    	   
    }
}