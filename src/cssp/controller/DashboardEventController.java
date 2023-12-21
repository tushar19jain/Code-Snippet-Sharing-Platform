package cssp.controller;
import cssp.gui.FileuplodePage;
import cssp.model.FetchUserPersonalDetails;
import cssp.model.MatchUserCredential;

public class DashboardEventController extends MatchUserCredential {
    public int tokenNumber;
    public void getToken(int token){
        setToken(token);
    }

    private void setToken(int token){
        tokenNumber = token;
        System.out.println("set token" + " "+ tokenNumber);
    }
    public void getEventSource(String e){
        if (e.equals("uplode")){
            new FileuplodePage().frame.setVisible(true);
        }
        if (e.equals("myprofile")){
            new FetchUserPersonalDetails().fetchUserPersonalDetails(1);
            System.out.println("in if else condition : " + " " + tokenNumber);
        }
    }
}
