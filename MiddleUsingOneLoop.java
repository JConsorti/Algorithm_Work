import java.util.*;
public class MiddleUsingOneLoop
{
	private static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Please input a string to find the center");
		String userInput = keyboard.next();
		System.out.println(findMiddle(userInput));
	}
	
	public static String findMiddle(String s)
	{
		int j = 0;
		int k = 0;
/*		if(k==null||k.length==0)
		{
			System.out.println("Please enter a valid string");
		}*/
		for(int i=0; i<s.length()-1; i++)
		{
			j++;
			if(j%2==0)
			{
				k++;
			}	
		}
		if(s.length()%2!=0)
		{
			return s.charAt(k)+"";
		}
		else
		{
			return s.charAt(k) + " " + s.charAt(k+1);
		}
	}

}