package collection;
import java.util.*;


public class Collect {
	
	

	public static void main(String[] args)
	{
		ArrayList<String> obj=new ArrayList<String>();
		
		obj.add("Amit");
		obj.add("Vinay");
		obj.add("Kiran");
		obj.add("Jai");
		obj.add("Amit");
		System.out.println("Iterating the linked list elements");
		Iterator itr=obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}

	}
}

