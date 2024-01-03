package cssp.gui;

import javax.swing.*;
import java.awt.*;

public class BanStatus extends JDialog {
    final JLabel warning;
    final JLabel warningMessage1;
    final JLabel warningMessage2;
    final JLabel warningMessage3;
    final JLabel warningMessage4;
    final JButton confirm;

    public BanStatus(){
        setTitle("Code Snippet Sharing Platform - v1.0");
        setLayout(null);
        setSize(420,380);
        setModal(true);
        setResizable(false);
        setVisible(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("#3E4457"));

        warning = new JLabel("Warning");
        warning.setBounds(160,20,180,30);
        warning.setForeground(Color.decode("#CABC8E"));
        warning.setFont(new Font("Monospace",Font.PLAIN,20));

        warningMessage1 = new JLabel("Your account has been banned for unlawful");
        warningMessage1.setForeground(Color.decode("#CABC8E"));
        warningMessage1.setFont(new Font("Monospace",Font.PLAIN,15));
        warningMessage1.setBounds(20,60,380,30);

        warningMessage2 = new JLabel("activities. If you have any queries, please direct");
        warningMessage2.setForeground(Color.decode("#CABC8E"));
        warningMessage2.setFont(new Font("Monospace",Font.PLAIN,15));
        warningMessage2.setBounds(20,80,380,30);

        warningMessage3 = new JLabel("them to Customer Service.");
        warningMessage3.setForeground(Color.decode("#CABC8E"));
        warningMessage3.setFont(new Font("Monospace",Font.PLAIN,15));
        warningMessage3.setBounds(20,100,380,30);

        warningMessage4 = new JLabel("Ban period: 2035-10-12 00:00:00");
        warningMessage4.setForeground(Color.decode("#CABC8E"));
        warningMessage4.setFont(new Font("Monospace",Font.PLAIN,15));
        warningMessage4.setBounds(20,120,380,30);

        confirm = new JButton("Confirm");
        confirm.setBackground(Color.decode("#ECE5D7"));
        confirm.setBorder(BorderFactory.createSoftBevelBorder(0,Color.decode("#EEEEEE"),Color.decode("#EEEEEE")));
        confirm.setForeground(Color.decode("#484D57"));
        confirm.setFocusable(false);
        confirm.setCursor(new Cursor(Cursor.HAND_CURSOR));
        confirm.setBounds(110,250,180,45);

        add(warning);
        add(warningMessage1);
        add(warningMessage2);
        add(warningMessage3);
        add(warningMessage4);
        add(warningMessage4);
        add(confirm);
    }

    public static void main(String[] args) {
        new BanStatus().setVisible(true);
    }
}
/*
UID: 810932309 |
Your account has been banned for unlawful |
activities. If you have any queries, please direct
them to Customer Service. |
Ban period: 2035-10-12 00:00:00 |
Reason for Ban: Use of external plug-ins and/or |
third-party software
* */