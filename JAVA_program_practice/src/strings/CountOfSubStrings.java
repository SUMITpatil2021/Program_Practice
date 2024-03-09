package strings;

import java.util.HashMap;

public class CountOfSubStrings {

	public static void main(String []args)
	{
		String str="This is CDAC";
		String []arr=str.split(" ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]+" "+arr[i].length());
		}
	}
}
