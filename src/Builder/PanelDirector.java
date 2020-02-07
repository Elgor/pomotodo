package Builder;

public class PanelDirector {

	private PanelBuilder panelBuilder;
	
	public PanelDirector() {
		// TODO Auto-generated constructor stub
	}

	public PanelDirector(PanelBuilder panelBuilder) {
		super();
		this.panelBuilder = panelBuilder;
	}

	public Panel getPanel() {
		return this.panelBuilder.getPanel();
	}
	
	public void constructPanel() {
		this.panelBuilder.buildTextArea();
		this.panelBuilder.buildAddButton();
		this.panelBuilder.buildStartButton();
		this.panelBuilder.buildDoneButton();
		this.panelBuilder.buildRemoveButton();
	}
}
