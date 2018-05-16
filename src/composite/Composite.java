package composite;

import java.util.ArrayList;

public class Composite implements Component{
	
	private ArrayList<Component> sons;
	
	public Composite(){
		sons = new ArrayList<Component>();
	}

	@Override
	public void operation() {
		for(Component g : sons){
			g.operation();
		}
		
	}

	public void add(Component c){
		if(!sons.contains(c))
			sons.add(c);
	}
	
	public void remove(Component c){
		if(sons.contains(c))
			sons.remove(c);
	}
	
	public void get(Component c){
		if(sons.contains(c))
			sons.get(sons.indexOf(c));
	}
}

