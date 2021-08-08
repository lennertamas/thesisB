package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tools.ReadFile;


public class RegistrationPage {


    private WebDriver driver;
    JavascriptExecutor js;


    private ReadFile readFile = new ReadFile();

    private final By EMAIL_FIELD_CATCHER = By.xpath("//*[@id=\"regfrontenduser_email\"]");
    private final By NAME_FIELD_CATCHER = By.xpath("//*[@id=\"regfrontenduser_full_name\"]");
    private final By PASSWORD_FIELD_CATCHER = By.id("regfrontenduser_password");

    public String[] registDataArray = readFile.readSignUpDataFile();
    protected String emailData = registDataArray[0];
    protected String nameData = registDataArray[1];
    protected String passwordData = registDataArray[2];

    private final By CHECKBOX_CATCHER = By.xpath("//*[@id=\"regfrontenduser\"]/label");
    private final By REG_BUTTON_CATCHER = By.id("registration");

    private final By ENGAGED_EMAIL_CATCHER = By.xpath("//*[@id=\"regfrontenduser\"]/div[2]/div[2]/p");


    public RegistrationPage(WebDriver driver) {
        this.driver = driver;
    }



    public void markCheckBox() {
        WebElement checkBox = driver.findElement(CHECKBOX_CATCHER);
        checkBox.click();
    }


    public void fillEmail() {
        WebElement emailField = driver.findElement(EMAIL_FIELD_CATCHER);
        emailField.sendKeys(emailData);
    }


    public void fillName(){
        WebElement nameField = driver.findElement(NAME_FIELD_CATCHER);
        nameField.sendKeys(nameData);
    }


    public void fillPassword() {
        WebElement passwordField = driver.findElement(PASSWORD_FIELD_CATCHER);
        passwordField.sendKeys(passwordData);
    }


    public void clickRegButton() {
        WebElement regButton = driver.findElement(REG_BUTTON_CATCHER);
        regButton.click();
    }

    public String validateRegistration() {
        js = (JavascriptExecutor) driver;
        WebElement engagedEmail = driver.findElement(ENGAGED_EMAIL_CATCHER);

        String text = engagedEmail.getText();

        return text;
    }
}
