/**
 * This class handles all the database related workings
 */
package cssp.controller;
import oracle.jdbc.proxy.annotation.Pre;

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
    public DatabaseController() {
        try {
            Class.forName("oracle.jdbc.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "tiger");
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
     }

}
