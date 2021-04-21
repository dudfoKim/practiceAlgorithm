package sort_20210421;

public class sort
{
	public static void print(int[] array)
	{
		for(int data : array)
		{
		System.out.print(data + " ");
		}
	}

	public static void insertion(int[] array)
	{
		for(int i=1; i<array.length; i++)
		{
			int key = array[i];
			int j = i-1;
			
			while(j>=0 && key<array[j])
			{
				array[j+1] = array[j];
				j--;
			}
			
		array[j+1] = key;
		}
	}

	public static void mergeSort(int arr[], int l, int r)
	{
		if(l<r)
		{
			int mid = (l+r)/2;
			mergeSort(arr, l, mid);
			mergeSort(arr, mid+1, r);
			merge(arr, l, mid, r);
		}
	}
	
	public static void merge(int arr[], int l, int mid, int r)
	{
		int i = l;
		int j = mid+1;
		int k = l;
		int temp[] = new int[arr.length];
		
		while(i<=mid && j<=r)
		{
			if(arr[i] < arr[j])
			{
				temp[k++] = arr[i++];
			}
			else
			{
				temp[k++] = arr[j++];
			}
		}
		
		while(i<=mid)
		{
			temp[k++] = arr[i++];
		}
		while(j<=r)
		{
			temp[k++] = arr[j++];
		}

		for(int index=l; index<k; index++)
		{
			arr[index] = temp[index];
		}
	}
	
	public static void main(String[] args)
	{
		int[] insertion = {5, 1, 3, 7, 2, 9};
		int[] merge = {6, 5, 3, 1, 8, 7, 2, 4};
		
		System.out.println("삽입정렬 전 : ");
		print(insertion);
		insertion(insertion);
		System.out.println("\n삽입정렬 후 : ");
		print(insertion);
		
		System.out.println("\n\n병합정렬 전 : ");
		print(merge);
		mergeSort(merge, 0, merge.length-1);
		System.out.println("\n병합정렬 후 : ");
		print(merge);	
	}
}
