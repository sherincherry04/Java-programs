package superkeyword;

public class SuperChild extends SuperParent {
	int a = 40;
	public void math()
	{
		System.out.println(a);
		System.out.println(super.a);
		
	}

	public static void main(String[] args) {
		SuperChild s = new SuperChild();
		s.math();

	}

}
