package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {


    private WebDriver driver;

    protected final By POPUP_CLOSER_CATCHER = By.xpath("//*[@id=\"wps_popup\"]/div/div[1]");
    private final By COOKIE_ACCEPT_BUTTON_CATCHER = By.id("CybotCookiebotDialogBodyButtonAccept");



    public HomePage(WebDriver driver) {
        this.driver = driver;
    }



    public SignInPage navigateToSignIn() {
        handlePopUp();
        clickLink("Bejelentkezés");
        return new SignInPage(driver);
    }


    public void handlePopUp() {
        WebElement popUpCloser = driver.findElement(POPUP_CLOSER_CATCHER);
        if (popUpCloser.isDisplayed()) {
            popUpCloser.click();
        }
    }


    public void acceptCookies() {
        WebElement cookieButton = driver.findElement(COOKIE_ACCEPT_BUTTON_CATCHER);
        if (cookieButton.isDisplayed()) {
            cookieButton.click();
        }
    }


    public void clickLink(String link) {
        driver.findElement(By.linkText(link)).click();
    }
}
