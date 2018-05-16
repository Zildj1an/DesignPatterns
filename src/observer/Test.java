package observer;

public class Test {

	public static void main(String[] args) {
		
		Account twitterAccount = new Account();
		TwitterObservers user23 = new TwitterObservers();
		twitterAccount.addObserver(user23);
		twitterAccount.something(); //The observer user23 will be notified

	}

}
