package composite;

import java.util.List;

public class Composite extends Component{
	
	List<Component> sons;

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

