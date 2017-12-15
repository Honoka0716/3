package sad;
import java.awt.*;
import javax.swing.*;
public class JTableTest extends JFrame{
	String[] colName = {"fname","lname","HW1","HW2","HW3"};
	Object[][] data = {
			{"Han","Shangshang","100","100","100"},
			{"Kousaka","Honoka","100","100","100"}
	};
	public JTableTest() {
		super("Grade");
		Container c = getContentPane();
		JTable t = new JTable(data,colName);
		c.add(t,BorderLayout.CENTER);
		setSize(500,500);
		setVisible(true);
	}
	public static void main(String[]args) {
		new JTableTest();
	}
}