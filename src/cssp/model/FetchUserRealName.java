package cssp.model;
import cssp.controller.DatabaseController;
import java.sql.ResultSet;
import java.lang.String;
import cssp.gui.DashboardPage;

import javax.swing.*;

public class FetchUserRealName extends DatabaseController{
    public String realname;
    public void getUserRealName(int ID){
        try{
            fetchUserRealName = con.prepareStatement("select user_firstname from cssp_user where (user_id = ? )");
            fetchUserRealName.setInt(1,ID);
            ResultSet name = fetchUserRealName.executeQuery();
            while (name.next()){
                realname =  name.getString("user_firstname");
                new DashboardPage().fetchName(realname);
                System.out.println(realname);
            }
        }catch (Exception error){
            System.out.println(error);
        }
    }
}