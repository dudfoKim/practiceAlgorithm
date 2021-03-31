package DS;

public class sort 
{
	public static void print(int[] a)
	{
		for(int temp : a)
		{
			System.out.print(temp + " ");
		}
		System.out.println();
	}
	
	public static int[] bubble(int[] a)
    {
        int temp = 0;
        
        for(int i=0; i<a.length-1; i++)
        {
            for(int j=0; j<a.length-1; j++)
            {
                // ascending
                if(a[j]>a[j+1])
                {
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
                /* descending
                if(a[j]<a[j+1])
                {
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
                */
            }
        }
        
        print(a);
		return a;
    }
    
    public static int[] selection(int[] a)
    {
        int min_index = 0;
        int temp = 0;
        
        for(int i=0; i<a.length-1; i++)
        {
            min_index = i;
            
            for(int j=i+1; j<a.length; j++)
            {
                // ascending
                if(a[min_index]>a[j])
                {
                    min_index = j;
                }
                /* descending
                if(a[min_index]<a[j])
                {
                    min_index = j;
                }
                */
            }
            
            temp = a[min_index];
            a[min_index] = a[i];
            a[i] = temp;
        }
        
        print(a);
		return a;
    }
    
    public static int[] insertion(int[] a)
    {
        int temp = 0;
        int j = 0;
        
        for(int i=1; i<a.length; i++)
        {
            temp = a[i];
            
            // ascending
            for(j=i-1; j>=0 && temp<a[j]; j--)
            {
                a[j+1] = a[j];
            }
            
            /* descending
            for(j=i-1; j>=0 && temp>a[j]; j--)
            {
                a[j+1] = a[j];
            }
            */
            
            a[j+1] = temp;
        }
        
        print(a);
        return a;
    }
	public static void main(String[] args) 
	{
		int[] input1 = {1,5,7,2,4,3,6};
		int[] input2 = {1,5,7,2,4,3,6};
		int[] input3 = {1,5,7,2,4,3,6};
		
		bubble(input1);
		selection(input1);
		insertion(input1);
	}
}