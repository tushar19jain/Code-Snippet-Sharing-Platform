package cssp.controller;
import cssp.model.FetchUserPersonalDetails;
import cssp.model.MatchUserCredential;
import cssp.model.TokenManager;
import cssp.gui.FileUplodePage;
public class DashboardEventController extends MatchUserCredential {
    public int tokenNumber;
    public void getToken(int token){
        setToken(token);
    }

    private void setToken(int token){
        tokenNumber = token;
    }
    public void getEventSource(String e){
        if (e.equals("uplode")){
            new FileUplodePage().setVisible(true);
        }
        if (e.equals("myprofile")){
            new FetchUserPersonalDetails().fetchUserPersonalDetails(TokenManager.getToken());
        }
    }
}
