import java.util.Arrays;
public class BubbleSort
{
	public static void main(String[] args)
	{
		System.out.println("START");
		bSort(args[0]);	
		System.out.println("FINISH");	
	}

	public static void bSort(String s)
	{
		char[] toSort = s.toCharArray();
		for(int i = 0; i<s.length()-1; i++)
		{
			for(int j=0; j<s.length()-i-1; j++)
			{
				if(toSort[j+1]>toSort[j])
				{
					char temp = toSort[j+1];
					toSort[j+1] = toSort[j];
					toSort[j] = temp;
				}
			}
		System.out.printf("unsorted array after %d pass %s: %n", i+1, Arrays.toString(toSort));
		}
		System.out.println("Sorted: ");
		for(char c : toSort)
		{
			System.out.print(c);
		}
	}
}