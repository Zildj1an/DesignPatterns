package mediator;

public class SalesmanMediator implements Mediator {

	private SalesMan[] sales;
	private int _pos;
	
	public SalesmanMediator(){
		sales = new SalesMan[10];
		_pos = 0;
	}
	
	public void sale(int index) {
		if(index < 10 && index >= 0){
			sales[index].sale();
		}
	}

	@Override
	public void buy(int index) {
		if(index < 10 && index >= 0){
			sales[index].buy();
		}
	}

	@Override
	public void addColleague(Colleague c) {
		sales[_pos % 10] = (SalesMan) c;
		++_pos;
	}

}
