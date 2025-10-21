package superkeyword;

public class ChildMethod extends ParentMethod

{
	public void display()//method overriding same name method as child
	{
		System.out.println("this is child method");
	}
    public void tell()
    {
    	display();
    	super.display();
    }
	public static void main(String[] args) {
		ChildMethod m= new ChildMethod();
		m.tell();
		
		
	}

}
