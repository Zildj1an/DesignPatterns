package singleton;

public class SingletonCar {

	private static SingletonCar s = null;
	private String description;
	
	private SingletonCar(){}
	
	public static SingletonCar createInstance(){
		if (s != null) throw new ExceptionInInitializerError();
		s = new SingletonCar();
		return s;
	}
	
	public static SingletonCar getInstance(){
		if (s == null) 
			createInstance();
		return s;
	}
	
	public void setDescription(String _des){
		description = _des;
	}
	
	public String getDescription(){
		return description;
	}
}
