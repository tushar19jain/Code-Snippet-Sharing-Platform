package cssp.gui;

import cssp.controller.DashboardEventController;
import cssp.model.FetchPost;
import cssp.model.FetchUserPostDetails;

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
    final JButton my_files;
    final JButton admin_support;
    final JButton logout;
    final JTextField searchbar;
    public void fetchName (String Name){
        System.out.println("In fetch name method" +" "+ Name);
        name.setText(Name);
    }
    public DashboardPage(){
        setTitle("Code Snippet Sharing Platform - v1.0");
        setLayout(null);
        setSize(1920,1080);
        setResizable(false);
        setVisible(false);
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

        name = new JLabel("Tushar");
        name.setFont(new Font("Monospace",Font.BOLD,30));
        name.setForeground(Color.BLACK);
        name.setBounds(350,30,180,30);

        uplode = new JButton("+ Create new");
        uplode.setBackground(Color.decode("#1F1717"));
        uplode.setForeground(Color.WHITE);
        uplode.setFont(new Font("Monospace",Font.BOLD,16));
        sideLeftPanel.add(uplode);
        uplode.setBounds(30,280,180,40);
        uplode.setFocusable(false);
        uplode.setBorder(BorderFactory.createEmptyBorder());
        uplode.setCursor(new Cursor(Cursor.HAND_CURSOR));
        uplode.addActionListener(this);

        myprofile = new JButton("My Profile");
        myprofile.setBackground(Color.LIGHT_GRAY);
        myprofile.setForeground(Color.BLACK);
        myprofile.setBorder(BorderFactory.createEmptyBorder());
        myprofile.setFont(new Font("Monospace",Font.BOLD,12));
        sideLeftPanel.add(myprofile);
        myprofile.setBounds(30,400,180,40);
        myprofile.setFocusable(false);
        myprofile.setBorder(BorderFactory.createEmptyBorder());
        myprofile.setCursor(new Cursor(Cursor.HAND_CURSOR));
        myprofile.addActionListener(this);

        my_files = new JButton("My Files");
        my_files.setBackground(Color.LIGHT_GRAY);
        my_files.setForeground(Color.BLACK);
        my_files.setBorder(BorderFactory.createEmptyBorder());
        my_files.setFont(new Font("Monospace",Font.BOLD,12));
        sideLeftPanel.add(my_files);
        my_files.setBounds(30,450,180,40);
        my_files.setFocusable(false);
        my_files.setBorder(BorderFactory.createEmptyBorder());
        my_files.setCursor(new Cursor(Cursor.HAND_CURSOR));
        my_files.addActionListener(this);

        admin_support = new JButton("Admin support");
        admin_support.setBackground(Color.LIGHT_GRAY);
        admin_support.setForeground(Color.BLACK);
        admin_support.setBorder(BorderFactory.createEmptyBorder());
        admin_support.setFont(new Font("Monospace",Font.BOLD,12));
        sideLeftPanel.add(admin_support);
        admin_support.setBounds(30,720,180,40);
        admin_support.setFocusable(false);
        admin_support.setBorder(BorderFactory.createEmptyBorder());
        admin_support.setCursor(new Cursor(Cursor.HAND_CURSOR));
        admin_support.addActionListener(this);


        logout = new JButton("Log out");
        logout.setBackground(Color.LIGHT_GRAY);
        logout.setForeground(Color.BLACK);
        logout.setBorder(BorderFactory.createEmptyBorder());
        logout.setFont(new Font("Monospace",Font.BOLD,12));
        sideLeftPanel.add(logout);
        logout.setBounds(30,760,180,40);
        logout.setFocusable(false);
        logout.setBorder(BorderFactory.createEmptyBorder());
        logout.setCursor(new Cursor(Cursor.HAND_CURSOR));
        logout.addActionListener(this);

        ImageIcon searchIcon = new ImageIcon("src/cssp/gui/Assets/magnifying-glass.png");

        searchbar = new JTextField("Search for code snippets");
        searchbar.setBorder(BorderFactory.createEmptyBorder());
        searchbar.setBackground(Color.decode("#E9E9E9"));
        searchbar.setForeground(Color.black);
        searchbar.setBounds(600,20,580,50);

        add(sideLeftPanel);
        add(greet);
        add(searchbar);
        add(name);
      //  new FetchUserPostDetails().fetchUserPostDetails();
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
