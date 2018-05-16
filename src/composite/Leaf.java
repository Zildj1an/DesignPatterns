package composite;

public class Leaf implements Component{

	private String _name;
	
	public Leaf(String name){
		_name = name;
	}
	
	@Override
	public void operation() {
		System.out.println("Hi! Im the leaf " + _name);
		
	}
	
}
