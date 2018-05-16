package mediator;

public class Test {

	public static void main(String[] args) {
		
		SalesmanMediator mediator = new SalesmanMediator();
		mediator.addColleague(new SalesMan("Facundo,"));
		mediator.buy(0);
		mediator.sale(0);
	}

}
