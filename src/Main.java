/*
  This is the main class from where the application execution begins
  It imports the HomePage class from GUI package and call its constructor

  The whole project is based on MVC (Model View Controller)
  All the GUI component classes are made in cssp.gui package
  All the GUI component control classes are made in cssp.controller package
  All the database related operation classes are made in cssp.model package
 */
import cssp.gui.HomePage;
public class Main {
    public static void main(String[] args){
        new HomePage().setVisible(true); // Solved the GUI appearing problem.
    }
}
