package cssp.model;
import cssp.controller.DatabaseController;
public class MatchUserAccountDeletion extends DatabaseController {
    public void matchuserAccountDeletion(String password, String answer){
        try{
            matchSecurityAnswerAndPassword = con.prepareStatement("delete from cssp_users where (password = ? ) and (security_answer = ?)");
            matchSecurityAnswerAndPassword.setString(1,password);
            matchSecurityAnswerAndPassword.setString(2,answer);
            matchSecurityAnswerAndPassword.executeUpdate();
        }catch (Exception e){/* */}
    }
}
