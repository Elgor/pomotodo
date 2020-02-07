package Factory;

import javax.swing.JButton;

public class ButtonFactory {

	public ButtonFactory() {
		// TODO Auto-generated constructor stub
	}
	
	public Button getButton(String buttonType) {
		if(buttonType == null) {
			return null;
		}
		
		if(buttonType.equalsIgnoreCase("add")) {
			return new AddButton();
		}
		else if(buttonType.equalsIgnoreCase("done")) {
			return new DoneButton();
		}
		else if(buttonType.equalsIgnoreCase("remove")) {
			return new RemoveButton();
		}
		else if(buttonType.equalsIgnoreCase("start")) {
			return new StartButton();
		}
		
		return null;
	}

}
