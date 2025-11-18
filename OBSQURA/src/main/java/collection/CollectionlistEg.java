package collection;

import java.util.LinkedList;
import java.util.List;



public class CollectionlistEg {

	public static void main(String[] args) {
		List<String>l1=new LinkedList<String>();
		l1.add("Red");
		l1.add("Green");
		l1.add("Blue");
		l1.add("Black");
		l1.add("white");
		l1.add("Red");
		System.out.println(l1);
		System.out.println(l1.get(1));
		l1.set(4,"grey");
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l1.isEmpty());
		l1.remove(2);
		System.out.println(l1);
		System.out.println(l1.contains("Red"));
		System.out.println(l1.indexOf("Green"));
		System.out.println(l1.lastIndexOf("Red"));
				
	}

}
