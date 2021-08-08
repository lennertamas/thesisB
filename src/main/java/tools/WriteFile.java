package tools;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {


    private File registerFile;


    public void createSignUpDataFile() {
        try {
            registerFile = new File("datas/RegisterBlank.txt");
            if (registerFile.createNewFile()) {
                System.out.println("Email file created:" + registerFile.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (IOException e) {
            System.out.println("An error occured with creating Sign Up Email file.");
            e.printStackTrace();
        }
    }


    public void writeToSignUpDataFile(String email, String name, String password) {
        String blankDatas = ("Email = " + email + "\n" + "Name = " + name + "\n" + "Password = " + password);
        try {
            FileWriter signUpEmailWriter = new FileWriter("datas/RegisterBlank.txt");
            signUpEmailWriter.write(blankDatas);
            signUpEmailWriter.close();
            System.out.println("Sucessfully wrote to the Sign up Email file");
        } catch (IOException e) {
            System.out.println("An error occured with writing to Sign up Email file");
            e.printStackTrace();
        }
    }
}
