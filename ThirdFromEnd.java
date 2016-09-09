import java.util.Scanner;

public class ThirdFromEnd
{
	public static Scanner keyboard = new Scanner(System.in);
	public static void main(String[] args)
	{
		System.out.println("Please enter a string at least 3 characters long to find 3rd from end.");
		String userInput = keyboard.nextLine();
		if(userInput.length()<3)
		{
			System.out.println("Not long enough");
			System.exit(0);
		}
		else
		print3rdFromEnd(userInput);
	}

	public static void print3rdFromEnd(String s)
	{
		int leadCount = 0;
		int followCount = 0;
		for(int i = 0; i<s.length()-1; i++)
		{
			leadCount++;
			if(leadCount>=3)
			{
				followCount++;
			}
		}
		System.out.println(s.charAt(followCount));
	}
}