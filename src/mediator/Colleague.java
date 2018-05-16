package mediator;

public abstract class Colleague {

	protected String _name;
	
	public Colleague(String name){
		_name = name;
	}
	
	public abstract void sale();
	public abstract void buy();
}
