package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillingDataPage {


    private WebDriver driver;
    JavascriptExecutor js;

    private final By BILLING_NAME_FIELD_CATCHER = By.id("billing_address_name");
    public WebElement billingNameField;



    public BillingDataPage(WebDriver driver) {
        this.driver = driver;
    }



    public void deleteBillingNameData() {
        WebElement billingNameField = driver.findElement(BILLING_NAME_FIELD_CATCHER);

        billingNameField.clear();
    }


    public String reWriteBillingNameData(String newData) throws InterruptedException {
        String result;
        js = (JavascriptExecutor) driver;
        billingNameField = driver.findElement(BILLING_NAME_FIELD_CATCHER);

        billingNameField.clear();
        billingNameField.sendKeys(newData);
        Thread.sleep(1500);
        result = (String) js.executeScript("return arguments[0].value", billingNameField);
        return result;
    }


    public Boolean validateDeleteBillingNameData() {
        billingNameField = driver.findElement(BILLING_NAME_FIELD_CATCHER);
        js = (JavascriptExecutor) driver;
        String text = (String) js.executeScript("return arguments[0].value", billingNameField);

        if (text.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

}
