package cssp.controller;

import cssp.model.MatchUserAccountDeletion;

public class AccountDeletionConfirmationController{
    public String answer;
    public String password;
    public void getEventSource(String event, String pwd, String ans){
        if (event.equals("confirm")){
            password = pwd;
            answer = ans;
            if (!password.isBlank()){
                if (!answer.isBlank()){
                    //System.out.println("confirmed");
                    new MatchUserAccountDeletion().matchuserAccountDeletion(password,answer);
                }
                else {
                    System.out.println("Answer doesn't match");
                }
            }
            else {
                System.out.println("password doesn't match");
            }
        }
    }
}