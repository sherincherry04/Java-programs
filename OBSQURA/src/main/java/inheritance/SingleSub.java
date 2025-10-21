package inheritance;

public class SingleSub extends SingleInherit{

	
public void create()
{
	System.out.println("child....");
}
	public static void main(String[] args)
	{
		SingleSub s = new SingleSub();
		s.display();
		s.create();
	}

}

