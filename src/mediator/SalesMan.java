package mediator;

public class SalesMan extends Colleague{

	public SalesMan(String name) {
		super(name);
	}

	@Override
	public void sale() {
		System.out.println("I," + _name + " will make that sale!");
	}

	@Override
	public void buy() {
		System.out.println("I," + _name + " will buy that product!");
		
	}

}
