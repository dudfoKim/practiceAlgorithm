package stack_20210420;

import java.util.Stack;

public class stack 
{
	public static void main(String[] args) 
	{
		// 문제1-2, 1-3
		Stack<Integer> numStack = new Stack<Integer>();
		Stack<Character> charStack = new Stack<Character>();

		// 문제 1-1, 1-3
		Stack q1 = new Stack();
		q1.add(1);
		q1.add(2);
		q1.add(3);
		
		System.out.print("스택 확인 : ");
		System.out.println(q1.toString());
	
		// 문제 1-4, 1-5
		q1.remove(2);
		System.out.print("스택 확인 : ");
		System.out.println(q1.toString());
		q1.removeAllElements();
		System.out.print("스택 확인 : ");
		System.out.println(q1.toString());
		
		// 문제 1-6, 1-7, 1-8, 1-9
		q1.add(4);
		q1.add(5);
		q1.add(6);

		System.out.println(q1.peek());
		System.out.println(q1.size());
		System.out.println(q1.isEmpty());
		System.out.println(q1.contains(1));
		
		System.out.print("스택 확인 : ");
		System.out.println(q1.toString());
		
		// 문제 3
		System.out.println("\n\n========문제 3========");
		Stack<Integer> q3 = new Stack();
		System.out.println(q3.isEmpty());
		
		q3.add(10);
		q3.add(20);
		q3.add(30);
		q3.add(40);
		q3.add(50);
		System.out.print("스택 확인 : ");
		System.out.println(q3.toString());
		
		q3.addElement(7);
		System.out.print("스택 확인 : ");
		System.out.println(q3.toString());
		
		q3.pop();
		System.out.println("현재 stack의 top 값 : " + q3.peek());
		System.out.println(q3.contains(50)==true?1:-1);
		
		while(!q3.isEmpty())
		{
			System.out.println(q3.pop());
		}
	}
}