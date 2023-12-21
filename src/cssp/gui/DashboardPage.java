package cssp.gui;

import cssp.controller.DashboardEventController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DashboardPage extends JFrame implements ActionListener {
    final JPanel sideLeftPanel;
    public JLabel name;
    final JLabel greet;
    final JLabel CsspLogo;
    final JButton myprofile;
    final JButton uplode;
    public DashboardPage(){
        setTitle("Code Snippet Sharing Platform - v1.0");
        setLayout(null);
        setSize(1920,1080);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("#ffffff"));
        this.setBackground(Color.WHITE);

        sideLeftPanel = new JPanel(null);
        sideLeftPanel.setBackground(Color.LIGHT_GRAY);
        sideLeftPanel.setBounds(0,0,250,1080);

        CsspLogo = new JLabel("cssp");
        CsspLogo.setForeground(Color.BLACK);
        CsspLogo.setFont(new Font("Verdana",Font.BOLD,25));
        CsspLogo.setBounds(30,34,104,31);
        sideLeftPanel.add(CsspLogo);

        greet = new JLabel("Hi");
        greet.setFont(new Font("Monospace",Font.PLAIN,30));
        greet.setForeground(Color.BLACK);
        greet.setBounds(300,30,80,30);

        name = new JLabel();
        name.setFont(new Font("Monospace",Font.BOLD,30));
        name.setForeground(Color.BLACK);
        name.setBounds(350,30,180,30);

        uplode = new JButton("+ Uplode File");
        uplode.setBackground(Color.black);
        uplode.setForeground(Color.WHITE);
        uplode.setFont(new Font("Monospace",Font.BOLD,16));
        sideLeftPanel.add(uplode);
        uplode.setBounds(30,280,180,40);
        uplode.setFocusable(false);
        uplode.setBorder(BorderFactory.createEmptyBorder());
        uplode.setCursor(new Cursor(Cursor.HAND_CURSOR));
        uplode.addActionListener(this);

        myprofile = new JButton("New profile");
        myprofile.setBackground(Color.black);
        myprofile.setForeground(Color.WHITE);
        myprofile.setFont(new Font("Monospace",Font.BOLD,12));
        sideLeftPanel.add(myprofile);
        myprofile.setBounds(30,350,180,40);
        myprofile.setFocusable(false);
        myprofile.setBorder(BorderFactory.createEmptyBorder());
        myprofile.setCursor(new Cursor(Cursor.HAND_CURSOR));
        myprofile.addActionListener(this);

        add(sideLeftPanel);
        add(greet);
        add(name);
    }
    public void fetchName (String Name){
        name.setText(Name);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource() == uplode){
          new DashboardEventController().getEventSource("uplode");
      }
      if (e.getSource() == myprofile){
          new DashboardEventController().getEventSource("myprofile");
      }
    }
}
