package cssp.model;
import cssp.controller.DatabaseController;
import cssp.gui.UserProfileManagementPage;
import java.sql.ResultSet;
public class FetchUserPersonalDetails extends DatabaseController {
    String firstname;
    String lastname;
    String username;
    public void fetchUserPersonalDetails(int token){
        try {
            fetchPersonalInformation = con.prepareStatement("select first_name, last_name, username from cssp_users where user_id = ?");
            fetchPersonalInformation.setInt(1,token);
            ResultSet result = fetchPersonalInformation.executeQuery();
            while (result.next()){
                firstname = result.getString("first_name");
                lastname = result.getString("last_name");
                username = result.getString("username");
                new UserProfileManagementPage().getPersonalInfo(firstname,lastname,username);
            }
        }catch (Exception e){/* */}
    }
}
