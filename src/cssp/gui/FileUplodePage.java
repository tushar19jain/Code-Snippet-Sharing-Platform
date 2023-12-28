package cssp.gui;

import cssp.controller.FileUplodePageController;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileUplodePage extends JDialog implements ActionListener {
    public String [] languages = {"C","C++","JAVA",".NET","HTML","CSS","JAVASCRIPT","REACT JS","NEXT JS","Others"};
    public String path;
    final JLabel fileTItle;
    final  JTextField fileTitleTextfield;
    final  JLabel fileDescription;
    final  JTextArea fileDescriptionTextField;
   // JScrollPane scroll;
    final JLabel tags;
    final JTextField tagsTextField;
    final JLabel selectLanguage;
    final JComboBox selectFileMenu = new JComboBox<>(languages);
    final JTextField selectFileTextField;
    final JButton selectFileButton;
    final JButton uplode;
    File file;
   public FileUplodePage(){
        setTitle("Upload file to CSSP");
        setSize(720,500);
        setLocationRelativeTo(null);
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);
        setModal(true);
        setVisible(false);

        fileTItle = new JLabel("File title");
        fileTItle.setFont(new Font("Verdana",Font.PLAIN,12));
        fileTItle.setForeground(Color.BLACK);
        fileTItle.setBounds(220,30,180,20);

        fileTitleTextfield = new JTextField();
        fileTitleTextfield.setBorder(BorderFactory.createBevelBorder(0,Color.decode("#C1C1C1"),Color.decode("#C1C1C1")));
        fileTitleTextfield.setBackground(Color.WHITE);
        fileTitleTextfield.setBounds(220,50,250,30);

        fileDescription = new JLabel("File description");
        fileDescription.setFont(new Font("Verdana",Font.PLAIN,12));
        fileDescription.setForeground(Color.BLACK);
        fileDescription.setBounds(220,90,180,20);

        fileDescriptionTextField = new JTextArea();
        fileDescriptionTextField.setBorder(BorderFactory.createBevelBorder(0,Color.decode("#C1C1C1"),Color.decode("#C1C1C1")));
        fileDescriptionTextField.setBackground(Color.WHITE);
        fileDescriptionTextField.setBounds(220,110,250,60);
        //scroll = new JScrollPane(fileDescriptionTextField,JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);

        tags = new JLabel("Add tags (max 3)");
        tags.setFont(new Font("Verdana",Font.PLAIN,12));
        tags.setForeground(Color.BLACK);
        tags.setBounds(220,180,180,20);

        tagsTextField = new JTextField();
        tagsTextField.setBorder(BorderFactory.createBevelBorder(0,Color.decode("#C1C1C1"),Color.decode("#C1C1C1")));
        tagsTextField.setBackground(Color.WHITE);
        tagsTextField.setBounds(220,210,250,30);

        selectLanguage = new JLabel("Select language");
        selectLanguage.setFont(new Font("Verdana",Font.PLAIN,12));
        selectLanguage.setForeground(Color.BLACK);
        selectLanguage.setBounds(220,260,130,20);

        selectFileMenu.setBounds(360,260,110,20);

        selectFileTextField = new JTextField();
        selectFileTextField.setBounds(220,300,140,30);
        selectFileTextField.setBorder(BorderFactory.createBevelBorder(0,Color.decode("#C1C1C1"),Color.decode("#C1C1C1")));
        selectFileTextField.setBackground(Color.WHITE);

        ImageIcon document = new ImageIcon("src/cssp/gui/Assets/documents (1).png");

        selectFileButton = new JButton("Select file",document);
        selectFileButton.setBounds(370,300,100,30);
        selectFileButton.setBackground(Color.decode("#186ADE"));
        selectFileButton.setForeground(Color.WHITE);
        selectFileButton.setBorder(BorderFactory.createEmptyBorder());
        selectFileButton.setFocusable(false);
        selectFileButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        selectFileButton.addActionListener(this);

        uplode = new JButton("UPLODE");
        uplode.setBounds(300,350,100,30);
        uplode.setBackground(Color.decode("#D3D3D3"));
        uplode.setForeground(Color.BLACK);
        uplode.setBorder(BorderFactory.createEmptyBorder());
        uplode.setFocusable(false);
        uplode.setCursor(new Cursor(Cursor.HAND_CURSOR));
        uplode.addActionListener(this);

        add(fileTItle);
        add(fileTitleTextfield);
        add(fileDescription);
       // add(scroll);
        add(fileDescriptionTextField);
        add(tags);
        add(tagsTextField);
        add(selectLanguage);
        add(selectFileMenu);
        add(selectFileTextField);
        add(selectFileButton);
        add(uplode);
    }

    public static void main(String[] args) {
        new FileUplodePage().setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == uplode){
            System.out.println("Clicked");
            new FileUplodePageController().getFileContent(fileTitleTextfield.getText(), fileDescriptionTextField.getText(), tagsTextField.getText(), selectFileMenu.getSelectedItem().toString(),path);
        }
        if(e.getSource() == selectFileButton){
            JFileChooser fileChooser = new JFileChooser();
            int option = fileChooser.showOpenDialog(null);
            if (option == JFileChooser.APPROVE_OPTION){
                System.out.printf("Selected");
                file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                path = file.getAbsolutePath();

            }else {
                System.out.println("not selected");
            }
        }
    }
}
