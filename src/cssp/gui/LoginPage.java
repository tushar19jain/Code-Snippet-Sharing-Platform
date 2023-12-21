package cssp.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import  cssp.controller.LoginpageEventController;
public class LoginPage implements ActionListener {
    public JFrame loginpage;
    final JLabel loginpageGreet;
    final JLabel loginpageUsername;
    public JTextField loginpageUsernameTextfield;
    final JLabel loginpagePassword;
    public JPasswordField loginpagePasswordTextfield;
    final JButton login;
    final JLabel notYetRegistered;
    final JLabel rightSideImage;
    final JPanel rightSidePanel;
    public LoginPage() {
        loginpage = new JFrame();
        loginpage.getContentPane().setBackground(Color.decode("#ffffff"));
        loginpage.setTitle("Code Snippet Sharing Platform - v1.0");
        loginpage.setLayout(null);
        loginpage.setSize(1920, 1080);
        loginpage.setResizable(false);
        loginpage.setVisible(false);
        loginpage.setLocationRelativeTo(null);

        loginpageGreet = new JLabel("Login to CSSP");
        loginpageGreet.setFont(new Font("Verdana", Font.BOLD, 28));
        loginpageGreet.setBounds(1060, 140,280, 40);
        loginpageGreet.setForeground(Color.BLACK);

        loginpageUsername = new JLabel("Username");
        loginpageUsername.setForeground(Color.BLACK);
        loginpageUsername.setFont(new Font("Verdana", Font.PLAIN, 12));
        loginpageUsername.setBounds(970, 200, 180, 30);
        loginpageUsernameTextfield = new JTextField();
        loginpageUsernameTextfield.setForeground(Color.BLACK);
        loginpageUsernameTextfield.setFont(new Font("Verdana", Font.PLAIN, 12));
        loginpageUsernameTextfield.setBounds(970, 260, 450, 40);
        loginpageUsernameTextfield.setBorder(BorderFactory.createBevelBorder(0, Color.BLACK, Color.BLACK));
        loginpageUsername.setFocusable(false);

        loginpagePassword = new JLabel("Password");
        loginpagePassword.setForeground(Color.BLACK);
        loginpagePassword.setFont(new Font("Verdana", Font.PLAIN, 12));
        loginpagePassword.setBounds(970, 340, 180, 30);

        loginpagePasswordTextfield = new JPasswordField();
        loginpagePasswordTextfield.setForeground(Color.BLACK);
        loginpagePasswordTextfield.setFont(new Font("Verdana", Font.PLAIN, 12));
        loginpagePasswordTextfield.setBounds(970, 390, 450, 40);
        loginpagePasswordTextfield.setBorder(BorderFactory.createBevelBorder(0, Color.BLACK, Color.BLACK));
        loginpagePassword.setFocusable(false);

        login = new JButton("Login");
        login.setBounds(1240, 480, 180, 40);
        login.setForeground(Color.WHITE);
        login.setBackground(Color.decode("#03A6FF"));
        login.setFocusable(false);
        login.addActionListener(this);
        notYetRegistered = new JLabel("Not registered ? Register Now!");
        notYetRegistered.setFont(new Font("Verdana", Font.PLAIN, 15));
        notYetRegistered.setForeground(Color.BLACK);
        notYetRegistered.setBounds(280, 600, 280, 30);

        ImageIcon heroImage = new ImageIcon("src/cssp/gui/Assets/undraw_My_code_snippets_re_4adu-removebg-preview.png");

        rightSideImage = new JLabel(heroImage);
        rightSideImage.setBounds(100,200,heroImage.getIconWidth(),heroImage.getIconHeight());

        rightSidePanel =new JPanel(null);
        rightSidePanel.setBounds(0,0,780,1080);
        rightSidePanel.setBackground(Color.decode("#6210E8"));
        rightSidePanel.add(rightSideImage);

        loginpage.add(loginpageGreet);
        loginpage.add(loginpageUsername);
        loginpage.add(loginpageUsernameTextfield);
        loginpage.add(loginpagePassword);
        loginpage.add(loginpagePasswordTextfield);
        loginpage.add(login);
        loginpage.add(rightSidePanel);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login){
            new LoginpageEventController().matchUserCredential(loginpageUsernameTextfield.getText(), loginpagePasswordTextfield.getText());
        }
    }
}
