package decorator;

public class PizzaDecorator implements Pizza{
	
	protected Pizza _pizza;

	public PizzaDecorator(Pizza pizza){
		_pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		return _pizza.getDescription();
	}

	@Override
	public int getPrice() {
		return _pizza.getPrice();
	}

}
