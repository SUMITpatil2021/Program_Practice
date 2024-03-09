package strings;

import java.util.*;
import java.lang.*;
import java.io.*;
public class CountCharStr {

	public static void main(String []args)
	{
		BufferedReader br=new  BufferedReader(new InputStreamReader(System.in));
		try
		{
			String str=br.readLine();
//			int cnt=0;
//			for(int i=0;i<str.length();i++)
//			{
//				cnt++;
//			}
			System.out.println("Count= "+str.length());
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
}
