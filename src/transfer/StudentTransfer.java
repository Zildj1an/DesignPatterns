package transfer;

public class StudentTransfer {
	
	//Simple POJO
	
	private String _name;
	private int _age;
	
	public StudentTransfer(String name, int age){
		_name = name;
		_age = age;
	}
	
	public void setName(String name){
		_name = name;
	}
	public void setAge(int age){
		_age = age;
	}
	public String getName(){
		return _name;
	}
	public int getAge(){
		return _age;
	}
}
