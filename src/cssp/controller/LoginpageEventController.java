package cssp.controller;
import cssp.model.MatchUserCredential;
public class LoginpageEventController {
    public String user;
    public String pass;
    public void matchUserCredential(String username, String password){
            user = username;
            pass = password;
            new MatchUserCredential().matchData(user,pass);
    }

}
