package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BillingPage {


    private WebDriver driver;

    private final By TO_BILLING_DATA_BUTTON_CATCHER = By.xpath("//*[@id=\"couponredeem__forms\"]/div[1]/div/div[2]/a");



    public BillingPage(WebDriver driver) {
        this.driver = driver;
    }



    public BillingDataPage navigateToBillingDataPage() {
        WebElement billingDataButton = driver.findElement(TO_BILLING_DATA_BUTTON_CATCHER);
        billingDataButton.click();

        return new BillingDataPage(driver);
    }

}
