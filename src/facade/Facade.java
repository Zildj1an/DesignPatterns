package facade;

public class Facade {
	
	moduleA mA = new moduleA();
	moduleB mB = new moduleB();
	moduleC mC = new moduleC();
	
	
	public class moduleA {
		public void operation(int valor){
			if(valor > 5) //Internal complications
				System.out.println("Operation at A");
		}
	}
	
	public class moduleB {
		public void operation(char a){
			if(a == 'a')
				System.out.println("Operation at B");
		}
	}
	
	public class moduleC {
		public void operation(){
			System.out.println("Operation at C");
		}
	}
	
	public void operationA(){
		mA.operation(7);
	}
	
	public void operationB(){
		mB.operation('a');
	}
	
	public void operationC(){
		mC.operation();
	}

}
