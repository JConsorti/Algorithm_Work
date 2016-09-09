public class Recursion
{
	public static void main(String[] args)
	{
		int i = Integer.parseInt(args[0]);
		System.out.println(factorial(i));
		String s = "reverse this string";
		System.out.println("String to reverse: " + s);
		System.out.println(reverseRecursively(s));
	}
	
	public static int factorial(int i)
	{
		if(i==0)
		{
			return 1;
		}
		return i*factorial(i-1);
	}

	public static String reverseRecursively(String s)
	{
		if (s.length() < 2)
		{
			return s;
		}
		return reverseRecursively(s.substring(1)) + s.charAt(0);
	}

	public static String reverseIntRec(int[] i)
	{
		if(i.length < 2)
		{
			return i;
		}
		return reverseIntRec(i[1]) + " " + i[0];
	}
}