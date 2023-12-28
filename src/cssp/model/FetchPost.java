package cssp.model;

import cssp.controller.DatabaseController;

import java.sql.ResultSet;

public class FetchPost extends DatabaseController {
    public void fecthPost(){
        try{
            fetchPost = con.prepareStatement("select code_file from cssp_files");
            ResultSet resultSet = fetchPost.executeQuery();
            while (resultSet.next()){
                System.out.println(resultSet.getBlob("code_file"));
            }
        }catch (Exception e){

        }
    }
}
