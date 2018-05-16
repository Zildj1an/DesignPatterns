package adapter;

public class SoccerAdapter implements Player {

	private SoccerPlayer player;
	
	public SoccerAdapter(String name){
		player = new SoccerPlayer(name);
	}
	
	@Override
	public void score() {
		player.goal();
	}

	@Override
	public void move() {
		player.kickTheBall();
	}

}
