import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*; 
import javax.swing.JFrame;  
import javax.swing.JLabel;  
import javax.swing.JPanel;  
import javax.swing.JTextField;  
import javax.swing.border.EmptyBorder;
import javax.swing.*;
  
public class JTextFileldDemo extends JFrame{  
    public JTextFileldDemo(){  
        this.setTitle("Fillin Blank");  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        this.setBounds(100, 100, 250, 200);  
        JPanel contentPane=new JPanel();  
        contentPane.setBorder(new EmptyBorder(5,5,5,5));  
        this.setContentPane(contentPane);  
        contentPane.setLayout(new GridLayout(3,1,5,5));  
        JPanel pane1=new JPanel();  
        contentPane.add(pane1);  
        
        JButton b = new JButton("confirm");
        b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("ok");
			}

			
		});
        contentPane.add(BorderLayout.SOUTH,b);
        JLabel label1=new JLabel("question1");  
          
        JTextField textField1=new JTextField();  
        textField1.setColumns(10);  
        pane1.add(label1);  
        pane1.add(textField1);  
        
        this.setVisible(true);  
    }  
    public static void main(String[]args){  
        JTextFileldDemo example=new JTextFileldDemo();  
    }  
}  
