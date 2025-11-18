package homework;

import java.util.LinkedList;

public class ForEachCollection {
		    public static void main(String[] args) {
		        LinkedList<String> String = new LinkedList<String>();
		        String.add("Honda");
		        String.add("BMW");
		        String.add("Audi");
		        String.add("Tesla");
		        String.add("CRV");

	
		        for (String Str : String) {
		            System.out.println(Str);
		        
		        }
		    }

}
