/**
 * This class handles all the database related workings
 */
package cssp.controller;
import java.sql.*;
public class DatabaseController {
    protected Connection con;
    protected PreparedStatement insertUserDetail;
    protected PreparedStatement getTotalcount;
    protected PreparedStatement matchCredential;
    protected PreparedStatement fetchUserRealName;
    protected PreparedStatement fetchPersonalInformation;
    protected PreparedStatement fetchUserSecurityQuestion;
    protected PreparedStatement matchSecurityAnswerAndPassword;
    protected PreparedStatement createNewPost;
    protected PreparedStatement fetchPost;
    protected PreparedStatement fetchPostDetails;
    public DatabaseController() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3300/cssp", "tushar", "tushar");
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
     }

}
