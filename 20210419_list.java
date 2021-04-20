package basic_20210419;

import java.util.ArrayList;
import java.util.Arrays;

class Node
{
	int num;
	Node next;

	Node(int input)
	{
		this.num = input;
	}
}

public class list
{
	Node head;
	Node last;
	
	// 리스트 내 노드 및 값 추가
	public void add(int value)
	{
		if(head==null)
		{
			head = new Node(value);
		}
		else
		{
			Node temp = head;
			
			while(temp.next!=null)
			{
				temp = temp.next;
			}
			
			temp.next = new Node(value);
			last = temp.next;
		}
	}
	
	// 리스트 내 값 출력
	public void print()
	{
		Node temp = head;
		
		while(temp!=null)
		{
			System.out.print(temp.num + " ");
			temp = temp.next;
		}
	}

	// 리스트 병합 및 정렬
	public void mergeList(list b)
	{
		Node temp = this.head;
		ArrayList<Integer> sortList = new ArrayList<Integer>();
		
		this.last.next = b.head;

		System.out.print("정렬 전 리스트 출력 : ");
		this.print();
		
		temp = this.head;
		
		while(temp!=null)
		{
			sortList.add(temp.num);
			temp =  temp.next;
		}
		
		sortList.sort(null);
		this.head = null;
		
		for(int data : sortList)
		{
			this.add(data);
		}
		
		System.out.print("\n정렬 후 리스트 출력 : ");
		this.print();
	}
	
	// 리스트 내 동일한 숫자들의 합
	public void findNum(list b)
	{
		int sum = 0;
		Node temp = this.head;
		
		while(temp.next!=null)
		{
			Node find = b.head;
			
			while(find.next!=null)
			{
				if(temp.num==find.num)
				{	
					sum += temp.num;
				}
				
				find = find.next;
			}
			
			temp = temp.next;
		}
		
		System.out.println("리스트 내 동일한 숫자들의 합 : " + sum + "\n");	
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		list a = new list();
		list b = new list();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		b.add(1);
		b.add(3);
		b.add(5);
		b.add(7);
		
		a.findNum(b);
		a.mergeList(b);
	}
}
