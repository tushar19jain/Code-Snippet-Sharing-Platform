package cssp.gui;

import javax.swing.*;
import java.awt.*;

public class UserProfileManagementPage extends JFrame {
    final JPanel mainframe;
    final JLabel mainframeTitle;
    final JLabel mainframeTitle2;
    final JButton profileinfo;
    final JButton notifications;
    final JLabel profileEditTitle;
    final JLabel userIcon;
    final JLabel firstname;
    final JTextField firstnameText;
    final JLabel lastname;
    final JTextField lastnameText;
    final JLabel username;
    final JTextField usernameText;

    public UserProfileManagementPage() {

        setTitle("Code Snippet Sharing Platform - v1.0");
        setLayout(null);
        setSize(1920, 1080);
        setResizable(false);
        setVisible(true);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("#D3D3D3"));

        mainframe = new JPanel(null);
        mainframe.setBackground(Color.WHITE);
        mainframe.setBounds(60, 60, 1500, 800);
        mainframe.setBorder(BorderFactory.createSoftBevelBorder(0));

        mainframeTitle = new JLabel("User Profile");
        mainframeTitle.setFont(new Font("Verdana", Font.BOLD, 24));
        mainframeTitle.setForeground(Color.black);
        mainframeTitle.setBounds(30, 20, 330, 35);

        profileEditTitle = new JLabel("Personal information");
        profileEditTitle.setFont(new Font("Verdana", Font.BOLD, 24));
        profileEditTitle.setForeground(Color.black);
        profileEditTitle.setBounds(360, 20, 330, 35);


        mainframeTitle2 = new JLabel("management");
        mainframeTitle2.setFont(new Font("Verdana", Font.BOLD, 24));
        mainframeTitle2.setForeground(Color.black);
        mainframeTitle2.setBounds(30, 45, 330, 35);

        ImageIcon user = new ImageIcon("src/cssp/gui/Assets/user.png");
        profileinfo = new JButton("Profile info", user);
        profileinfo.setBounds(35, 150, 180, 40);
        profileinfo.setForeground(Color.BLACK);
        profileinfo.setBackground(Color.decode("#f0efef"));
        profileinfo.setFocusable(false);
        profileinfo.setCursor(new Cursor(Cursor.HAND_CURSOR));
        profileinfo.setBorder(BorderFactory.createEmptyBorder());

        ImageIcon notification = new ImageIcon("src/cssp/gui/Assets/notification.png");
        notifications = new JButton("Notifications", notification);
        notifications.setBounds(35, 230, 180, 40);
        notifications.setForeground(Color.BLACK);
        notifications.setBackground(Color.decode("#f0efef"));
        notifications.setFocusable(false);
        notifications.setCursor(new Cursor(Cursor.HAND_CURSOR));
        notifications.setBorder(BorderFactory.createEmptyBorder());

        ImageIcon userProfileIcon = new ImageIcon("src/cssp/gui/Assets/undraw_Male_avatar_g98d.png");
        userIcon = new JLabel(userProfileIcon);
        userIcon.setBounds(360, 90, userProfileIcon.getIconWidth(), userProfileIcon.getIconHeight());

        firstname = new JLabel("First name");
        firstname.setFont(new Font("Verdana", Font.PLAIN, 12));
        firstname.setForeground(Color.black);
        firstname.setBounds(360, 200, 180, 30);

        firstnameText = new JTextField();
        firstnameText.setFont(new Font("Verdana", Font.PLAIN, 12));
        firstnameText.setForeground(Color.black);
        firstnameText.setBounds(360, 250, 180, 30);

        lastname = new JLabel("Last name");
        lastname.setFont(new Font("Verdana", Font.PLAIN, 12));
        lastname.setForeground(Color.black);
        lastname.setBounds(560, 200, 180, 30);

        lastnameText = new JTextField();
        lastnameText.setFont(new Font("Verdana", Font.PLAIN, 12));
        lastnameText.setForeground(Color.black);
        lastnameText.setBounds(560, 250, 180, 30);

        username = new JLabel("username");
        username.setFont(new Font("Verdana", Font.PLAIN, 12));
        username.setForeground(Color.black);
        username.setBounds(360, 300, 180, 30);

        usernameText = new JTextField();
        usernameText.setFont(new Font("Verdana", Font.PLAIN, 12));
        usernameText.setForeground(Color.black);
        usernameText.setBounds(360, 350, 180, 30);


        add(mainframe);
        mainframe.add(mainframeTitle);
        mainframe.add(mainframeTitle2);
        mainframe.add(profileinfo);
        mainframe.add(notifications);
        mainframe.add(profileEditTitle);
        mainframe.add(userIcon);
        mainframe.add(firstname);
        mainframe.add(firstnameText);
        mainframe.add(lastname);
        mainframe.add(lastnameText);
        mainframe.add(username);
        mainframe.add(usernameText);
    }

    public void getPersonalInfo(String firstname, String lastname, String username) {
        firstnameText.setText(firstname);
        lastnameText.setText(lastname);
        usernameText.setText(username);
    }
}
