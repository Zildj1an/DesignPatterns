package abstractFactory;

public class LinuxFactory implements AbstractFactory{

	@Override
	public AbstractWindow makeWindow() {
		return new LinuxWindow();
	}

	@Override
	public AbstractButton makeButton() {
		return new LinuxButton();
	}
	

}
