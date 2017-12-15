import java.util.*;
import javax.swing.*;
import javax.swing.table.AbstractTableModel;

import java.awt.*;
public class JTableTest2 extends JFrame{
	GradeModel grade;
	public JTableTest2() {
		super("Jtable grade");
		Container c = getContentPane();
		JTable t1 = new JTable(grade = new GradeModel());
		c.add(t1, BorderLayout.CENTER);
		setSize(700,700);
		setVisible(true);
	}
	public static void main(String[] args) {
		new JTableTest2();
	}


class GradeModel extends AbstractTableModel{
	private ArrayList<String> columns;
	private ArrayList<ArrayList<Object>> gradeinfo;
	GradeModel(){
		columns = new ArrayList();
		columns.add("first");
		columns.add("last");
		columns.add("HW1");
		columns.add("HW2");
		columns.add("HW3");
		
	}
	public int getColumnCount() {
		return columns.size();
	}
	public int getRowCount() {
		return 5;
	}
	public Object getValueAt(int row,int col) {
		return new Integer(row*col);
	}	
};
}
