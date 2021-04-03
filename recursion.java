package DS;

import java.util.*;

public class recursion 
{
	 public static int fibo(int n)
	    {
	        if(n<3)
	        {
	            return 1;
	        }
	        else
	        {
	            return fibo(n-2) + fibo(n-1);
	        }
	    }
	    
	    public static int facto(int n)
	    {
	        if(n==1)
	        {  
	            return 1;
	        }
	        else
	        {
	            return n* facto(n-1);
	        }
	    }
	    
	    public static int sumDigits(int n)
	    {
	        int sum = 0;
	        
	        if(n!=0)
	        {
	            sum = n%10;
	            sum += sumDigits(n/10);
	        }
	        
	        return sum;
	    }
	    
	    public static String printReverse(String n)
	    {
	        if(n==null || n.length()==0)
	        {
	            return "";
	        }
	        else
	        {
	            return Character.toString(n.charAt(n.length()-1)) + printReverse(n.substring(0, n.length()-1));
	        }
	    }
	    
	    public static int arrayCount(int[] n, int search)
	    {
	        if(n==null || n.length==0)
	        {
	            return 0;
	        }
	        if(n[n.length-1]==search)
	        {
	            return 1 + arrayCount(Arrays.copyOfRange(n, 0, n.length-1), search);
	        }
	        else
	        {
	            return + arrayCount(Arrays.copyOfRange(n, 0, n.length-1), search);
	        }
	    }
	    
	    public static int stringCount(String input, String compare)
	    {
	    	if(input.length()==0 || input.length()<compare.length())
	    	{
	    		return 0;
	    	}
	    	else
	    	{
	    		int size = compare.length();
	    		String temp = "";
	    		
	    		for(int i=0; i<size; i++)
	    		{
	    			temp += Character.toString(input.charAt(i));
	    		}
	    		
	    		if(temp.equals(compare))
	    		{
	    			return 1 + stringCount(input.substring(1, input.length()), compare);	
	    		}
	    		else
	    		{
	    			return stringCount(input.substring(1, input.length()), compare);
	    		}
	    	}
	    }
	    
	    public static void hanoi(int i, char from, char mid, char to)
	    {
	    	if(i==1)
	    	{
                System.out.println(i + "를 " + from + "에서 " + to + "로 옮깁니다.");
	    	}
	    	else
	    	{
                hanoi(i-1, from, to, mid);
                System.out.println(i + "를 " + from + "에서 " + to + "로 옮깁니다.");
                hanoi(i-1, mid, from, to);
	    	}
	    }
	    
	public static void main(String[] args) 
	{
		System.out.println("fibo(9) : " + fibo(9));
		System.out.println("facto(9) : " + facto(9));
		System.out.println("sumDigits(22453) : " + sumDigits(22453));
		System.out.println("printReverse(ABCDEFG) : " + printReverse("ABCDEFG"));
		
		int[] input = {1,2,3,4,5,3};
		System.out.println("arrayCount([1,2,3,4,5,3], 3) : " + arrayCount(input, 3));
	
		System.out.println("stringCount(appleNapple, apple) : " + stringCount("appleNapple", "apple"));
		
		System.out.println("\n하노탑 시작 :");
		hanoi(3, 'A', 'B', 'C');
	}
}