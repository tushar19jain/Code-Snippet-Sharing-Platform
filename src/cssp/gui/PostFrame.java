package cssp.gui;

import javax.swing.*;
import java.awt.*;

public class PostFrame extends JPanel {
    public JLabel firstname;
    public JLabel lastname;
    public JLabel username;
    public JLabel date;
    public JLabel caption;
    public JLabel starCount;
 //   final JLabel userIcon;

    PostFrame() {
        setLayout(null);
        setBounds(500,200,900,520);

        firstname = new JLabel("Tushar");
        lastname = new JLabel("Jain");
        username = new JLabel("@tush");
        date = new JLabel("12 Dec 2023");
        caption = new JLabel("C++ program for addition using classes in OPPS");
        starCount = new JLabel("2");

      //  ImageIcon usericon = new ImageIcon("src/cssp/gui/Assets/undraw_Male_avatar_g98d.png");
      //  userIcon = new JLabel(usericon,SwingConstants.RIGHT);
       // add(userIcon);
       // userIcon.setBounds(10,10,180,30);
        firstname.setBounds(30,10,180,30);
        add(firstname);
        lastname.setBounds(80,10,180,30);
        add(lastname);
        username.setBounds(130,10,180,30);
        username.setForeground(Color.decode("#311FFF"));
        add(username);
    }
}
