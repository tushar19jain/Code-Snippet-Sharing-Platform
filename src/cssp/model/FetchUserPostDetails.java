package cssp.model;

import cssp.controller.DatabaseController;
import cssp.gui.PostFrame;

import java.sql.ResultSet;

public class FetchUserPostDetails extends DatabaseController {
    public void fetchUserPostDetails(){
        String query = "SELECT user_id, file_title, file_description, file_like_count, language, date_of_uplode, code_file FROM cssp_files";
       try{
            fetchPostDetails = con.prepareStatement(query);
           ResultSet resultSet = fetchPostDetails.executeQuery();
          /* while (resultSet.next()){
               // workin on geting the data from database;
               System.out.println(resultSet.getString("file_title"));
               System.out.println(resultSet.getString("file_description"));
               System.out.println(resultSet.getString("language"));
               System.out.println(resultSet.getString("date_of_uplode"));
           }*/
       }catch (Exception e){
           System.out.println(e);
       }
    }
}
