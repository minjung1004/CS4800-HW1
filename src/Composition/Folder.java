package Composition;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    // prints out all subfolder and files
    private String name;
    private List<Folder> subFolders = new ArrayList<>();
    private List<File> subFiles = new ArrayList<>();

    public Folder(String folderName){
        this.name = folderName;
    }
    public String getFolderName(){
        return name;
    }
    public List<Folder> getSubFolders() {
        return subFolders;
    }
    // add subfolders
    //delete subfolders

    public List<File> getSubFiles(){
        return subFiles;
    }
    // add files

}
