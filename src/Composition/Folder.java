package Composition;

import java.util.ArrayList;
import java.util.List;

public class Folder {
    private String folderName;
    private List<Folder> subFolders = new ArrayList<>();
    private List<File> subFiles = new ArrayList<>();

    public Folder(String folderName){
        this.folderName = folderName;
    }
    public String getFolderName(){
        return folderName;
    }
    public List<Folder> getSubFolders() {
        return subFolders;
    }

    public void addSubFolder(String folderName){
        Folder subFolder = new Folder(folderName);
        this.subFolders.add(subFolder);
    }

    public void addSubFolder (String subFolder, String folderName){
        for(Folder folder : subFolders){
            if(!folder.subFolders.isEmpty()){
                folder.addSubFolder(subFolder, folderName);
            }
            if(folder.getFolderName() == subFolder){
                folder.subFolders.add(new Folder(folderName));
            }
        }
    }

    public void deleteSubFolder(String subFolder){
        for(int folder = 0; folder < this.subFolders.size(); folder++){
            if(!subFolders.get(folder).subFolders.isEmpty()){
                subFolders.get(folder).deleteSubFolder(subFolder);
            }
            if(subFolders.get(folder).getFolderName() == subFolder){
                subFolders.remove(folder);
            }
        }
    }
    public List<File> getSubFiles(){
        return subFiles;
    }

    public void addSubFile(String fileName){
        File subFile = new File(fileName);
        this.subFiles.add(subFile);
    }
    public void addSubFile(String subFolder, String fileName){
        for(Folder folder : subFolders){
            if(!folder.subFolders.isEmpty()){
                folder.addSubFile(subFolder, fileName);
            }
            if(folder.getFolderName() == subFolder){
                folder.subFiles.add(new File(fileName));
            }
        }
    }

    public String display(){
        String output = ("Folder: " + getFolderName() + "\n");
        for(Folder folder : subFolders){
            output += folder.display(1);
        }
        for(File file : subFiles) {
            output += file.display(0);
        }
        return output;
    }

    public String display(int tab){
        String output = "";
        for(int folderLevel = 0; folderLevel < tab; folderLevel++){
            output += ("-");
        }
        tab++;
        output += ("Folder: " + getFolderName() + "\n");
        for(Folder folder : subFolders){
            output += folder.display(tab);
        }
        for(File file : subFiles){
            output += file.display((tab));
        }
        return output;
    }
}
