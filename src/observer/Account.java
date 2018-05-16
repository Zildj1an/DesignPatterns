package observer;

import java.util.ArrayList;

public class Account implements TheSubject { 
	
	private ArrayList<TwitterObservers> followers;
	
	public Account(){
		followers = new ArrayList<TwitterObservers>();
	}
	
	public void something(){
		//whatever change at the state
		notifytoAll();
	}
	
	@Override
	public void addObserver(TwitterObservers f){
		followers.add(f);
	}
	
	@Override
	public void removeObserver(TwitterObservers f){
		followers.remove(followers.indexOf(f));
	}
	
	@Override
	public void notifytoAll(){
		for(TwitterObservers f: followers){
			f.update();
		}
	}	
}
