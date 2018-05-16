package iterator;

public class Game {
	
	private int _yearRelease;
	private String _name;
	
	public Game(int year, String name){
		_yearRelease = year;
		_name = name;
	}
	
	public int getYear(){
		return _yearRelease;
	}
	
	public String getName(){
		return _name;
	}
}
