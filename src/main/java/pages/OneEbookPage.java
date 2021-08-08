package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OneEbookPage {


    private WebDriver driver;

    private final By IN_CART_CATCHER = By.xpath("//*[@id=\"main-content\"]/article/div[1]/div[2]/div[3]/div[2]/div[3]/a");
    private final By TO_CART_CATCHER = By.xpath("//*[@id=\"popup-recommender\"]/div[1]/div[2]/div/div[3]");



    public OneEbookPage(WebDriver driver) {
        this.driver = driver;
    }



    public BillingPage navigateToBillingPage() throws InterruptedException {
        WebElement inCart = driver.findElement(IN_CART_CATCHER);
        inCart.click();

        Thread.sleep(1500);

        WebElement toCart = driver.findElement(TO_CART_CATCHER);
        toCart.click();

        return new BillingPage(driver);
    }

}
