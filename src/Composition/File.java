package Composition;

public class File {
   private String fileName;

   public File(String fileName){
       this.fileName = fileName;
   }

   public String getFileName(){
       return fileName;
   }

   public String display(int tab){
       String output = "";
       for(int file = 0; file < tab; file++){
           output += ("+");
       }
       output += ("File: " + fileName + "\n");
       return output;
   }

}
