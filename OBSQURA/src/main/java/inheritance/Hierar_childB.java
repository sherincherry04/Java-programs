package inheritance;

public class Hierar_childB extends Hierar_parent {

	public void ride() {
		System.out.println("ridinggg....");
	}
	
	public static void main(String[] args) {
		Hierar_childB b = new Hierar_childB();
		b.ride();
		b.car();
		
		
	}
	}

