package collection;

import java.util.HashSet;
import java.util.Set;

public class SetMethods {

	public static void main(String[] args) {
		Set<Integer> i = new HashSet <Integer>();
		Set<Integer> j=new HashSet<Integer>();
		i.add(22);
		i.add(78);
		i.add(87);
		j.add(84);
		j.add(85);
		j.add(22);
		System.out.println(i);
		System.out.println(j);
		i.addAll(j);
		System.out.println(i);
		System.out.println(i.size());
		System.out.println(j.isEmpty());
		System.out.println(j.contains(12));
		System.out.println(i.containsAll(j));//check the elements i elements  in j vi
	    i.remove(85);
		System.out.println(i);
		i.removeAll(j);
		System.out.println(i);
		j.clear();
		System.out.println(j);
	}

}
