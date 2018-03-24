package SwitchPanel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SwitchPanel {

	public static void switchPanel(JFrame mainFrame, JPanel oldPanel, 
		JPanel newPanel) {
		mainFrame.remove(oldPanel);
		mainFrame.add(newPanel, BorderLayout.CENTER);
		mainFrame.revalidate();
		mainFrame.repaint();
	}
	public static void main(String[] args) {

		JFrame mainFrame = new JFrame("Hello world");

		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		panel1.add(new JLabel("This is panel1"));
		panel2.add(new JLabel("This is panel2"));

		JPanel topnav = new JPanel();
		JButton jb1 = new JButton("Show panel1");
		jb1.addActionListener(e -> {
			switchPanel(mainFrame, panel2, panel1);
		});
		JButton jb2 = new JButton("Show panel2");
		jb2.addActionListener(e -> {
			switchPanel(mainFrame, panel1, panel2);
		});
		topnav.add(jb1);
		topnav.add(jb2);


		mainFrame.setLayout(new BorderLayout());
		mainFrame.add(panel1, BorderLayout.CENTER);
		mainFrame.add(panel2, BorderLayout.CENTER);

		mainFrame.add(topnav, BorderLayout.NORTH);

		mainFrame.pack();
		mainFrame.setVisible(true);
	}

}