package homework;

public class Palindrome {

	public static void main(String[] args) {
	
		checkingPalindrome("Java");
		checkingPalindrome("Malayalam");
	}
	public static void checkingPalindrome(String str) {
		
		String rev =new StringBuilder(str).reverse().toString();
		if(str.equalsIgnoreCase(rev))
			System.out.println(str + " "+ "is a palindrome");
		else
			System.out.println(str +" " +"is not a palindrome");
			
	}
			
		}
		
	

//}
