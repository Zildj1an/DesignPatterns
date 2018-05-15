package decorator;

public class PlainPizza implements Pizza{

	@Override
	public String getDescription() {
		return "Pizza";
	}

	@Override
	public int getPrice() {
		return 4;
	}

}
