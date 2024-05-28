package activities;

import java.io.File;
import  java.io.IOException;
import  org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) throws IOException {
        try{ File file = new File("C:\\Users\\07097K744\\Desktop\\newfile.txt");
            boolean fstatus = file.createNewFile();
            if(fstatus){
                System.out.println("File created successfully");
            }else{
                System.out.println("File already exist in file");
            }

            //get the file object
            File fileUtil =  FileUtils.getFile("C:\\Users\\07097K744\\Desktop\\newfile.txt");
            //Read file
            System.out.println("Data in file: " + FileUtils.readFileToString(fileUtil,"UTF8"));

            //create directory
            File destDir = new File("resources");
            //Copy file to directory
            FileUtils.copyFileToDirectory(file,destDir);

            //Get file from new directory
            File newFile = FileUtils.getFile(destDir,"newfile.txt");
            //Read data from file
            String newFileData = FileUtils.readFileToString(newFile,"UTF8");
            //Print it
            System.out.println("Data in new file: " + newFileData);


    }catch (IOException errMessage){
            System.out.println(errMessage);
        }

    }
}
