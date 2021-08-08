package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MobilPage {


    private WebDriver driver;

    private final By EBOOK_GROUP_CATCHER = By.xpath("//*[@id=\"6085457\"]/div/div[3]/div/div[3]/div/p[1]/a");



    public MobilPage(WebDriver driver) {
        this.driver = driver;
    }



    public EbookPage navigateToEbookPage () throws InterruptedException {
        HomePage homePage = new HomePage(driver);
        ComputerListPage computerListPage = new ComputerListPage(driver);
        WebElement ebookGroup = driver.findElement(EBOOK_GROUP_CATCHER);

        Thread.sleep(3000);
        homePage.handlePopUp();
        computerListPage.handleBodyCookie();
        homePage.handlePopUp();
        ebookGroup.click();

        return new EbookPage(driver);
    }
}
