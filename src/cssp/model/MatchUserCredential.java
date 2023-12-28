package cssp.model;
import cssp.controller.DashboardEventController;
import cssp.controller.DatabaseController;
import java.sql.ResultSet;
import java.sql.SQLDataException;
public class MatchUserCredential extends DatabaseController {
    protected  int uniqueToken;
    public void matchData(String username, String password){
        try {
            matchCredential = con.prepareStatement("select * from cssp_users where (username = ? ) and (password = ? )");
            matchCredential.setString(1,username);
            matchCredential.setString(2,password);
            ResultSet result = matchCredential.executeQuery();
            while (result.next()){
                try {
                    uniqueToken = result.getInt(1);
                    TokenManager.setToken(uniqueToken);
                    new FetchUserRealName().getUserRealName(uniqueToken);
                    new DashboardEventController().getToken(uniqueToken);
                }catch (SQLDataException error){/**/}
            }
        }catch (Exception exception){/**/}
    }
}
