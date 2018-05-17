package iterator;

import java.util.Iterator;

public class Test {

	public static void main(String[] args) {
		
		Games3D games3d = new Games3D();
		Games2D games2d = new Games2D();
		Game game1 = new Game(1999,"Call Of Butter");
		Game game2 = new Game(2001, "God Of War 17");
		Game game3 = new Game(2002, "Cat Theft Auto");
		
		games3d.addGame(game1);
		games2d.addGame(game2);
		games2d.addGame(game3);
		
		System.out.println("3D GAMES \n");
		Iterator<Game> i1 = games3d.getIterator();
		iterate(i1);
		
		System.out.println("2D GAMES \n");
		Iterator<Game> i2 = games2d.getIterator();
		iterate(i2);

	}

	private static void iterate(Iterator<Game> i2) {
		Game g;
		while(i2.hasNext()){
			g = (Game) i2.next();
				if(g != null){
					System.out.println(g.getName());
					System.out.println("Year Of Release: " + g.getYear());
				}
		}
		System.out.println("---------------");
	}
}