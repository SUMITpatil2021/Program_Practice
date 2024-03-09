package strings;

public class OccuranceOFChar {
public static void main(String []args)
{
	String s="this is india";
	int count=0;

//	 count=s.length()-s.replaceAll("i","").length();
	
	//using for loop
	for(int i=0;i<s.length();i++)
	{
		if('i'==s.charAt(i))
			count++;
		
	}
	System.out.print("No. of Occurance of  i in "+s+" is : "+count);
	
}
}

