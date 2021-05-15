package lv2_20210515;

import java.util.Scanner;

public class printStar 
{
	public static void printStar(int type, int input)
	{
		if(type==1)
		{
			System.out.println("\ntype : " + type);
			
			for(int i=0; i<input; i++)
			{
				for(int k=i; k>=0; k--)
				{
					System.out.print("*");
				}
				
				for(int j=input-1; j>i; j--)
				{
					System.out.print(" ");
				}
				
				System.out.println();
			}
		}
		else if(type==2)
		{
			System.out.println("\ntype : " + type);
			
			for(int i=0; i<input; i++)
			{
				for(int j=input-1; j>i; j--)
				{
					System.out.print(" ");
				}
				
				for(int k=i; k>=0; k--)
				{
					System.out.print("*");
				}
				
				System.out.println();
			}
		}
		else if(type==3)
		{
			System.out.println("\ntype : " + type);
			
			for(int i=0; i<input; i++)
			{
				for(int j=input-1; j>=i; j--)
				{
					System.out.print("*");
				}
				
				for(int k=0; k<i; k++)
				{
					System.out.print(" ");
				}
				
				System.out.println();
			}
		}
		else if(type==4)
		{
			System.out.println("\ntype : " + type);
			
			for(int i=0; i<input; i++)
			{				
				for(int k=0; k<i; k++)
				{
					System.out.print(" ");
				}
				
				
				for(int j=input-1; j>=i; j--)
				{
					System.out.print("*");
				}
				System.out.println();
			}
		}
		else if(type==5)
		{
			System.out.println("\ntype : " + type);
			
			for(int i=0; i<input; i++)
			{
				for(int j=1; j<input-i; j++)
				{
					System.out.print(" ");
				}
				
				for(int k=0; k<i*2+1; k++)
				{
					System.out.print("*");
				}
				
				System.out.println();
			}
			
			System.out.println();
		}
		else if(type==6)
		{
			System.out.println("\ntype : " + type);
			
			for(int i=0; i<input; i++)
			{
				for(int j=1; j<input-i; j++)
				{
					System.out.print(" ");
				}
				
				for(int k=0; k<i*2+1; k++)
				{
					System.out.print("*");
				}
				
				System.out.println();
			}
			// 1 : 7, 2 :5, 3:3, 4:1
			
			for(int i=1; i<input; i++)
			{
				for(int j=i; j>=1; j--)
				{
					System.out.print(" ");
				}
				
				for(int k=2*(input-i); k>1 ; k--)
				{
					System.out.print("*");
				}
				
				System.out.println();
			}
			
			System.out.println();
		}
	}

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		printStar(1, input);
		printStar(2, input);
		printStar(3, input);
		printStar(4, input);
		printStar(5, input);
		printStar(6, input);
	}
}