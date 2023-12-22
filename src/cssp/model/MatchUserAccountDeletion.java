package cssp.model;

import cssp.controller.DatabaseController;
import cssp.gui.HomePage;

public class MatchUserAccountDeletion extends DatabaseController {
    public void matchuserAccountDeletion(String password, String answer){
        try{
            matchSecurityAnswerAndPassword = con.prepareStatement("delete from cssp_user where (password = ? ) and (securityanswer = ?)");
            matchSecurityAnswerAndPassword.setString(1,password);
            matchSecurityAnswerAndPassword.setString(2,answer);
            matchSecurityAnswerAndPassword.executeQuery();
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
