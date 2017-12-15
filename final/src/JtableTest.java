import javax.swing.*;
import java.awt.*;
public class JtableTest extends JFrame{
	String[] colName = {"fname","lname","HW1","HW2","HW3"};
	Object[][] data= {
			{"Han","Shangshang","100","100","100"},
			{"Kousaka","Honoka","100","100","100"}
	};
	public JtableTest() {
		super("JTable Test");
		JTable t = new JTable(data,colName);
		Container c = getContentPane();
		c.add(t,BorderLayout.CENTER);
		setSize(600,600);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JtableTest();
	}
}
