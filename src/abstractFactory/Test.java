package abstractFactory;

public class Test {
	
	public static void main(String[] args){
		AbstractFactory factory;
		AbstractWindow window;
		AbstractButton button;
		
		String system = "Windows"; //Change for experiment
		
		if(system.equals("Windows")){
			factory = new MicrosoftFactory();
		}
		else {
			factory = new LinuxFactory();
		}
		
		window = factory.makeWindow();
		button = factory.makeButton();
		
		System.out.println("window = " + window.getDescription());
		System.out.println("button = " + button.getDescription());
	}
}
