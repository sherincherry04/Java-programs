package modifiers;

public class DefaultAccess {
	void display()
	{
		System.out.println("default exmaple");
	}

	public static void main(String[] args) {
		
     DefaultAccess d = new DefaultAccess();
     d.display();
	}

}
