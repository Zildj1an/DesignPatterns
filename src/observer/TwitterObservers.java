package observer;

public class TwitterObservers implements Follower{
	
	//state of the observed subject
	
	public void update(){
		System.out.println("I have been warned!");
	}

}
