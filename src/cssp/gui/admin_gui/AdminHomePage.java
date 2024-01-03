package cssp.gui.admin_gui;

import javax.swing.*;
import java.awt.*;

public class AdminHomePage extends JFrame {
    final JPanel sideNav;
    final JLabel productName;
    final JButton dashboard;
    final JButton analytics;
    final JButton customers;
    public AdminHomePage(){
        setTitle("Code Snippet Sharing Platform - v1.0");
        setLayout(null);
        setSize(1920,1080);
        setResizable(false);
        setVisible(false);
        setLocationRelativeTo(null);
        getContentPane().setBackground(Color.decode("#ffffff"));
        this.setBackground(Color.WHITE);

        sideNav = new JPanel(null);
        sideNav.setBounds(0,0,220,1080);
        sideNav.setBackground(Color.decode("#F8F8F8"));

        productName = new JLabel("CSSP");
        productName.setFont(new Font("Verdana",Font.BOLD,22));
        productName.setBounds(70,20,180,30);
        productName.setForeground(Color.decode("#151515"));

        ImageIcon dashboardIcon = new ImageIcon("src/cssp/gui/admin_gui/admin_assets/dashboard.png");
        dashboard = new JButton("Dashboard",dashboardIcon);
        dashboard.setBackground(Color.decode("#FFFFFF"));
        dashboard.setBorder(BorderFactory.createSoftBevelBorder(0,Color.decode("#EEEEEE"),Color.decode("#EEEEEE")));
        dashboard.setForeground(Color.decode("#151515"));
        dashboard.setFocusable(false);
        dashboard.setCursor(new Cursor(Cursor.HAND_CURSOR));
        dashboard.setBounds(20,80,180,45);

        ImageIcon graph = new ImageIcon("src/cssp/gui/admin_gui/admin_assets/analytics.png");
        analytics = new JButton("Analytics",graph);
        analytics.setBackground(Color.decode("#FFFFFF"));
        analytics.setBorder(BorderFactory.createSoftBevelBorder(0,Color.decode("#EEEEEE"),Color.decode("#EEEEEE")));
        analytics.setForeground(Color.decode("#151515"));
        analytics.setFocusable(false);
        analytics.setCursor(new Cursor(Cursor.HAND_CURSOR));
        analytics.setBounds(20,180,180,45);

        ImageIcon people = new ImageIcon("src/cssp/gui/admin_gui/admin_assets/people.png");
        customers = new JButton("Customers Details",people);
        customers.setBackground(Color.decode("#FFFFFF"));
        customers.setBorder(BorderFactory.createSoftBevelBorder(0,Color.decode("#EEEEEE"),Color.decode("#EEEEEE")));
        customers.setForeground(Color.decode("#151515"));
        customers.setFocusable(false);
        customers.setCursor(new Cursor(Cursor.HAND_CURSOR));
        customers.setBounds(20,280,180,45);


        add(sideNav);
        sideNav.add(productName);
        sideNav.add(dashboard);
        sideNav.add(analytics);
        sideNav.add(customers);
    }

    public static void main(String[] args) {
        new AdminHomePage().setVisible(true);
    }
}
