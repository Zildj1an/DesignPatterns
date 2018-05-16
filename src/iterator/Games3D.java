package iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class Games3D implements GameIterator{

	
	private ArrayList<Game> games3D;
	
	public Games3D(){
		games3D = new ArrayList<Game>();
	}
	
	public void addGame(Game game){
		games3D.add(game);
	}
	
	@Override
	public Iterator<Game> getIterator() {
		return games3D.iterator();
	}

}
