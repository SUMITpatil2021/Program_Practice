package strings;

public class Before_vowel_Capital {
	public static boolean isVowel(char ch)
	{
		if(ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u' ||ch=='A' ||ch=='E' ||ch=='I' ||ch=='O' ||ch=='U' )
				return true;
		else
			return false;
	}
	
	public static String beforeCapital(String str)
	{
		String s="";
		char demo;
		
		for(int i=0;i<str.length();i++)
		{
			if(i+1 <str.length() && isVowel(str.charAt(i+1)))
			{
				demo=(char)(str.charAt(i)-32);
				s+=demo;
			}
			else
				s+=str.charAt(i);
		}
		
		return s;
	}

	public static void main(String[] args) {
		System.out.println(beforeCapital("hello sumit"));
	}
}
