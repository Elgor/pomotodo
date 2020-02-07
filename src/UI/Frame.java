package UI;

import javax.swing.JFrame;

public class Frame extends JFrame{

	private JFrame jf;
	
	public Frame() {
		// TODO Auto-generated constructor stub
		this.jf = new JFrame();
		init();
	}

	public JFrame getFrame() {
		return jf;
	}

	public void setFrame(JFrame jf) {
		this.jf = jf;
	}

	public void init() {
		jf.setSize(1000, 1000);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setLayout(null);
		jf.setVisible(true);
	}
}
