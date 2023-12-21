package cssp.controller;
import cssp.gui.RegisterPage;
import cssp.gui.LoginPage;
public class HomepageEventController{

    public void getEventSource(String e) {
        if(e.equals("LoginBottom")){
            new LoginPage().loginpage.setVisible(true);
        }
        if (e.equals("RegisterBottom")){
            new RegisterPage().setVisible(true);
        }
        if (e.equals("Register")){
            new RegisterPage().setVisible(true);
        }
        if (e.equals("Login")){
            new LoginPage().loginpage.setVisible(true);
        }
    }
}