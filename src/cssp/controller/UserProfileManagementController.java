package cssp.controller;
import cssp.model.FetchUserSecurityQuestion;
import cssp.model.TokenManager;

public class UserProfileManagementController {
    public void getEventSource(String event){
        if (event.equals("accountDeletion")){
            System.out.println("Here I come");
            new FetchUserSecurityQuestion().getUserSecurityQuestion(TokenManager.getToken());
        }
    }
}
