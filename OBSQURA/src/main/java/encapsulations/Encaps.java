package encapsulations;

public class Encaps {

	public static void main(String[] args) {
		Encap c= new Encap();
		c.setmethod(5,"sherin");
		c.getmethod();
		c.getmethod1();
		
		System.out.println(c.getmethod());//call inside the printing statement since we are using return type
		System.out.println(c.getmethod1());
		
	}

}
