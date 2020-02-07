package Builder;

import java.awt.TextField;

import javax.swing.JPanel;

import Factory.ButtonFactory;

public class AddPanelBuilder implements PanelBuilder{

	private Panel panel;
	private ButtonFactory buttonFactory;
	
	public AddPanelBuilder() {
		// TODO Auto-generated constructor stub
		this.panel = new Panel();
		this.buttonFactory = new ButtonFactory();
	}

	@Override
	public void buildTextArea() {
		// TODO Auto-generated method stub
		panel.setTf(new TextField(20));
		panel.add(panel.getTf());
	}

	@Override
	public void buildAddButton() {
		// TODO Auto-generated method stub
		panel.setAddButton(buttonFactory.getButton("add").getJb());
		panel.add(panel.getAddButton());
	}

	@Override
	public void buildStartButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildDoneButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buildRemoveButton() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Panel getPanel() {
		// TODO Auto-generated method stub
		return this.panel;
	}

}
