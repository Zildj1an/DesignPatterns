package decorator;

public class Test {

	public static void main(String[] args){
		
		Pizza pizza = new ExtraCheese(new ExtraTomato(new PlainPizza()));
		
		System.out.println("Description of the pizza: ");
		System.out.println(pizza.getDescription());
		
		System.out.println("Price of the pizza: ");
		System.out.println("$" + pizza.getPrice());
		
	}
}
