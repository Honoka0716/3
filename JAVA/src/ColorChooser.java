import javax.swing.*;
import javax.swing.event.ChangeEvent;

import java.awt.*;
import java.awt.event.*;
public class ColorChooser extends JFrame {
	private JPanel p;
	
	public ColorChooser() {
		super("Color Chooser");
		setSize(700,500);
		Container c = getContentPane();
		c.setBackground(Color.RED);
		JSlider s;
		c.setLayout(new GridLayout(1,4,5,5));
		c.add(new JSlider(SwingConstants.VERTICAL,0,255,0));
		s.addChangeListener(
				new ChangeListener() {
					public void stateChanged(ChangeEvent e) {
						JSlider slider = (JSlider)e.getSource()
					}
				}
				);
		c.add(new JSlider(SwingConstants.VERTICAL,0,255,0));
		c.add(new JSlider(SwingConstants.VERTICAL,0,255,0));
		JPanel  p = new JPanel();
		p.setBackground(Color.PINK);
		c.add(p);
		setVisible(true);
	}
	public static void main(String[] args) {
		new ColorChooser();
	}

}
