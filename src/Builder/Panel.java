package Builder;

import java.awt.TextField;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Panel extends JPanel{
	
	private TextField tf;
	private JButton addButton;
	private JButton removeButton;
	private JButton startButton;
	private JButton doneButton;
	
	public Panel(TextField tf, JButton addButton, JButton removeButton, JButton startButton,
			JButton doneButton) {
		super();
		this.tf = tf;
		this.addButton = addButton;
		this.removeButton = removeButton;
		this.startButton = startButton;
		this.doneButton = doneButton;
	}
	
	public TextField getTf() {
		return tf;
	}

	public void setTf(TextField tf) {
		this.tf = tf;
	}

	public JButton getAddButton() {
		return addButton;
	}

	public void setAddButton(JButton addButton) {
		this.addButton = addButton;
	}

	public JButton getRemoveButton() {
		return removeButton;
	}

	public void setRemoveButton(JButton removeButton) {
		this.removeButton = removeButton;
	}

	public JButton getStartButton() {
		return startButton;
	}

	public void setStartButton(JButton startButton) {
		this.startButton = startButton;
	}

	public JButton getDoneButton() {
		return doneButton;
	}

	public void setDoneButton(JButton doneButton) {
		this.doneButton = doneButton;
	}

	public Panel() {
		// TODO Auto-generated constructor stub
	}

}
