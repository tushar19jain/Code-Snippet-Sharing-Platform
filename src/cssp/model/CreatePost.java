package cssp.model;
import cssp.controller.DatabaseController;

public class CreatePost extends DatabaseController {
    public void createPost(String filename, String fileDescription, String tags, String selectedItem, String path){
        try{
            System.out.println(TokenManager.getToken());
            System.out.println(filename);
            System.out.println(fileDescription);
            System.out.println(tags);
            System.out.println(selectedItem);
            createNewPost = con.prepareStatement("insert into cssp_files (user_id,tags,file_title,file_description,language,code_file) values(?,?,?,?,?,LOAD_FILE(?))");
            createNewPost.setInt(1,TokenManager.getToken());
            createNewPost.setString(2,tags);
            createNewPost.setString(3,filename);
            createNewPost.setString(4,fileDescription);
            createNewPost.setString(5,selectedItem);
            createNewPost.setString(6,path);
            int rowAffective = createNewPost.executeUpdate();
            if (rowAffective > 0){
                System.out.println("Success");
            }else {
                System.out.println("failed");
            }
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
