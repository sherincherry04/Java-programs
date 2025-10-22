package polymorphism;

public class Runtimechild {
	public void show()
	{
		System.out.println("child ");
	}

	public static void main(String[] args) {
		Runtimechild c= new Runtimechild();
		c.show();
		Runtimepoly p = new Runtimepoly();
		p.show();
	}

}
