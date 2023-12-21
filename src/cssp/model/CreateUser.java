package cssp.model;
import cssp.controller.DatabaseController;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CreateUser extends DatabaseController {
    public void create_user(String user_firstname, String user_lastname, String password, String username, String security_question, String security_answer) throws SQLException {
        int totalUser = 0; // Initialize to a default value

        getTotalcount = con.prepareStatement("select count(user_id) from cssp_user");
        ResultSet getCount = getTotalcount.executeQuery();

        while (getCount.next()) {
            totalUser = getCount.getInt(1);
            System.out.println(totalUser);
        }

        insertUserDetail = con.prepareStatement("insert into cssp_user values (?, ?, ?, ?, ?, ?,?, 1, 0)");
        insertUserDetail.setInt(1, totalUser + 1); // Assuming user_id is an integer
        insertUserDetail.setString(2, user_firstname);
        insertUserDetail.setString(3, user_lastname);
        insertUserDetail.setString(4, password);
        insertUserDetail.setString(5, username);
        insertUserDetail.setString(6, security_question);
        insertUserDetail.setString(7, security_answer);
        insertUserDetail.executeUpdate();
    }
}
