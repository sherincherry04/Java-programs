package collection;


import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Iteration {

	public static void main(String args[]) {
		List<Integer> i = new LinkedList<Integer>();
		i.add(5);
		i.add(19);
		i.add(9);
		i.add(10);
		Iterator <Integer> j = i.iterator();
		while(j.hasNext()) {
			System.out.println(j.next());
		}
		j.remove();
		System.out.println(i);
		
		
	}
}
