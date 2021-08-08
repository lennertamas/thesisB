package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.SignInPage;
import pages.SignedInHomePage;

public class SignInTest extends BaseTest {

    @Test
    public void testSignIn() throws InterruptedException {
        writeFile.createSignUpDataFile();
        writeFile.writeToSignUpDataFile("seleniumtestera52@gmail.com","Richard Maven", "gemini");

        homePage.handlePopUp();
        SignInPage signInPage = homePage.navigateToSignIn();
        SignedInHomePage signedInHomePage = signInPage.fillSignIn();
        Thread.sleep(5000);
        homePage.handlePopUp();
        Assertions.assertTrue(signedInHomePage.validateIncoming());
    }

    @Test
    public void signOut() throws InterruptedException {
        writeFile.createSignUpDataFile();
        writeFile.writeToSignUpDataFile("seleniumtestera52@gmail.com","Richard Maven", "gemini");

        homePage.handlePopUp();
        SignInPage signInPage = homePage.navigateToSignIn();
        SignedInHomePage signedInHomePage = signInPage.fillSignIn();
        Thread.sleep(5000);
        homePage.handlePopUp();
        signedInHomePage.logOut();
        Assertions.assertTrue(signedInHomePage.validateLogout());
    }
}
