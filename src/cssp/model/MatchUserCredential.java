package cssp.model;
import cssp.controller.DashboardEventController;
import cssp.controller.DatabaseController;
import cssp.gui.DashboardPage;
import java.sql.ResultSet;

public class MatchUserCredential extends DatabaseController {
    protected  int uniqueToken;
    public void matchData(String username, String password){
        try {
            matchCredential = con.prepareStatement("select * from cssp_user where (username = ? ) and (password = ? )");
            matchCredential.setString(1,username);
            matchCredential.setString(2,password);
            ResultSet result = matchCredential.executeQuery();
            while (result.next()){
                try {
                    uniqueToken = result.getInt(1);
                    System.out.println("Match user" + " " + uniqueToken);
                    new FetchUserRealName().getUserRealName(uniqueToken);
                    new DashboardEventController().getToken(uniqueToken);
                }catch (Exception e){
                    System.out.println(e);
                }
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
