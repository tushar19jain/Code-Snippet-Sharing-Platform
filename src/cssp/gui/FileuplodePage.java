package cssp.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFileChooser;


public class FileuplodePage implements ActionListener {
    public JFrame frame;
    final JLabel greet;
    final JLabel fileTitle;
    public JTextField fileTitleTextfield;
    final JLabel fileDescription;
    public JTextArea fileDescriptionTextArea;
    public JFileChooser uplodeFile;
    public JButton fileC;

    public FileuplodePage() {
        frame = new JFrame();
        frame.getContentPane().setBackground(Color.decode("#ffffff"));
        frame.setTitle("Code Snippet Sharing Platform - v1.0");
        frame.setLayout(null);
        frame.setSize(1920, 1080);
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);

        greet = new JLabel("Upload a new file");
        greet.setFont(new Font("Verdana", Font.BOLD, 20));
        greet.setForeground(Color.BLACK);
        greet.setBounds(40, 40, 280, 30);

        fileTitle = new JLabel("Give a title to you file");
        fileTitle.setFont(new Font("Verdana", Font.BOLD, 16));
        fileTitle.setForeground(Color.BLACK);
        fileTitle.setBounds(40, 140, 380, 30);

        fileTitleTextfield = new JTextField();
        fileTitleTextfield.setFont(new Font("Verdana", Font.PLAIN, 16));
        fileTitleTextfield.setForeground(Color.BLACK);
        fileTitleTextfield.setBounds(40, 200, 380, 35);

        fileDescription = new JLabel("Little description about you code file");
        fileDescription.setFont(new Font("Verdana", Font.BOLD, 16));
        fileDescription.setForeground(Color.BLACK);
        fileDescription.setBounds(40, 280, 380, 30);

        fileDescriptionTextArea = new JTextArea(4, 4);
        fileDescriptionTextArea.setFont(new Font("Verdana", Font.PLAIN, 16));
        fileDescriptionTextArea.setForeground(Color.BLACK);
        fileDescriptionTextArea.setBounds(40, 320, 380, 140);
        fileDescriptionTextArea.setBorder(BorderFactory.createBevelBorder(1, Color.BLACK, Color.BLACK));

        fileC = new JButton("Uplode File");
        fileC.setBackground(Color.black);
        fileC.setForeground(Color.WHITE);
        fileC.setFont(new Font("Monospace", Font.BOLD, 16));
        fileC.setBounds(40, 480, 180, 40);
        fileC.setFocusable(false);
        fileC.setBorder(BorderFactory.createEmptyBorder());
        fileC.setCursor(new Cursor(Cursor.HAND_CURSOR));
        fileC.addActionListener(this);

        frame.add(greet);
        frame.add(fileTitle);
        frame.add(fileTitleTextfield);
        frame.add(fileDescription);
        frame.add(fileDescriptionTextArea);
        frame.add(fileC);
    }

    public static void main(String[] args) {
        new FileuplodePage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == fileC) {
            uplodeFile = new JFileChooser();
            int result = uplodeFile.showOpenDialog(null);
        }
    }
}
