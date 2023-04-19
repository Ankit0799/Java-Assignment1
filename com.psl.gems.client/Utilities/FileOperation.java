package Utilities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileOperation {
    public static void write(String output){
        File myFile = new File("Resources/cardgame.html");
        try {
            if(myFile.createNewFile()){
                System.out.println("File Created.");
            } else {
                System.out.println("File Already Exist");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter(myFile);
            myWriter.write(output);
            myWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
