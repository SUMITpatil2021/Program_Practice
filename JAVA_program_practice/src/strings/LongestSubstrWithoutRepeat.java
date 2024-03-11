package strings;

public class LongestSubstrWithoutRepeat {
	
	public static int lengthOfLongestSubstring(String str)
	{
		int size=str.length();
		if(str==null && size==0)
			return 0;
		int max=1;
		int start=0;
		for(int i=0;i<size;i++)
		{
			char ch=str.charAt(i);
			int j=0;
			for( j=start;j<i-1;j++)
			{
				if(ch==str.charAt(j))
				{
					start=j+1;
				break;
			}
		}
		if(j==i)
			max=(max>(i-start+1))?max:(i-start+1);
		
			
			
		}
		return max;
		
	}

	public static void main(String []args)
	{
		System.out.println(lengthOfLongestSubstring("bbbbb"));
	}
}
