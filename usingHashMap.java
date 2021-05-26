package DS;

import java.util.ArrayList;
import java.util.HashMap;

public class usingHashMap 
{
	public static void main(String[] args) 
	{
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> input = new ArrayList<Integer>();
		input.add(1);
		input.add(2);
		input.add(22);
		input.add(22);
		input.add(3);
		input.add(3);
		input.add(3);
		input.add(11);
		input.add(22);
		input.add(1);
		input.add(1);
		
		for(int i=0; i<input.size(); i++)
		{
			int data = input.get(i);
			
			if(i==0)
			{
				map.put(data, 1);
				list.add(data);
			}
			else
			{
				if(input.get(i-1)==data)
				{
					map.replace(data, map.get(data)+1);
				}
				else
				{
					map.put(data, 1);
					list.add(data);
				}
			}
		}
		
		for(int data : list)
		{
			System.out.println(data + " (" + map.get(data) + ")");
		}
	}
}