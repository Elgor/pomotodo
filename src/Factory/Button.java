package Factory;

import javax.swing.JButton;

public abstract class Button extends JButton{
	protected JButton jb;
	
	public JButton getJb() {
		return jb;
	}

	public void setJb(Button jb) {
		this.jb = jb;
	}
}
