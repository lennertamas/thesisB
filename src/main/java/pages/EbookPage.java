package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EbookPage {


    private WebDriver driver;

    private final By ONE_EBOOK_CATCHER = By.xpath("//*[@id=\"products\"]/div[4]/ul/li[1]/div");



    public EbookPage(WebDriver driver) {
        this.driver = driver;
    }



    public OneEbookPage navigateToOneEbookPage() {
        WebElement oneEbook = driver.findElement(ONE_EBOOK_CATCHER);
        oneEbook.click();
        return new OneEbookPage(driver);
    }

}
