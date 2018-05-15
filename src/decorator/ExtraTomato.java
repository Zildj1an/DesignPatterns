package decorator;

public class ExtraTomato extends PizzaDecorator {

	public ExtraTomato(PlainPizza pizza) {
		super(pizza);
	}

	public String getDescription(){
		return _pizza.getDescription() + ", with extra tomato";
	}
	
	public int getPrice(){
		return _pizza.getPrice() + 1;
	}
	
}
