package exceptions;

public class Throw {

	public static void main(String[] args) {
		int x= 15;
		if(x>=18)
		{
			System.out.println("qualtified for voting");
			
		}
		else {
			throw new ArithmeticException(" age for voting");
			
		}
	}

}
