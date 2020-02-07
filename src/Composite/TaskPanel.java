package Composite;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JPanel;

import Builder.Panel;
import Builder.PanelBuilder;
import Builder.PanelDirector;
import Builder.TaskPanelBuilder;

public class TaskPanel implements PanelComponent{

	private Panel taskPanel;
	private List<PanelComponent> childPanel;
	
	private PanelDirector panelDirector;
	private PanelBuilder taskPanelBuilder;
	
	public TaskPanel() {
		// TODO Auto-generated constructor stub
		this.taskPanelBuilder = new TaskPanelBuilder();
		this.panelDirector = new PanelDirector(this.taskPanelBuilder);
		this.panelDirector.constructPanel();
		this.taskPanel = panelDirector.getPanel();
		this.childPanel = new ArrayList<>();
	}

	public void add(PanelComponent p) {
		childPanel.add(p);
	}
	
	public void remove(PanelComponent p) {
		childPanel.remove(p);
	}
	
	@Override
	public void drawPanel(JPanel jp) {
		// TODO Auto-generated method stub
		jp.add(taskPanel);
		for (PanelComponent panel : childPanel) {
			panel.drawPanel(jp);
		}
	}

}
