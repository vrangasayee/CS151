import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LayoutsDemo extends JFrame {

	public LayoutsDemo() {
		this.setLayout(new BorderLayout());
		JPanel layoutsPanel = new JPanel();
		JPanel centerPanel = new JPanel();
		layoutsPanel.setLayout(new FlowLayout());
		JButton gridButton =  new JButton("Grid");
		JButton flowButton =  new JButton("Flow");
		JButton vboxButton =  new JButton("VBox");
		JButton hboxButton =  new JButton("HBox");

		layoutsPanel.add(gridButton);
		layoutsPanel.add(flowButton);
		layoutsPanel.add(vboxButton);
		layoutsPanel.add(hboxButton);

		gridButton.addActionListener(e -> {
			centerPanel.setLayout(new GridLayout(4,3));
			centerPanel.revalidate();
			centerPanel.repaint();
		});
		flowButton.addActionListener(e -> {
			centerPanel.setLayout(new FlowLayout());
			centerPanel.revalidate();
			centerPanel.repaint();
		});

		vboxButton.addActionListener(e -> {
			centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.PAGE_AXIS));
			centerPanel.revalidate();
			centerPanel.repaint();
		});

		hboxButton.addActionListener(e -> {
			centerPanel.setLayout(new BoxLayout(centerPanel, BoxLayout.LINE_AXIS));
			centerPanel.revalidate();
			centerPanel.repaint();
		});


		for (int i = 0 ; i < 12; i++) {
			centerPanel.add(new JButton(Integer.toString(i)));
		}

		this.add(layoutsPanel, BorderLayout.NORTH);
		this.add(centerPanel, BorderLayout.CENTER);

		this.pack();
		this.setVisible(true);

	}

	public static void main(String[] args) {
		LayoutsDemo tester = new LayoutsDemo();
	}
}