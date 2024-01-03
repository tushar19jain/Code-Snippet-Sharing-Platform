package cssp.model;
import cssp.controller.DashboardEventController;
import cssp.controller.DatabaseController;
import cssp.gui.BanStatus;
import cssp.gui.DashboardPage;
import cssp.gui.admin_gui.AdminHomePage;

import java.sql.ResultSet;
public class MatchUserCredential extends DatabaseController {
    protected  int uniqueToken;
    protected String user;
    protected int status;
    public void matchData(String username, String password){
        try {
            matchCredential = con.prepareStatement("select * from cssp_users where (username = ? ) and (password = ? )");
            matchCredential.setString(1,username);
            matchCredential.setString(2,password);
            ResultSet result = matchCredential.executeQuery();
            while (result.next()){
                try {
                    uniqueToken = result.getInt(1);
                    user = result.getString("role");
                    status = result.getInt("state");
                    if (user.equals("user") && status == 0){
                        new DashboardPage().setVisible(true);
                    } else if (user.equals("admin")&& status == 0){
                        new AdminHomePage().setVisible(true);
                    } else if (user.equals("user") && status == 1) {
                        new BanStatus().setVisible(true);
                    }else if (user.equals("admin") && status == 1) {
                        new BanStatus().setVisible(true);
                    }

                    TokenManager.setToken(uniqueToken);
                    System.out.println(uniqueToken);
                    new FetchUserRealName().getUserRealName(uniqueToken);
                    new DashboardEventController().getToken(uniqueToken);
                } catch (Exception error){/**/}
            } result.close();
        }catch (Exception exception){/**/}
    }
}
