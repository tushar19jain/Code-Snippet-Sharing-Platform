package cssp.controller;
import cssp.gui.RegisterPage;
import  cssp.gui.ErrorPage;
import cssp.model.CreateUser;
public class RegisterpageEventController extends RegisterPage {
    public void getMemberAndEventSource(String eventSoure, String fName, String lName, String username, String password, String confirmPassword, String securityQuestion, String securityAnswer) {
        if (eventSoure.equals("registerBtn")){
            System.out.println(securityQuestion);
            System.out.println(securityAnswer);
            if (!fName.isBlank()){
                if (!lName.isBlank()){
                    if (!username.isBlank()){
                        if (!password.isBlank()){
                            if(!confirmPassword.isBlank()){
                                if (confirmPassword.equals(password)){
                                    if (!securityAnswer.isBlank()){
                                        try {
                                            new CreateUser().create_user(fName,lName,password,username,securityQuestion,securityAnswer);
                                        }catch (Exception e){
                                            System.out.println(e + "Can not create user");
                                        }
                                    }
                                    else {
                                        new ErrorPage().getErrorCode("Security answer is needed!");
                                    }
                                }
                                else {
                                    new ErrorPage().getErrorCode("* Password mismatch ! Try again *");
                                }
                            }
                            else {
                                new ErrorPage().getErrorCode("* enter confirm password *");
                            }
                        }
                        else {
                            new ErrorPage().getErrorCode("* password in needed *");
                        }
                    }
                    else {
                        new ErrorPage().getErrorCode("* Create a username *");
                    }
                }
                else {
                    new ErrorPage().getErrorCode("* Last name is needed *");
                }
            }
            else {
                new ErrorPage().getErrorCode("* First name is needed *");
            }
        }
        else{
            System.out.println("Button not clicked");
        }
    }
}

