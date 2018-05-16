package observer;

public interface TheSubject {
	
	public void addObserver(TwitterObservers f);
	public void removeObserver(TwitterObservers f);
	public void notifytoAll();
}
