package abstraction;

public class InterfaceChild implements InterfaceParent {//keyword implement used for class and interface 
	public void method2() {
		System.out.println("interface exmaple inheritent");
	}

	public static void main(String[] args) {
		InterfaceChild s=new InterfaceChild();
		s.method2();
	}

}
