package exceptions;

public class ExceptionExample {

	public static void main(String[] args) 
	{try {
		
	
		int a = 10;
		int div=a/0;
		System.out.println(div);
	}
	/*catch(Exception e) { // handles exception
		System.out.println(e);
		
	}*/
	finally { // excutes "finally" even if exception "catch" is handled or not
		System.out.println("finally block");
	}

}
}