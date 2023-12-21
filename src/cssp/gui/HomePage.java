/*This component represents the homepage for Code Snippet Sharing Platform,
 Where user can switch between Login and Register pages */
package cssp.gui;

import cssp.controller.HomepageEventController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

 public class HomePage extends JFrame implements ActionListener {
    final JLabel HomepageHeading;
    final JLabel HomepageSemiHeading1;
    final JLabel HomepageSemiHeading2;
    final JButton Register;
    final JButton Login;
    final JLabel sideHero;
    final JLabel logo;
    public HomePage(){
        // This constructor has the default setting of homepage
        setTitle("Code Snippet Sharing Platform - v1.0");
        setLayout(null);
        setSize(1920,1080);
        setResizable(false);
        setVisible(false);

        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("#ffffff"));

        // HomePage components
        Register = new JButton("Register");
        Register.setFont(new Font("Verdana",Font.BOLD,14));
        Register.setBorder(BorderFactory.createEmptyBorder());
        Register.setBackground(Color.decode("#03A6FF"));
        Register.setForeground(Color.WHITE);
        Register.setBounds(180,480,100,40);
        Register.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Register.setToolTipText("Register as a new user");
        Register.setFocusable(false);
        Register.addActionListener(this);

        Login = new JButton("Login");
        Login.setFont(new Font("Verdana",Font.BOLD,14));
        Login.setBorder(BorderFactory.createBevelBorder(0,Color.decode("#03A6FF"),Color.decode("#03A6FF")));
        Login.setBackground(Color.WHITE);
        Login.setForeground(Color.decode("#03A6FF"));
        Login.setBounds(350,480,100,40);
        Login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Login.setToolTipText("Login as a existing user");
        Login.setFocusable(false);
        Login.addActionListener(this);

        HomepageHeading = new JLabel("Code Sharing,Simplified");
        HomepageHeading.setFont(new Font("Verdana",Font.BOLD,42));
        HomepageHeading.setBounds(131,286,900,48);
        HomepageHeading.setForeground(Color.BLACK);

        HomepageSemiHeading1 = new JLabel("Dive into the coding adventure! Join us");
        HomepageSemiHeading1.setFont(new Font("Verdana",Font.PLAIN,20));
        HomepageSemiHeading1.setBounds(131,340,700,72);
        HomepageSemiHeading1.setForeground(Color.GRAY);

        HomepageSemiHeading2 = new JLabel("and turn your snippets into stars.");
        HomepageSemiHeading2.setFont(new Font("Verdana",Font.PLAIN,20));
        HomepageSemiHeading2.setBounds(131,375,700,72);
        HomepageSemiHeading2.setForeground(Color.GRAY);

        ImageIcon sideImage = new ImageIcon("src/cssp/gui/Assets/hero.png");
        sideHero = new JLabel(sideImage);
        sideHero.setBounds(850,150,sideImage.getIconWidth(),sideImage.getIconHeight());

        ImageIcon logoIcon = new ImageIcon("src/cssp/gui/Assets/logo.png");
        logo = new JLabel(logoIcon);
        logo.setBounds(40,10,500, 450);
        // Adding components to HomePage
        add(HomepageHeading);
        add(HomepageSemiHeading1);
        add(HomepageSemiHeading2);
        add(Register);
        add(Login);
        add(sideHero);
        add(logo);
    }

     @Override
     /* Here we are capturing the event source and passing it to the getEventSource
      method of HomepageEventController class in Controller package */
     public void actionPerformed(ActionEvent e) {
         String captureEvent;

         if (e.getSource()==Register){
             captureEvent = "Register";
             new HomepageEventController().getEventSource(captureEvent);
         }
         if (e.getSource()==Login){
             captureEvent = "Login";
             new HomepageEventController().getEventSource(captureEvent);
         }
     }
 }
