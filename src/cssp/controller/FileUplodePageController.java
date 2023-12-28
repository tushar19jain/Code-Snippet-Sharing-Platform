package cssp.controller;

import cssp.model.CreatePost;

public class FileUplodePageController {

    public void getFileContent(String filename, String fileDescription, String tags, String selectedItem, String path) {
        String selectedLanguage = (String) selectedItem;
        if (!filename.isBlank()) {
            if (!fileDescription.isBlank()) {
                if (!tags.isBlank()) {
                    if (!selectedItem.isBlank()) {
                        if (!path.isBlank()) {
                            new CreatePost().createPost(filename, fileDescription, tags, selectedLanguage, path);
                        }
                    }
                }
            }
        }
    }
}
