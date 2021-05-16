package DS;

public class sortPrac 
{
	public static int[] bubble(int[] a)
	{
		int temp = 0;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		
		return a;
	}

	public static int[] insertion(int[] a)
	{
		for(int i=1; i<a.length; i++)
		{
			int temp = a[i];
			int j = i-1;
			
			while(j>=0 && a[j]>temp)
			{
				a[j+1] = a[j];
				 j--;
			}
			
			a[j+1] = temp;
		}
		
		return a;
	}
	
	public static int[] selection(int[] a)
	{
		for(int i=0; i<a.length; i++)
		{
			int index = i;
			int compare = a[i];
			
			for(int j=i; j<a.length; j++)
			{
				if(compare>a[j])
				{
					compare = a[j];
					index = j;
				}
			}
			
			int temp = a[i];
			a[i] = a[index];
			a[index] = temp;
		}
		
		return a;
	}
	
	public static void main(String[] args) 
	{
		int[] input1 = {6, 1, 3, 2, 4, 5};
		int[] result = bubble(input1);
		
		System.out.print("bubble sort : ");
		for(int data : result)
		{
			System.out.print(data + " ");
		}
		
		System.out.print("\n\ninsertion sort : ");
		int[] input2 = {6, 1, 3, 2, 4, 5};
		result = insertion(input2);
		
		for(int data : result)
		{
			System.out.print(data + " ");
		}
		
		System.out.print("\n\nselection sort : ");
		int[] input3 = {6, 1, 3, 2, 4, 5};
		result = selection(input3);
		
		for(int data : result)
		{
			System.out.print(data + " ");
		}
	}
}