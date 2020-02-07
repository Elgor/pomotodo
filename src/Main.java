



import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BoxLayout;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

import Builder.AddPanelBuilder;
import Builder.PanelBuilder;
import Builder.PanelDirector;
import Builder.TaskPanelBuilder;

public class Main{
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		
		JPanel panel1;
		JPanel panel2;
		
		PanelBuilder addPanelBuilder =  new AddPanelBuilder();
		PanelBuilder taskPanelBuilder = new TaskPanelBuilder();
		
		PanelDirector panelDirector = new PanelDirector(addPanelBuilder);
		panelDirector.constructPanel();
		panel1 = panelDirector.getPanel();
		panel1.setBackground(Color.black);
		

		
		panelDirector = new PanelDirector(taskPanelBuilder);
		panelDirector.constructPanel();
		panel2 = panelDirector.getPanel();
		panel2.setBackground(Color.red);
		
		panel1.setLayout(new FlowLayout());
		
		jf.setLayout(new BorderLayout());
		
		jf.add(panel1);
		jf.add(panel2);
		jf.add(panel1);
		jf.add(panel2);
		jf.add(panel1);

		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setVisible(true);
		
	}
}
