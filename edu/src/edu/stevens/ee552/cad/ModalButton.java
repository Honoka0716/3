package edu.stevens.ee552.cad;
import edu.stevens.ee552.cad.components.*;
import javax.swing.*;
import java.awt.event.*;
public class ModalButton extends JButton {
	private Mode m;
    private DrawArea da;
    public ModalButton(String text, DrawArea da, Mode m) {
        super(text); // call parent constructor
        this.m = m;
        this.da = da;
        addActionListener(
            new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    da.setMode(m);
                }
        });
    }
}
