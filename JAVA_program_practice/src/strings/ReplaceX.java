
//Problem:
//
// given string and xvowels: abeiout
// if there are 2 or more than 2 consecutive two xvowels then rplace it with "X".
//
// Eaxmple:
//  inpute:"maaayrt"
//  output: "mXXayrt
//  Explanation: aaa are  consecutive xvowel so replace  aa with XX
//                Ans = mXXayrt
// */
package strings;

import java.util.Scanner;

public class ReplaceX {
	
	public static boolean isMyvowel(char ch)
	{

		if(ch=='a'||ch=='b'||ch=='i'||ch=='o'||ch=='u'||ch=='t')
			return true;
		return false;
	}
	public static String process(String str )
	{
		StringBuilder sb=new StringBuilder();
		int i=0;
		while(i<str.length())
		{
			int j=i;
			int cnt=0;
			while(j<str.length() && isMyvowel(str.charAt(j)))
			{
				j++;
				cnt++;
			}
			if(cnt<=1)
			{
				sb.append(str.charAt(i));
//				char c=str.charAt(i);
//				sb.append(c).append('X');
				i++;
			}
			else
			{
				for(int k=0; k<cnt; k++) {
					sb.append('X');
				}
				i=j;
			}
		}
		return sb.toString();
		
	}
	  public static void main (String[] args) {
//        try {
//            Scanner in = new Scanner(new BufferedReader(new FileReader("input.txt")));
//            String line = in.nextLine().trim();
//            String retVal = process(line);
//            PrintWriter output = new PrintWriter(new BufferedWriter(new FileWriter("output.txt")));
//            output.println(retVal);
//            output.close();
//        } catch (IOException e) {
//            System.out.println("IO error in input.txt or output.txt");
//        }
    	
    	Scanner sc=new Scanner(System.in);
    	String str=sc.nextLine();
    	String res=process(str);
    	System.out.println(res);
    	


    }
}
