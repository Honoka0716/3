import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class Mywin extends JFrame {
	public Mywin(String title, Color bg, int w, int h) {
		
		super(title);
		Container c = this.getContentPane();
		this.setSize(w,h);
		JButton b = new JButton("ok");
		b.setVisible(true);
		c.add(BorderLayout.NORTH,b);
		b.addActionListener(new A());
		
		
		
		c.setBackground(bg);
		setVisible(true);
	}
	public static void main(String[] args) {
		new Mywin("Test1",Color.RED,400,200);
		new Mywin("Test2",Color.GREEN,300,100);
		
	}

}

class A implements ActionListener{
	public void actionPerformed(ActionEvent e) {
		System.out.println("yo");
	}
}