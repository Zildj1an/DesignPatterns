package command;

public class Hamburger implements Food {

	private String _food;
	
	public Hamburger(String food){
		_food = food;
	}
	
	@Override
	public void eat() {
		System.out.println("Let's eat this burger of " + _food);
		
	}

}
