package cssp.gui;

import javax.swing.*;
import java.awt.*;

public class PostFrame extends JFrame {
    public JLabel name;
    public JLabel username;
    public JLabel date;
    public JLabel caption;
    public JLabel starCount;
    JTextArea codeArea;
 //   final JLabel userIcon;

   public PostFrame() {
        setLayout(null);
        setBounds(500,200,900,520);

        name = new JLabel(" ");
        username = new JLabel("@tush");
        date = new JLabel("12 Dec 2023");
        caption = new JLabel("C++ program for addition using classes in OPPS");
        starCount = new JLabel("2");
        date = new JLabel("12/feb/2023");
        name.setBounds(30,10,180,30);
        add(name);
        username.setBounds(130,10,180,30);
        username.setForeground(Color.decode("#311FFF"));
        date.setBounds(30,30,180,30);
        codeArea = new JTextArea();
        caption = new JLabel("C++ program using classes.");
        caption.setBounds(30,50,280,30);
        codeArea.setBounds(100,70, 700,400);
        codeArea.setBackground(Color.BLACK);
        add(caption);
        add(codeArea);
        add(date);
        add(username);
    }

    public void fetchUserPostDetails(String captionText){
      /** name.setText(fullName);
      username.setText(usr);
        date.setText(dateString);**/
        caption.setText(captionText);
    }

    public static void main(String[] args) {
        new PostFrame().setVisible(true);
    }
}
