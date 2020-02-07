package Composite;

import javax.swing.JPanel;

import Builder.AddPanelBuilder;
import Builder.Panel;
import Builder.PanelBuilder;
import Builder.PanelDirector;

public class AddPanel implements PanelComponent{

	private Panel addPanel;
	
	private PanelDirector panelDirector;
	private PanelBuilder addPanelBuilder;
	
	public AddPanel() {
		// TODO Auto-generated constructor stub
		this.addPanelBuilder = new AddPanelBuilder();
		this.panelDirector = new PanelDirector(this.addPanelBuilder);
		panelDirector.constructPanel();
		this.addPanel = panelDirector.getPanel();
	}

	@Override
	public void drawPanel(JPanel jp) {
		// TODO Auto-generated method stub
		jp.add(addPanel);
	}

	
}
