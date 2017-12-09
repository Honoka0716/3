import java.awt.*;
import java.awt.event.*;
public class Chess extends Panel implements MouseListener, ActionListener {
	int x = -1, y = -1 , chesscolor = 1;
	Button button = new Button("Restart");
	TextField text_1 = new TextField("Please black chess");
	TextField text_2 = new TextField();	
	public void paint(Graphics g) {
		for (int i = 40; i<=400;i+=20) {
			g.drawLine(40,i,400,i);
		}
		for(int j = 40; j<=400;j+=20) {
			g.drawLine(j, 40, j, 400);
		}
		g.fillOval(97,97,6,6);
		g.fillOval(97, 337, 6, 6);
		g.fillOval(337, 97, 6, 6);
		g.fillOval(337, 337, 6, 6);
		g.fillOval(217, 217, 6, 6);
		g.fillOval(97, 237, 6, 6);
		g.fillOval(217, 97, 6, 6);
		g.fillOval(217,337,6,6);
		g.fillOval(337, 217, 6, 6);
		
	}
	public void ChessPad(){
		setSize(440,440);
		setLayout(null);
		setBackground(Color.orange);
		addMouseListener(this);
		add(button);
		button.setBounds(10,5,60,26);
		button.addActionListener(this);
		add(text_1);
		text_1.setBounds(90, 5, 90, 24);
		add(text_2);
		text_2.setBounds(290,5,90,24);
		text_1.setEditable(false);
		text_2.setEditable(false);
		
		
		
	}
	public void mousePressed(MouseEvent e) {
		if(e.getModifiers()==InputEvent.BUTTON1_DOWN_MASK) {
			x = (int)e.getX();
			y = (int)e.getY();
			ChessPoint_Black chesspoint_black = new ChessPoint_black(this);
			ChessPoint_White chesspoint_black = new ChessPoing_white(this);
			int a = (x+10)/20 , b =(y+10)/20;
			if(x/20<2||y/20<2||x/20>19||y/20>19) {
				
			}
			else {
				if(chesscolor==1) {
					this.add(chesspoint_black);
					chesspoint_black.setBounds(a*20-10,b*20-10,20,20);
					chesscolor = chesscolor*(-1);
					text_1.setText(null);
					text_2.setText("please white chess");
				}
				else if (chesscolor == -1) {
					this.add(chesspoint_white);
					chesspoint_white.setBounds(a*20-10,b*20-10,20,20);
					chesscolor=chesscolor*(-1);
					text_1.setText("please black chess");
					text_2.setText(null);
				}
			}
		}
		}
		
	public void mouseReleased(MouseEvent e) {
	}
	public void mouseEntered(MouseEvent e) {
	}
	public void mouseExited(MouseEvent e) {
	}
	public void mouseClicked(MouseEvent e) {
	}
	public void actionPerformed(ActionEvent e) {
		this.removeAll();
		chesscolor = 1;
		add(button);
		button.setBounds(10,5,60,26);
		add(text_1);
		text_1.setBounds(90,5,90,24);
		add(text_2);
		text_2.setBounds(290,5,90,24);
		text_1.setText("please black chess");
		text_2.setText(null);
	}
}
abstract class ChessPoint_black extends Canvas implements MouseListener{
	Chess chesspad=null;
	ChessPoint_black(Chess p) {
	}
	{
		setSize(20,20);
		
		chesspad = ;
		addMouseListener(this);
	}
	public void paint(Graphics g) {
		g.setColor(Color.black);
		g.fillOval(0, 0, 20, 20);
	}
	public void mousePressed(MouseEvent e) {
		if(e.getModifiers()==InputEvent.BUTTON3_DOWN_MASK) {
			chesspad.remove(this);
			
		}
	}
	public static void main(String[] args) {
		
	}
	
	
}
