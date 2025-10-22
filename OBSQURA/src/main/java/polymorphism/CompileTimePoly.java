package polymorphism;

public class CompileTimePoly {
	public void display()
	{
		System.out.println("exmaple of polymorphism");
	}
	public void display(int a)
	{
		System.out.println(a);
	}
	public void display(String name)
	{
		System.out.println("parametre string");
	}

	public static void main(String[] args) {
		CompileTimePoly p = new CompileTimePoly();
		p.display();
		p.display(7);
		p.display("sherin");
		
	}

}
