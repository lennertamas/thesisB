package tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadSavedDataFile {


    public String readSavedData() {
        String savedData = "";

        try {
            File savedDataReader = new File("datas/SavedDataFromPage.txt");
            Scanner savedDataFileReader = new Scanner(savedDataReader);
            while (savedDataFileReader.hasNextLine()) {
                String dataLine = savedDataFileReader.nextLine();
                savedData = savedData + dataLine;
            }

        savedDataFileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        return savedData;
    }
}
