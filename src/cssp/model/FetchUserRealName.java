package cssp.model;
import cssp.controller.DatabaseController;
import java.sql.ResultSet;
import java.lang.String;
import cssp.gui.DashboardPage;
public class FetchUserRealName extends DatabaseController{
    public String realName;
    public void getUserRealName(int ID){
        try{
            fetchUserRealName = con.prepareStatement("select first_name from cssp_users where (user_id = ? )");
            fetchUserRealName.setInt(1,ID);
            ResultSet name = fetchUserRealName.executeQuery();
            while (name.next()){
                realName =  name.getString("first_name");
                System.out.println(realName);
                new DashboardPage().fetchName(realName);
            }
        }catch (Exception error){/* */}
    }
}