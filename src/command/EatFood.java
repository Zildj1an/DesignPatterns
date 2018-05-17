package command;

public class EatFood implements Command{

	//Crazy extra stuff...
	
	@Override
	public void eat(Food f) {
		f.eat();
	}

}
