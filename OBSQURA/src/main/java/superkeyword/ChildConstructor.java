package superkeyword;

public class ChildConstructor extends ParentConstructor {
	public ChildConstructor() {
		super();
		System.out.println("this is child constructor");
	}

	public static void main(String[] args) {
		ChildConstructor c= new ChildConstructor();
		   
	}

}
