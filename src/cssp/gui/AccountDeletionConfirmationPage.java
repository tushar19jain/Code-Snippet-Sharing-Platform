package cssp.gui;

import javax.swing.*;
import java.awt.*;

public class AccountDeletionConfirmationPage extends JDialog {
    final JLabel accountDeletionHeading;
    final JLabel accountDeletionInfo;
    final JLabel accountDeletionInfo2;
    final JLabel accountDeletionInfo3;
    final JLabel currentPassword;
    final  JTextField currentPasswordTextfiled;
    final JLabel accountDeletionInfo4;
    public JLabel getSecurityQuestion;
    final JTextField matchSecurityQuestion;
    final JButton confirm;
    final JButton cancel;
   public AccountDeletionConfirmationPage(){
        setModal(true);
        setTitle("Permanent Account Deletion");
        setLayout(null);
        setSize(700,450);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.WHITE);
        setVisible(false);

        ImageIcon warning = new ImageIcon("src/cssp/gui/Assets/warning.png");
        accountDeletionHeading = new JLabel("We'll be sad to see you go!",warning,SwingConstants.LEFT);
        accountDeletionHeading.setFont(new Font("Monospace",Font.BOLD,16));
        accountDeletionHeading.setBounds(50,10,360,40);
        accountDeletionHeading.setForeground(Color.BLACK);

        accountDeletionInfo = new JLabel("Are you sure you want  to delete your account ? Once you do, all posts, your personal information");
        accountDeletionInfo.setFont(new Font("Verdana",Font.PLAIN,12));
        accountDeletionInfo.setBounds(50,40,700,50);
        accountDeletionInfo.setForeground(Color.BLACK);

        accountDeletionInfo2 = new JLabel("will be removed from CSSP forever. You won’t be able to restore the content once deleted. ");
        accountDeletionInfo2.setFont(new Font("Verdana",Font.PLAIN,12));
        accountDeletionInfo2.setBounds(50,55,700,50);
        accountDeletionInfo2.setForeground(Color.BLACK);

        accountDeletionInfo3 = new JLabel("Deleting your account requires your current password");
        accountDeletionInfo3.setFont(new Font("Verdana",Font.PLAIN,12));
        accountDeletionInfo3.setBounds(50,100,700,50);
        accountDeletionInfo3.setForeground(Color.BLACK);

        currentPassword = new JLabel("Current password");
        currentPassword.setFont(new Font("Verdana",Font.BOLD,12));
        currentPassword.setForeground(Color.BLACK);
        currentPassword.setBounds(50,140,180,30);

        currentPasswordTextfiled = new JTextField();
        currentPasswordTextfiled.setFont(new Font("Verdana",Font.PLAIN,13));
        currentPasswordTextfiled.setBackground(Color.decode("#dedede"));
        currentPasswordTextfiled.setBounds(50,170,480,30);
        currentPasswordTextfiled.setBorder(BorderFactory.createBevelBorder(1,Color.BLACK,Color.BLACK));

        accountDeletionInfo4 = new JLabel("For security reason we need to double verify,  answer you security question.");
        accountDeletionInfo4.setFont(new Font("Verdana",Font.BOLD,12));
        accountDeletionInfo4.setBounds(50,200,700,30);

        getSecurityQuestion = new JLabel("");
        getSecurityQuestion.setFont(new Font("Verdana",Font.PLAIN,12));
        getSecurityQuestion.setBounds(50,230,700,30);

        matchSecurityQuestion = new JTextField();
        matchSecurityQuestion.setFont(new Font("Verdana",Font.PLAIN,13));
        matchSecurityQuestion.setBackground(Color.decode("#dedede"));
        matchSecurityQuestion.setBounds(50,260,480,30);
        matchSecurityQuestion.setBorder(BorderFactory.createBevelBorder(0,Color.BLACK,Color.BLACK));

        confirm = new JButton("Delete my account");
        confirm.setFont(new Font("Verdana",Font.BOLD,12));
        confirm.setForeground(Color.WHITE);
        confirm.setFocusable(false);
        confirm.setCursor(new Cursor(Cursor.HAND_CURSOR));
        confirm.setBackground(Color.decode("#FF5454"));
        confirm.setBounds(50,330,160,40);
        confirm.setBorder(BorderFactory.createEmptyBorder());

        cancel = new JButton("Cancel");
        cancel.setFont(new Font("Verdana",Font.BOLD,12));
        cancel.setForeground(Color.BLACK);
        cancel.setFocusable(false);
        cancel.setCursor(new Cursor(Cursor.HAND_CURSOR));
        cancel.setBackground(Color.decode("#F8F8F8"));
        cancel.setBorder(BorderFactory.createBevelBorder(0,Color.BLACK,Color.BLACK));
        cancel.setBounds(230,330,160,40);

        add(accountDeletionHeading);
        add(accountDeletionInfo);
        add(accountDeletionInfo2);
        add(accountDeletionInfo3);
        add(currentPassword);
        add(currentPasswordTextfiled);
        add(accountDeletionInfo4);
        add(getSecurityQuestion);
        add(matchSecurityQuestion);
        add(confirm);
        add(cancel);
   }
   public  void setSecurityQuestion(String question){
    System.out.println("Im am from gui" + " " + question);
     getSecurityQuestion.setText(question);
     setVisible(true);
   }
}
