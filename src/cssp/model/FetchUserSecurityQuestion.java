package cssp.model;

import cssp.controller.DatabaseController;
import cssp.gui.AccountDeletionConfirmationPage;

import java.sql.ResultSet;

public class FetchUserSecurityQuestion extends DatabaseController {
    protected String securityQuestion;
    public void getUserSecurityQuestion(int token){
        try {
            System.out.println(token);
            fetchUserSecurityQuestion = con.prepareStatement("select securityquestion from cssp_user where user_id = ?");
            fetchUserSecurityQuestion.setInt(1,token);
            ResultSet resultSet = fetchUserSecurityQuestion.executeQuery();
            while (resultSet.next()){
                securityQuestion = resultSet.getString("securityquestion");
                System.out.println(securityQuestion);
                new AccountDeletionConfirmationPage().setSecurityQuestion(securityQuestion);
            }
        }catch (Exception exception){
            System.out.println(exception);
        }
    }
}
