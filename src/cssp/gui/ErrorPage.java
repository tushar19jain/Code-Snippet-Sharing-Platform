package cssp.gui;

import javax.swing.*;
import java.awt.*;


public class ErrorPage extends JDialog {
    public JLabel errorcode;
    public ErrorPage(){
        setLayout(null);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        setSize(400,400);
        errorcode = new JLabel();
        errorcode.setBounds(90,50,190,20);
        errorcode.setFont(new Font("Verdana",Font.BOLD,10));
        errorcode.setForeground(Color.RED);
        add(errorcode);
    }
    public void getErrorCode(String error){
        errorcode.setText(error);
    }
}
