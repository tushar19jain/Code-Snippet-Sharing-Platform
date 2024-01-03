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
    final JButton notYetRegistered;
    final JLabel rightSideImage;
    final JPanel rightSidePanel;
    final JButton forgetPassword;
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
        notYetRegistered = new JButton("Not registered ? Register Now!");
        notYetRegistered.setFont(new Font("Verdana", Font.PLAIN, 14));
        notYetRegistered.setForeground(Color.BLACK);
        notYetRegistered.setBackground(Color.white);
        notYetRegistered.setForeground(Color.BLACK);
        notYetRegistered.setBounds(1030, 600, 280, 30);
        notYetRegistered.setBorder(BorderFactory.createEmptyBorder());
        notYetRegistered.setFocusable(false);

        ImageIcon heroImage = new ImageIcon("src/cssp/gui/Assets/undraw_My_code_snippets_re_4adu-removebg-preview.png");

        rightSideImage = new JLabel(heroImage);
        rightSideImage.setBounds(100,200,heroImage.getIconWidth(),heroImage.getIconHeight());

        rightSidePanel =new JPanel(null);
        rightSidePanel.setBounds(0,0,780,1080);
        rightSidePanel.setBackground(Color.decode("#6210E8"));
        rightSidePanel.add(rightSideImage);

        forgetPassword = new JButton("Forget your password ??");
        forgetPassword.setFont(new Font("Verdana",Font.PLAIN,14));
        forgetPassword.setBounds(1080,700,190,30);
        forgetPassword.setCursor(new Cursor(Cursor.HAND_CURSOR));
        forgetPassword.setBackground(Color.decode("#ffffff"));
        forgetPassword.setBorder(BorderFactory.createEmptyBorder());
        forgetPassword.setForeground(Color.blue);
        forgetPassword.setFocusable(false);

        loginpage.add(loginpageGreet);
        loginpage.add(loginpageUsername);
        loginpage.add(loginpageUsernameTextfield);
        loginpage.add(loginpagePassword);
        loginpage.add(loginpagePasswordTextfield);
        loginpage.add(login);
        loginpage.add(rightSidePanel);
        loginpage.add(notYetRegistered);
        loginpage.add(forgetPassword);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == login){
            new LoginpageEventController().matchUserCredential(loginpageUsernameTextfield.getText(), loginpagePasswordTextfield.getText());
        }
    }
}
