public class StringReverse
{
	public static void main(String[] args)
	{
		reverseString(args[0]);
	}

	public static void reverseString(String s)
	{
		char[] newString = s.toCharArray();
		char[] newString2 = new char[newString.length];
		for(int i=0; i<s.length(); i++)
		{
			newString2[newString.length-i-1] = newString[i];
		}
		System.out.println(newString2.toString());
	}
}