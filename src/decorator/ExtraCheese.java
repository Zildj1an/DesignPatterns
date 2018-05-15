package decorator;

public class ExtraCheese extends PizzaDecorator{

	public ExtraCheese(Pizza pizza) {
		super(pizza);
	}
	
	public String getDescription(){
		return _pizza.getDescription() + ", with extra cheese ";
	}
	
	public int getPrice(){
		return _pizza.getPrice() + 1;
	}

}
