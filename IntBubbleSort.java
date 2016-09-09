public class IntBubbleSort
{
	public static void main(String[] args)
	{
		int[] unsorted = {1,2,4,5,6,12,34,4,1,6};
		System.out.print("to be sorted: ");
		for(int i : unsorted )
		{
			System.out.print(i);
		}
		System.out.println("");
		System.out.println("Sorted");
		iSort(unsorted);

	
		String s = "reverse this";
		System.out.println("String to be reversed: " + s);
		System.out.println("Reversed string: " + new StringBuilder(s).reverse().toString());	
	}

	public static void iSort(int[] i)
	{
		for(int j = 0; j<i.length-1; j++)
		{
			for(int k = 0; k<i.length-j-1; k++)
			{
				if(i[k]>i[k+1])
				{
					int temp = i[k+1];
					i[k+1] = i[k];
					i[k] = temp;
				}
			}
		}
		for(int l : i)
		{
			System.out.print(l + " ");
		}
	}

	
}