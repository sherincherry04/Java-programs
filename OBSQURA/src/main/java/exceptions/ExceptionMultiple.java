package exceptions;

public class ExceptionMultiple {

	public static void main(String[] args) {
	try {
       int a[]= new int [3]; //evaluates the right-hand side (RHS) — the expression — first.
                            //Then it assigns the result of that expression to the variable on the left-hand side (LHS). 
       a[3]=3/0; 
	}
    catch(ArrayIndexOutOfBoundsException e)
	{
	System.out.println("Exception for array");
    }
	catch(ArithmeticException c) 
	{
		System.out.println("arithemtic exception");
	}
	catch(NullPointerException n)
	{
		System.out.println("exception null");
	}
}
}