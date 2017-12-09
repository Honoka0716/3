import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Mywin3 extends JFrame {
	private JPanel p;
	public Mywin3(String title, Color bg, int w, int h) {
		
		super(title);
		Container c = this.getContentPane();
		this.setSize(w,h);
		JButton b = new JButton("ok");
		b.setVisible(true);
		c.add(BorderLayout.NORTH,b);
		b.addActionListener(
				new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						System.out.println("yo");
						p.setBackground(Color.WHITE);
					}
					
				}
					
				);
		p = new JPanel();
		p.setBackground(new Color(155,0,155));
		c.add(BorderLayout.SOUTH, p);
		
		c.setBackground(bg);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Mywin3("Test1",Color.RED,400,200);
		
		
	
}


}