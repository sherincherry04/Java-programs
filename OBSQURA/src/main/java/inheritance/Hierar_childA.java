package inheritance;

public class Hierar_childA extends Hierar_parent{
     public void drive() {
    	 System.out.println("driving...");
     }
     
     public static void main(String[] args) {
		Hierar_childA a = new Hierar_childA();
		a.drive();
		a.car();
	}
	}

