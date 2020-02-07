package Builder;

import javax.swing.JPanel;

public interface PanelBuilder {

	public void buildTextArea();
	public void buildAddButton();
	public void buildStartButton();
	public void buildDoneButton();
	public void buildRemoveButton();
	public Panel getPanel();
}
