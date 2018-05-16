package adapter;

public class SoccerPlayer {
	
	private String _name;
	
	public SoccerPlayer(String name){
		_name = name;
	}
	
	public void goal(){
		System.out.println("Goal scored by " + _name + "!");
	}
	
	public void kickTheBall(){
		System.out.println("Ball kicked by " + _name + "!");
	}

}
