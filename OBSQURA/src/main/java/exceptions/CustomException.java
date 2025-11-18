package exceptions;

public class CustomException {

	public static void main(String[] args) throws VotingException {//declaring custom exception
		int x=10;
		if(x>=18) {
			System.out.println("eligible for voting");
			
		}
		else {
			throw new VotingException("under age limit");
			//generated this custom exception from source and generrate constructor using field
		}
	}

}
