package command;

public class Pizza implements Food {

	private String _food;
	
	public Pizza(String food){
		_food = food;
	}
	
	@Override
	public void eat() {
		System.out.println("Let's eat this pizza of " + _food);
		
	}

}
