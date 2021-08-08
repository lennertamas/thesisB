package tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {

    public String[] readSignUpDataFile() {
        String[] dataArray = new String[3];

        try {
            File reader = new File("datas/RegisterBlank.txt");
            Scanner signUpDataFileReader = new Scanner(reader);
            while (signUpDataFileReader.hasNextLine()){
                String data = signUpDataFileReader.nextLine();
                String[] oneData = data.split(" = ");
                if (oneData[0].equals("Email")) {
                    dataArray[0] = oneData[1];
                } else if (oneData[0].equals("Name")) {
                    dataArray[1] = oneData[1];
                } else if (oneData[0].equals("Password")){
                    dataArray[2] = oneData[1];
                }
            }

        signUpDataFileReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return dataArray;
    }
}


