/* This class includes the components for Register page
  This class gets displayed, When user clicks on register button
  This class will be handled in both HomepageEventController and its self class - RegisterPageController in
  Controller package */
package cssp.gui;

import cssp.controller.RegisterpageEventController;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class RegisterPage extends JFrame implements ActionListener {
    final JPanel leftSidePanel;
    final JLabel leftSideImage;
    final JLabel leftSideGreet;
    final JLabel accountExists;
    final JButton Login;
    final JLabel rightSideHeading;
    final JLabel userFirstName;
    public JTextField userFNtextarea;
    final JLabel userLastName;
    public JTextField userLNtextarea;
    final JLabel username;
    public JTextField userNametextarea;
    final JLabel password;
    public JPasswordField userPasswordtextarea;
    final JLabel confirmPassword;
    public JTextField userConfirmPasswordtextarea;
    final JLabel securityQuestion;
    final JLabel securityAnswer;
    public JTextArea userSAtextarea;
    final JComboBox questionSelector;
    final String [] questions = {"What was name of your first school ?","Your pet name ?","Your best-friend name ?"};
    final JButton registerBtn;
    public RegisterPage(){
        // These are the by default settings of Register page.
        setLayout(null);
        setTitle("CSSP Registration page");
        setSize(1920,1080);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(false);
        getContentPane().setBackground(Color.decode("#ffffff"));

        //Implementing the components
        leftSidePanel = new JPanel();
        leftSidePanel.setLayout(null);
        leftSidePanel.setSize(760,1080);
        leftSidePanel.setBackground(Color.decode("#6210E8"));

        ImageIcon image = new ImageIcon("src/CSSP/Controller/AssetsRegisterPage/Wavy_Gen-01_Single-07_prev_ui.png");
        leftSideImage = new JLabel(image);
        leftSideImage.setBounds(120,160,image.getIconWidth(),image.getIconHeight());
        leftSidePanel.add(leftSideImage);

        leftSideGreet = new JLabel("Welcome to CSSP");
        leftSideGreet.setForeground(Color.WHITE);
        leftSideGreet.setFont(new Font("Verdana",Font.BOLD,35));
        leftSideGreet.setBounds(180,640,370,40);
        leftSidePanel.add(leftSideGreet);

        accountExists = new JLabel("Already have an account ?");
        accountExists.setForeground(Color.BLACK);
        accountExists.setFont(new Font("Verdana",Font.PLAIN,13));
        accountExists.setBounds(1200,12,180,20);

        Login = new JButton("Login");
        Login.setFont(new Font("Verdana",Font.BOLD,14));
        Login.setBorder(BorderFactory.createBevelBorder(0,Color.decode("#03A6FF"),Color.decode("#03A6FF")));
        Login.setBackground(Color.WHITE);
        Login.setForeground(Color.decode("#03A6FF"));
        Login.setBounds(1391,10,100,30);
        Login.setCursor(new Cursor(Cursor.HAND_CURSOR));
        Login.setToolTipText("Login as a existing user");
        Login.setFocusable(false);

        rightSideHeading = new JLabel("Create your free account");
        rightSideHeading.setFont(new Font("Verdana",Font.BOLD,30));
        rightSideHeading.setForeground(Color.BLACK);
        rightSideHeading.setBounds(950,130,480,40);

        userFirstName = new JLabel("First name");
        userFirstName.setFont(new Font("Verdana",Font.PLAIN,12));
        userFirstName.setForeground(Color.BLACK);
        userFirstName.setBounds(900,210,180,30);

        userFNtextarea = new JTextField();
        userFNtextarea.setFont(new Font("Verdana",Font.PLAIN,12));
        userFNtextarea.setForeground(Color.BLACK);
        userFNtextarea.setBounds(900,240,230,40);
        userFNtextarea.setBackground(Color.WHITE);

        userLastName = new JLabel("Last name");
        userLastName.setFont(new Font("Verdana",Font.PLAIN,12));
        userLastName.setForeground(Color.BLACK);
        userLastName.setBounds(1150,210,180,30);

        userLNtextarea = new JTextField();
        userLNtextarea.setFont(new Font("Verdana",Font.PLAIN,12));
        userLNtextarea.setForeground(Color.BLACK);
        userLNtextarea.setBounds(1150,240,230,40);

        username = new JLabel("Create a username");
        username.setFont(new Font("Verdana",Font.PLAIN,12));
        username.setForeground(Color.BLACK);
        username.setBounds(900,320,180,30);

        userNametextarea = new JTextField();
        userNametextarea.setFont(new Font("Verdana",Font.PLAIN,12));
        userNametextarea.setForeground(Color.BLACK);
        userNametextarea.setBounds(900,350,230,40);

        password = new JLabel("Create a password");
        password.setFont(new Font("Verdana",Font.PLAIN,12));
        password.setForeground(Color.BLACK);
        password.setBounds(1150,310,180,40);

        userPasswordtextarea = new JPasswordField();
        userPasswordtextarea.setEchoChar('*');
        userPasswordtextarea.setFont(new Font("Verdana",Font.PLAIN,12));
        userPasswordtextarea.setForeground(Color.BLACK);
        userPasswordtextarea.setBounds(1150,350,230,40);


        confirmPassword = new JLabel("Confirm password");
        confirmPassword.setFont(new Font("Verdana",Font.PLAIN,12));
        confirmPassword.setForeground(Color.BLACK);
        confirmPassword.setBounds(900,420,180,30);

        userConfirmPasswordtextarea = new JTextField( );
        userConfirmPasswordtextarea.setFont(new Font("Verdana",Font.PLAIN,12));
        userConfirmPasswordtextarea.setForeground(Color.BLACK);
        userConfirmPasswordtextarea.setBounds(900,450,230,40);


        securityQuestion = new JLabel("Select your security question");
        securityQuestion.setFont(new Font("Verdana",Font.PLAIN,12));
        securityQuestion.setForeground(Color.BLACK);
        securityQuestion.setBounds(1150,420,180,30);


        questionSelector = new JComboBox<>(questions);
        questionSelector.setBackground(Color.WHITE);
        questionSelector.setBounds(1150,450,240,40);

        securityAnswer = new JLabel("Write security question answer");
        securityAnswer.setFont(new Font("Verdana",Font.PLAIN,12));
        securityAnswer.setForeground(Color.BLACK);
        securityAnswer.setBounds(900,520,200,30);

        userSAtextarea = new JTextArea();
        userSAtextarea.setFont(new Font("Verdana",Font.PLAIN,12));
        userSAtextarea.setForeground(Color.BLACK);
        userSAtextarea.setBounds(900,550,480,90);
        userSAtextarea.setAutoscrolls(true);

        registerBtn = new JButton("Register");
        registerBtn.setFont(new Font("Verdana",Font.BOLD,16));
        registerBtn.setForeground(Color.WHITE);
        registerBtn.setBackground(Color.decode("#03A6FF"));
        registerBtn.setBorder(BorderFactory.createEmptyBorder());
        registerBtn.setBounds(1000,700,280,50);
        registerBtn.setCursor(new Cursor(Cursor.HAND_CURSOR));
        registerBtn.setFocusable(false);
        registerBtn.addActionListener(this);

        //Adding the components to page
        add(leftSidePanel);
        add(accountExists);
        add(Login);
        add(rightSideHeading);
        add(userFirstName);
        add(userFNtextarea);
        add(userLastName);
        add(userLNtextarea);
        add(username);
        add(userNametextarea);
        add(password);
        add(userPasswordtextarea);
        add(confirmPassword);
        add(userConfirmPasswordtextarea);
        add(securityQuestion);
        add(questionSelector);
        add(securityAnswer);
        add(userSAtextarea);
        add(registerBtn);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String fetchEvent;
        if(e.getSource() == registerBtn){
            fetchEvent = "registerBtn";
            new RegisterpageEventController().getMemberAndEventSource(fetchEvent,userFNtextarea.getText(),userLNtextarea.getText(),userNametextarea.getText(),userPasswordtextarea.getText(), userConfirmPasswordtextarea.getText(),questionSelector.getSelectedItem().toString(),userSAtextarea.getText());
        }
    }
}
