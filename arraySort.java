package stack_20210420;

import java.util.Arrays;

public class arraySort 
{
	public static void main(String[] args) 
	{
		int[] arraySort = {1,99,11,16,64,72,8,7};
		
		System.out.print("�迭 Ȯ�� : ");

		for(int data : arraySort)
		{
			System.out.print(data + " ");
		}
		
		Arrays.sort(arraySort);
		
		System.out.print("\n�迭 Ȯ�� : ");

		for(int data : arraySort)
		{
			System.out.print(data + " ");
		}
	}
}