package facade;

public class Test {
	
	public static void main(String[] args){
		
		//I decided to represent this D.P. with three inner classes at Facade
		Facade f1 = new Facade();
		
		//You don't have to worry about modules A, B or C
		f1.operationA();
		f1.operationB();
		f1.operationC();
		
	}

}
