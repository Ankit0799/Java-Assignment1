package Utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
    //To write into file
    public static void write(String output){
        File myFile = new File("Resources/cardgame.html"); //Creating a file cardgame.html
        try {
            if(myFile.createNewFile()){ //Trying to create new file
                System.out.println("File Created.");
            } else {    //if files creation return false implies file already exist.
                System.out.println("File Already Exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter(myFile);
            myWriter.write(output); //Writing output to created file.
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
