package Builder;

import java.awt.FlowLayout;
import java.awt.TextField;

import Factory.ButtonFactory;

public class TaskPanelBuilder implements PanelBuilder{

	private Panel panel;
	private ButtonFactory buttonFactory;
	
	public TaskPanelBuilder() {
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
		
	}

	@Override
	public void buildStartButton() {
		// TODO Auto-generated method stub
		panel.setStartButton(buttonFactory.getButton("start").getJb());
		panel.add(panel.getStartButton());
	}

	@Override
	public void buildDoneButton() {
		// TODO Auto-generated method stub
		panel.setDoneButton(buttonFactory.getButton("done").getJb());
		panel.add(panel.getDoneButton());
	}

	@Override
	public void buildRemoveButton() {
		// TODO Auto-generated method stub
		panel.setRemoveButton(buttonFactory.getButton("remove").getJb());
		panel.add(panel.getRemoveButton());
	}

	@Override
	public Panel getPanel() {
		// TODO Auto-generated method stub
		return this.panel;
	}

}
