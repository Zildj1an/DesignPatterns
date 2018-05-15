package abstractFactory;

public class MicrosoftFactory implements AbstractFactory
{
	
	@Override
	public AbstractWindow makeWindow() {
		return new MicrosoftWindow();
	}

	@Override
	public AbstractButton makeButton() {
		return new MicrosoftButton();
	
	}
	

}
