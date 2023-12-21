package cssp.model;

import cssp.controller.DatabaseController;
import cssp.gui.UserProfileManagementPage;

import java.sql.ResultSet;

public class FetchUserPersonalDetails extends DatabaseController {
    String firstname;
    String lastname;
    String username;
    public void fetchUserPersonalDetails(int token){
        System.out.println("model token" + " " + token);
        try {
            fetchPersonalInformation = con.prepareStatement("select user_firstname, user_lastname, username from cssp_user where user_id = ?");
            fetchPersonalInformation.setInt(1,token);
            ResultSet result = fetchPersonalInformation.executeQuery();
            while (result.next()){
                firstname = result.getString("user_firstname");
                lastname = result.getString("user_lastname");
                username = result.getString("username");
                System.out.println(firstname);
                System.out.println(lastname);
                System.out.println(username);
                new UserProfileManagementPage().getPersonalInfo(firstname,lastname,username);
            }
        }catch (Exception e){

        }
    }
}
