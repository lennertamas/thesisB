package tools;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteDataFile {


    private File saveDataFile;


    public void createSavedDataFile() {
        try {
            saveDataFile = new File("datas/SavedDataFromPage.txt");
            if (saveDataFile.createNewFile()) {
                System.out.println("Email file created:" + saveDataFile.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occured with creating Sign Up Email file.");
            e.printStackTrace();
        }
    }


    public void writeToSavedDataFile(String saved) {
        String saveDatas = ("Saved Data: " + saved);
        try {
            FileWriter signUpEmailWriter = new FileWriter("datas/SavedDataFromPage.txt");
            signUpEmailWriter.write(saveDatas);
            signUpEmailWriter.close();
            System.out.println("Sucessfully wrote to the Sign up Email file");
        } catch (IOException e) {
            System.out.println("An error occured with writing to Sign up Email file");
            e.printStackTrace();
        }
    }
}