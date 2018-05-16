package iterator;
import java.util.Arrays;
import java.util.Iterator;

public class Games2D implements GameIterator{

	
	private Game[] games2D;
	private int _pos;
	
	public Games2D(){
		games2D = new Game[3];
		_pos = 0;
	}
	
	public void addGame(Game game){
		games2D[_pos % 3] = game; //Circular buffer
		++_pos;
	}
	
	@Override
	public Iterator<Game> getIterator() {
		return Arrays.asList(games2D).iterator();
	}

}
